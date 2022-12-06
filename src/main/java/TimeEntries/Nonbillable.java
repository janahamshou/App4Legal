package TimeEntries;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Nonbillable extends Base {
    public Nonbillable (WebDriver browserDriver) {
        super(browserDriver);
        // wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    private By nonbill = By.xpath("//*[@id=\"billable\"]");
    private By rpt = By.xpath("//*[@id=\"is-repeat\"]");
    public Nonbillable nonbillabletime() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nonbill));
        WebElement nonbillable = browser.findElement(nonbill);
        nonbillable.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(rpt));
        WebElement repeat = browser.findElement(rpt);
        repeat.click();
        return this;
    }
}
