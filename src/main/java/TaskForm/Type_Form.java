package TaskForm;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Type_Form extends Base {

    public Type_Form(WebDriver browserDriver){
        super(browserDriver);
        //wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    public Type_Form Type(){
        By task_type_dropdown = By.xpath("//*[@id=\"task-type\"]/div[2]");
        wait.until(ExpectedConditions.elementToBeClickable(task_type_dropdown)) ;
        WebElement tt_dpd= browser.findElement(task_type_dropdown) ;
        tt_dpd.click();

        By task_type_class = By.xpath("/html/body/div/div[2]/ul/li") ;
        System.out.println("we are here") ;
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(task_type_class)) ;
        System.out.println("we are here now ") ;
        List<WebElement> task_types_loc = browser.findElements(task_type_class);
        System.out.print("We are the champions") ;
        for (WebElement temp : task_types_loc) {
            System.out.print(temp.getText());
        }
        System.out.print("We are the champions") ;

        int index = 1 ;
        String task_type_req = "Translation" ;
        for (WebElement vals : task_types_loc) {
            if (!(vals.getText().equals(task_type_req))) {
                index+=1 ;
            }
            else {
                break ;
            }
        }

        String task_type_xpath = "/html/body/div/div[2]/ul/li["+ index +"]" ;
        System.out.print(task_type_xpath);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(task_type_xpath)))  ;
        WebElement tt_selected = browser.findElement(By.xpath(task_type_xpath));
        tt_selected.click() ;

        return this;
    }


}
