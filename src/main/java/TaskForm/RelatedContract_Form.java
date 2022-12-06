package TaskForm;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class RelatedContract_Form extends Base {
    public RelatedContract_Form(WebDriver browserDriver){
        super(browserDriver);
     //   wait.until(ExpectedConditions.visibilityOfElementLocated(titletask));
    }
private By checkcont=By.xpath("//*[@id=\"pv_id_5_0_content\"]/div/div[1]/div[2]/div");
   /* public RelatedContract_Form checkContract(){


        wait.until(ExpectedConditions.elementToBeClickable(checkcont));
        WebElement checked = browser.findElement(checkcont);
        checked.click() ;

        return this;
    }*/

    public RelatedContract_Form Relatedcontract(){
        System.out.println("contract");
        String selected_requested = "CT55: CON1" ;
        int ind = 1;


        By contract_by_btn = By.xpath("/html/body/div[11]/div[2]/div/div[2]/div[6]/div[1]/div[2]/div/div[2]/div/span/button");


        //Find element by link text and store in variable "Element"
        WebElement Element = browser.findElement(checkcont);

        JavascriptExecutor jsM = (JavascriptExecutor) browser;

        jsM.executeScript("arguments[0].scrollIntoView();", Element);

        System.out.println("Matter");

        WebElement Matter_btn = browser.findElement(checkcont);
        JavascriptExecutor Js = (JavascriptExecutor)browser;
        jsM.executeScript("arguments[0].click()",Matter_btn);
        //  requested_btn.click();
        wait.until(ExpectedConditions.elementToBeClickable(contract_by_btn));
        WebElement checked = browser.findElement(contract_by_btn);
        checked.click() ;


        By requested_to_lst = By.xpath("/html/body/div[15]/ul/li") ;
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


        String selected_contract_xpath =  "/html/body/div[15]/ul/li["+ind+"]";
        System.out.print(selected_contract_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selected_contract_xpath)))  ;
        WebElement M_selected = browser.findElement(By.xpath(selected_contract_xpath));
        M_selected.click();


        return  this;
    }




}
