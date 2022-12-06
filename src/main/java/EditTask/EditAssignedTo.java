package EditTask;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class EditAssignedTo extends Base {
    public EditAssignedTo(WebDriver browserDriver) {
        super(browserDriver);
      //  wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    //private By opendrop = By.xpath("//*[@id=\"assigne-to-id-wrapper\"]/span[2]");
    //private By selectfromdrop = By.xpath("//*[@id=\"assigne-to-id-wrapper\"]/span[1]/div/div[1]/div[3]");

    public EditAssignedTo AssignedTo() {
        System.out.print("We are in assignee hi");
        String selected_assignee = "najib ghosh" ;
        int ind = 1;
        By assigned_to_btn = By.xpath("//*[@id=\"assigne-to-id-wrapper\"]/span[2]");
        System.out.print("We are in assignee");
        wait.until(ExpectedConditions.elementToBeClickable(assigned_to_btn))  ;
        WebElement assigned_btn = browser.findElement(assigned_to_btn);
        assigned_btn.click() ;

        By assigned_to_lst = By.xpath("//*[@id=\"assigne-to-id-wrapper\"]/span[1]/div/div/div") ;
        wait.until(ExpectedConditions.visibilityOfElementLocated(assigned_to_lst)) ;
        List<WebElement> assigned_to = browser.findElements(assigned_to_lst);

        for (WebElement group : assigned_to) {
            System.out.println(group.getText()) ;
        }

        for (WebElement assignee : assigned_to) {
            if (!(assignee.getText().equals(selected_assignee))) {
                ind +=1 ;
            }
            else {
                break ;
            }
        }

        String selected_assignee_xpath =  "//*[@id=\"assigne-to-id-wrapper\"]/span[1]/div/div/div["+ind+"]";
        System.out.print(selected_assignee_xpath);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selected_assignee_xpath)))  ;
        WebElement assigned_selected = browser.findElement(By.xpath(selected_assignee_xpath));
        assigned_selected.click() ;

        return this;
    }
}