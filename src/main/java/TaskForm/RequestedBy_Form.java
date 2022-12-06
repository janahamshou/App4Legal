package TaskForm;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class RequestedBy_Form extends Base {

    public RequestedBy_Form(WebDriver browserDriver){
        super(browserDriver);
       // wait.until(ExpectedConditions.visibilityOfElementLocated());
    }

    public RequestedBy_Form requestedBy() {
        System.out.println("We are in requested by");
        String selected_requested = "karim ghosh" ;
        int ind = 1 ;


        By requested_by_btn = By.xpath("/html/body/div[11]/div[2]/div/div[2]/div[3]/div[4]/span/button");


        //Find element by link text and store in variable "Element"
        WebElement Element = browser.findElement(requested_by_btn);

        JavascriptExecutor js = (JavascriptExecutor) browser;

        js.executeScript("arguments[0].scrollIntoView();", Element);

        System.out.println("We are in requested by");

        WebElement requested_btn = browser.findElement(requested_by_btn);
        JavascriptExecutor Js = (JavascriptExecutor)browser;
        js.executeScript("arguments[0].click()",requested_btn);
        //  requested_btn.click();


        By requested_to_lst = By.xpath("/html/body/div[13]/ul/li") ;
        wait.until(ExpectedConditions.visibilityOfElementLocated(requested_to_lst)) ;
        List<WebElement> requested_by = browser.findElements(requested_to_lst);

        for (WebElement group : requested_by) {
            System.out.println(group.getText()) ;
        }


        for (WebElement request : requested_by) {
            if (!(request.getText().equals(selected_requested))) {
                ind +=1 ;
            }
            else {
                break ;
            }
        }


        String selected_requested_xpath =  "//*[@id=\"pv_id_4_list\"]/li["+ind+"]/div";
        System.out.print(selected_requested_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selected_requested_xpath)))  ;
        WebElement requested_selected = browser.findElement(By.xpath(selected_requested_xpath));
        requested_selected.click() ;
        return this;

    }
}
