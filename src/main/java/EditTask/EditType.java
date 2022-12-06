package EditTask;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class EditType extends Base {
    public EditType(WebDriver browserDriver) {
        super(browserDriver);
      //  wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    public EditType edittype() {
        By edit_task_type_dropdown = By.xpath("//*[@id=\"type-wrapper\"]/div/div[1]/div/button");
        wait.until(ExpectedConditions.elementToBeClickable(edit_task_type_dropdown));
        WebElement tt_dpd = browser.findElement(edit_task_type_dropdown);
        tt_dpd.click();

        By edit_task_type_class = By.xpath("//*[@id=\"bs-select-1\"]/ul/li");
        System.out.println("we are here");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(edit_task_type_class));
        System.out.println("we are here now ");
        List<WebElement> task_types_loc = browser.findElements(edit_task_type_class);
        System.out.print("We are the champions");
        for (WebElement temp : task_types_loc) {
            System.out.print(temp.getText());
        }
        System.out.print("We are the champions");

        int index = 0;
        String task_type_req = "HR related";
        for (WebElement vals : task_types_loc) {
            if (!(vals.getText().equals(task_type_req))) {
                index += 1;
            } else {
                break;
            }
        }

        String edit_task_type_xpath = "//*[@id=\"bs-select-1-" + index + "\"]";
        System.out.print(edit_task_type_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(edit_task_type_xpath)));
        WebElement tt_selected = browser.findElement(By.xpath(edit_task_type_xpath));
        tt_selected.click();

        return this;
    }

}
