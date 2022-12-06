package TaskForm;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AssignedTo_Form extends Base {

    public AssignedTo_Form(WebDriver browserDriver){
        super(browserDriver);
     //   wait.until(ExpectedConditions.visibilityOfElementLocated());
    }

    public AssignedTo_Form Assgnto(){
        System.out.println("We are in assignee hi");
        String selected_assignee = "karim ghosh" ;// /html/body/div[10]/div[2]/div/div[2]/div[3]/div[1]/span/button/span[1]
        int ind = 1 ;
        By assigned_to_btn = By.xpath("/html/body/div[11]/div[2]/div/div[2]/div[3]/div[1]/span/button");
        System.out.println("We are in assignee");
        wait.until(ExpectedConditions.elementToBeClickable(assigned_to_btn))  ;
        WebElement assigned_btn = browser.findElement(assigned_to_btn);
        assigned_btn.click() ;


        By assigned_to_lst = By.xpath("//*[@id=\"pv_id_3_list\"]/li") ;
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


        String selected_assignee_xpath =  "//*[@id=\"pv_id_3_list\"]/li["+ ind +"]/div";
        System.out.println(selected_assignee_xpath);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selected_assignee_xpath)))  ;
        WebElement assigned_selected = browser.findElement(By.xpath(selected_assignee_xpath));
        assigned_selected.click() ;
        return this;
    }
}
