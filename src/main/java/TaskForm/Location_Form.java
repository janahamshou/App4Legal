package TaskForm;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Location_Form extends Base {
    public Location_Form(WebDriver browserDriver){
        super(browserDriver);
        //  wait.until(ExpectedConditions.visibilityOfElementLocated(titletask));
    }
    private By more=By.linkText("More Details");
    public Location_Form moredetails(){
        wait.until(ExpectedConditions.elementToBeClickable(more));
        WebElement moreD = browser.findElement(more);
        moreD.click() ;
        return this;
    }
    public Location_Form Select_location(){
        System.out.print("We are contre ");
        String selected_location = "Bint Jbeil" ;
        int indL = 1 ;
        By location_to_btn = By.xpath("/html/body/div[11]/div[2]/div/div[2]/div[6]/div[2]/div[2]/div/div[4]/div[2]/div[2]");
        System.out.println("We are in shared with");
        wait.until(ExpectedConditions.elementToBeClickable(location_to_btn))  ;
        WebElement locat_btn = browser.findElement(location_to_btn);
        locat_btn.click() ;

        By location_to_lst = By.xpath("/html/body/div[13]/div[2]/ul/li") ;
        wait.until(ExpectedConditions.visibilityOfElementLocated(location_to_lst)) ;
        List<WebElement> location_to = browser.findElements(location_to_lst);

        for (WebElement group : location_to) {
            System.out.println(group.getText()) ;
        }


        for (WebElement locationS : location_to) {
            if (!(locationS.getText().equals(selected_location))) {
                indL +=1 ;
            }
            else {
                break ;
            }
        }

// /html/body/div[13]/div[2]/ul/li[1]
        String selected_loc_xpath =  "/html/body/div[13]/div[2]/ul/li["+indL+"]/div";
        System.out.println(selected_loc_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selected_loc_xpath)))  ;
        WebElement location_selected = browser.findElement(By.xpath(selected_loc_xpath));
        location_selected.click() ;




        return this;
    }




}
