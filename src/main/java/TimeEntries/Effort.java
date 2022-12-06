package TimeEntries;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Effort extends Base {
    public Effort(WebDriver browserDriver) {
        super(browserDriver);
        // wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    private By Effort = By.xpath("//*[@id=\"effectiveEffortHour\"]");
public Effort effort(String effo) {
    wait.until(ExpectedConditions.visibilityOfElementLocated(Effort));
    WebElement effort = browser.findElement(Effort);
    effort.sendKeys(effo);
return this;
}
}