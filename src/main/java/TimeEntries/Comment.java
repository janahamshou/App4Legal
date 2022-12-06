package TimeEntries;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Comment extends Base {
    public Comment(WebDriver browserDriver) {
        super(browserDriver);
        // wait.until(ExpectedConditions.visibilityOfElementLocated());
    }

    private By cmnt = By.xpath("//*[@id=\"time-logs-comment\"]");

    public Comment addcomment(String comm) {
        WebElement addcomment = browser.findElement(cmnt);
        addcomment.sendKeys(comm);
        return this;
    }
}