package EditTask;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class EditRelatedMatter extends Base {
    public EditRelatedMatter(WebDriver browserDriver) {
        super(browserDriver);
        //   wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    private By relmatter = By.xpath("//*[@id=\"required-fields-task-demo\"]/div[3]/div/div[1]/span[2]");
    private By selectdrop = By.xpath("//*[@id=\"required-fields-task-demo\"]/div[3]/div/div[1]/span[1]/div/div[1]/div[3]");

    public EditRelatedMatter relatedmatter() {
        System.out.print("We are in related matter hi");
        String selected_matter= "M00000004: karim vs najib" ;
        int ind = 1;
        By matter_to_btn = By.xpath("//*[@id=\"required-fields-task-demo\"]/div[3]/div/div[1]/span[2]");
        wait.until(ExpectedConditions.elementToBeClickable(matter_to_btn))  ;
        WebElement assigned_btn = browser.findElement(matter_to_btn);
        assigned_btn.click() ;
        By matter_to_lst = By.xpath("//*[@id=\"required-fields-task-demo\"]/div[3]/div/div[1]/span[1]/div/div/div") ;
        wait.until(ExpectedConditions.visibilityOfElementLocated(matter_to_lst)) ;
        List<WebElement> matter_to = browser.findElements(matter_to_lst);

        for (WebElement group : matter_to) {
            System.out.println(group.getText()) ;
        }

        for (WebElement assignee : matter_to) {
            if (!(assignee.getText().equals(selected_matter))) {
                ind +=1 ;
            }
            else {
                break ;
            }
        }

        String selected_matter_xpath ="//*[@id=\"required-fields-task-demo\"]/div[3]/div/div[1]/span[1]/div/div/div["+ind+"]";
        System.out.print(selected_matter_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selected_matter_xpath)))  ;
        WebElement assigned_selected = browser.findElement(By.xpath(selected_matter_xpath));
        assigned_selected.click() ;
        return this;
    }

}
