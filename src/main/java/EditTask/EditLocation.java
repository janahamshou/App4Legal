package EditTask;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EditLocation extends Base {
    public EditLocation(WebDriver browserDriver) {
        super(browserDriver);
       // wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    private By searchlocation = By.xpath("//*[@id=\"location\"]");
    private By selectlocation = By.xpath("//*[@id=\"task-form\"]/div[5]/div[4]/div/div[1]/div[1]/span/div/div/div[1]");

    public EditLocation Location(String loc) {
        wait.until(ExpectedConditions.elementToBeClickable(searchlocation));
        WebElement location = browser.findElement(searchlocation);
        location.sendKeys(loc);
        wait.until(ExpectedConditions.elementToBeClickable(selectlocation));
        WebElement selectloc = browser.findElement(selectlocation);
        selectloc.click();
        return this;
    }
}
