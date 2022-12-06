package EditTask;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class EditSharedWith extends Base {


    public EditSharedWith(WebDriver browserDriver) {
        super(browserDriver);

    }
    public EditSharedWith share(){

        String selected_sharedwith = "najib ghosh" ;
        int ind = 1;
        By share_to_btn = By.xpath("//*[@id=\"lookupTaskUsers\"]");

        wait.until(ExpectedConditions.elementToBeClickable(share_to_btn))  ;
        WebElement share_btn = browser.findElement(share_to_btn);
        share_btn.click() ;

        By share_to_lst = By.xpath("//*[@id=\"task-form\"]/div[5]/div[6]/div/div/div[2]/div[1]/span/div/div/div") ;
        wait.until(ExpectedConditions.visibilityOfElementLocated(share_to_lst)) ;
        List<WebElement> assigned_to = browser.findElements(share_to_lst);

        for (WebElement group : assigned_to) {
            System.out.println(group.getText()) ;
        }

        for (WebElement assignee : assigned_to) {
            if (!(assignee.getText().equals(selected_sharedwith))) {
                ind +=1 ;
            }
            else {
                break ;
            }
        }

        String selected_share_xpath =  "//*[@id=\"task-form\"]/div[5]/div[6]/div/div/div[2]/div[1]/span/div/div/div["+ind+"]";
        System.out.print(selected_share_xpath);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selected_share_xpath)))  ;
        WebElement share_selected = browser.findElement(By.xpath(selected_share_xpath));
        share_selected.click() ;
        return this;
    }



}
