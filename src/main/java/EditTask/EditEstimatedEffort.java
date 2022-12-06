package EditTask;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EditEstimatedEffort extends Base {
    public EditEstimatedEffort(WebDriver browserDriver) {
        super(browserDriver);
        //wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    private By clickonmorefields = By.xpath("//*[@id=\"task-form\"]/div[4]/div/div[2]/a");

    public EditEstimatedEffort clickonmore() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickonmorefields));
        WebElement selectdocmat = browser.findElement(clickonmorefields);
        selectdocmat.click();
        return this;
    }

    private By estimated = By.xpath("//*[@id=\"estimatedEffortHour\"]");

    public EditEstimatedEffort estimatedeffort(String eff) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(estimated));
        WebElement esteff = browser.findElement(estimated);
        esteff.sendKeys(eff);
        return this;
    }

}
