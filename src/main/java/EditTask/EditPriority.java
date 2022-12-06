package EditTask;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class EditPriority extends Base {
    public EditPriority(WebDriver browserDriver) {
        super(browserDriver);
     //   wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    public EditPriority priorityedit() {
        By priority_dropdown = By.xpath("//*[@id=\"priority-wrapper\"]/div/div/div/button");
        wait.until(ExpectedConditions.elementToBeClickable(priority_dropdown));
        WebElement tt_dpd = browser.findElement(priority_dropdown);
        tt_dpd.click();

        By priority_class = By.xpath("//*[@id=\"bs-select-2\"]/ul/li/a/span");
        System.out.println("we are here");

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(priority_class));

        System.out.println("we are here now ");
        List<WebElement> priority = browser.findElements(priority_class);
        System.out.println();
        System.out.println();
        System.out.print("this is size");
        System.out.println(priority.size());
        System.out.println();


        for (WebElement temp : priority) {
            System.out.print(temp.getText());
        }
        System.out.print("We are the champions");

        int index = 0;
        String prio = "Critical";

        for (WebElement vales : priority) {
            if (!(vales.getText().equals(prio))) {
                index += 1;
            } else {
                break;
            }
        }
        String priority_xpath = "/html/body/div[11]/div/div/div/div/div[2]/div/form/div[1]/div[1]/div[6]/div/div/div/div/div/div[2]/ul/li["+index+"]/a/span";
        System.out.println(priority_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(priority_xpath)));
        WebElement tt_selected = browser.findElement(By.xpath(priority_xpath));
        tt_selected.click();

        return this;
    }
}
