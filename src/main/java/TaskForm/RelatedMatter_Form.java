package TaskForm;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class RelatedMatter_Form extends Base {

    public RelatedMatter_Form(WebDriver browserDriver){
        super(browserDriver);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(titletask));
    }

    public RelatedMatter_Form RelatedMatter(){
        System.out.println("Matter");
        String selected_requested = "M0000005: testt" ;
        int ind = 1;


        By Matter_by_btn = By.xpath("/html/body/div[11]/div[2]/div/div[2]/div[6]/div[1]/div[2]/div/div[2]/div/span/button");


        //Find element by link text and store in variable "Element"
        WebElement Element = browser.findElement(Matter_by_btn);

        JavascriptExecutor jsM = (JavascriptExecutor) browser;

        jsM.executeScript("arguments[0].scrollIntoView();", Element);

        System.out.println("Matter");

        WebElement Matter_btn = browser.findElement(Matter_by_btn);
        JavascriptExecutor Js = (JavascriptExecutor)browser;
        jsM.executeScript("arguments[0].click()",Matter_btn);
        //  requested_btn.click();


        By requested_to_lst = By.xpath("/html/body/div[13]/ul/li") ;
        wait.until(ExpectedConditions.visibilityOfElementLocated(requested_to_lst)) ;
        List<WebElement> R_Matter = browser.findElements(requested_to_lst);

        for (WebElement groupM : R_Matter) {
            System.out.println(groupM.getText()) ;
        }


        for (WebElement request : R_Matter) {
            if (!(request.getText().equals(selected_requested))) {
                ind +=1 ;
            }
            else {
                break ;
            }
        }


        String selected_Matter_xpath =  "/html/body/div[13]/ul/li["+ind+"]";
        System.out.print(selected_Matter_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selected_Matter_xpath)))  ;
        WebElement M_selected = browser.findElement(By.xpath(selected_Matter_xpath));
        M_selected.click();


        return  this;
    }
}
