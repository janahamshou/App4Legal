package EditTask;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class EditRequestedby extends Base {
    public EditRequestedby(WebDriver browserDriver) {
        super(browserDriver);
      //  wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    private By opendropdown = By.xpath("//*[@id=\"reporter-wrapper\"]/div[1]/div[1]/span[2]");
    private By selectfromdropdown = By.xpath("//*[@id=\"reporter-wrapper\"]/div[1]/div[1]/span[1]/div/div[1]/div[3]");

    public EditRequestedby requestedbyedit() {
        System.out.println("We are in requested by");
        String selected_requester = "najib ghosh" ;
        int ind = 1;
        By requested_by_btn = By.xpath("//*[@id=\"reporter-wrapper\"]/div[1]/div[1]/span[2]");

        wait.until(ExpectedConditions.elementToBeClickable(requested_by_btn))  ;
        WebElement req_btn = browser.findElement(requested_by_btn);
        req_btn.click() ;


        By requested_to_lst = By.xpath("//*[@id=\"reporter-wrapper\"]/div[1]/div[1]/span[1]/div/div/div") ;
        wait.until(ExpectedConditions.visibilityOfElementLocated(requested_to_lst)) ;
        List<WebElement> request_to = browser.findElements(requested_to_lst);

        for (WebElement group : request_to) {
            System.out.println(group.getText()) ;
        }


        for (WebElement assignee : request_to) {
            if (!(assignee.getText().equals(selected_requester))) {
                ind +=1 ;
            }
            else {
                break ;
            }
        }

        String selected_reuester_xpath =  "//*[@id=\"reporter-wrapper\"]/div[1]/div[1]/span[1]/div/div/div["+ind+"]";
        System.out.print(selected_reuester_xpath);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selected_reuester_xpath)))  ;
        WebElement assigned_selected = browser.findElement(By.xpath(selected_reuester_xpath));
        assigned_selected.click() ;
        return this;
    }
}
