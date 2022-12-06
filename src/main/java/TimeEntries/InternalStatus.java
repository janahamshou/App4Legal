package TimeEntries;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class InternalStatus extends Base {
    public InternalStatus(WebDriver browserDriver) {
        super(browserDriver);
        // wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    public InternalStatus internalStatus() {
        By intstatus_dropdown = By.xpath("//*[@id=\"userActivityLogForm\"]/div[3]/div[2]/div[3]/div[2]/button");
        wait.until(ExpectedConditions.elementToBeClickable(intstatus_dropdown));
        WebElement is_dpd = browser.findElement(intstatus_dropdown);
        is_dpd.click();

        By internalstatus_class = By.xpath("//*[@id=\"bs-select-3\"]/ul/li");
        System.out.println("we are here");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(internalstatus_class));

        System.out.println("we are here now ");
        List<WebElement> intstat = browser.findElements(internalstatus_class);
        System.out.print("We are the champions");

        for (WebElement temp : intstat) {
            System.out.print(temp.getText());
        }
        System.out.print("We are the champions");

        int index = 0;
        String intst = "Reviewed";

        for (WebElement vales : intstat) {
            if (!(vales.getText().equals(intst))) {
                index += 1;
            } else {
                break;
            }
        }

        String internalstatus_xpath = "//*[@id=\"bs-select-3-" + index + "\"]";
        System.out.println(internalstatus_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(internalstatus_xpath)));
        WebElement is_selected = browser.findElement(By.xpath(internalstatus_xpath));
        is_selected.click();
        return this;
    }

}
