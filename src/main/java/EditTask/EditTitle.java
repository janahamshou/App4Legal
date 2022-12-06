package EditTask;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EditTitle extends Base {
    public EditTitle(WebDriver browserDriver) {
        super(browserDriver);
       // wait.until(ExpectedConditions.visibilityOfElementLocated());
    }


    private By edittitle = By.name("title");

    public EditTitle editTitle(String et) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(edittitle));
        WebElement title = browser.findElement(edittitle);
        title.clear();
        title.sendKeys(et);
        return this;
    }
}