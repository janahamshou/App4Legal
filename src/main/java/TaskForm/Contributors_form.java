package TaskForm;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Contributors_form extends Base {
    public Contributors_form(WebDriver browserDriver){
        super(browserDriver);
        //  wait.until(ExpectedConditions.visibilityOfElementLocated(titletask));
    }

    private By more=By.linkText("More Details");
    public Contributors_form moredetails(){
        wait.until(ExpectedConditions.elementToBeClickable(more));
        WebElement moreD = browser.findElement(more);
        moreD.click() ;
        return this;
    }


    public Contributors_form contributors(){
        System.out.print("We are contre ");
        String selected_user = "najib ghosh" ;
        int ind = 1 ;
        By cont_to_btn = By.xpath("/html/body/div[11]/div[2]/div/div[2]/div[6]/div[2]/div[2]/div/div[2]/span/button");
        System.out.print("We are in shared with");
        wait.until(ExpectedConditions.elementToBeClickable(cont_to_btn))  ;
        WebElement cont_btn = browser.findElement(cont_to_btn);
        cont_btn.click() ;


        By cont_to_lst = By.xpath("/html/body/div[13]/ul/li") ;
        wait.until(ExpectedConditions.visibilityOfElementLocated(cont_to_lst)) ;
        List<WebElement> cont_to = browser.findElements(cont_to_lst);

        for (WebElement group : cont_to) {
            System.out.println(group.getText()) ;
        }


        for (WebElement contre : cont_to) {
            if (!(contre.getText().equals(selected_user))) {
                ind +=1 ;
            }
            else {
                break ;
            }
        }


        String selected_cont_xpath =  "/html/body/div[13]/ul/li["+ind+"]/div";
        System.out.print(selected_cont_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selected_cont_xpath)))  ;
        WebElement cont_selected = browser.findElement(By.xpath(selected_cont_xpath));
        cont_selected.click() ;




        return this;
    }






}
