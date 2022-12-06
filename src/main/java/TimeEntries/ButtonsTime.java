package TimeEntries;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ButtonsTime extends Base {
    public ButtonsTime(WebDriver browserDriver) {
        super(browserDriver);
        // wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    private By addtime = By.xpath("//*[@id=\"side-section\"]/div[3]/div[1]/a[1]/i");
    public ButtonsTime clickonplus() {
        wait.until(ExpectedConditions.elementToBeClickable(addtime));
        WebElement plus = browser.findElement(addtime);
        plus.click();

        return this;
    }
    private By more_fieldtiime = By.xpath("//*[@id=\"userActivityLogForm\"]/div[4]/div/a");

    public ButtonsTime clickonmore() {
        wait.until(ExpectedConditions.elementToBeClickable(more_fieldtiime));
        WebElement more = browser.findElement(more_fieldtiime);
        more.click();
        return this;
    }
    private By savet = By.xpath("//*[@id=\"add-timer-dialog-submit\"]");
    public ButtonsTime save() {
        wait.until(ExpectedConditions.elementToBeClickable(savet));
        WebElement savetime = browser.findElement(savet);
        savetime.click();
        return this;
    }

    private By saveanddupl = By.xpath("//*[@id=\"add-timer-duplicate-button\"]");

    public ButtonsTime saveandduplicate() {
        wait.until(ExpectedConditions.elementToBeClickable(saveanddupl));
        WebElement savedtime = browser.findElement(saveanddupl);
        savedtime.click();
        return this;
    }

    private By btncancel = By.xpath("//*[@id=\"add-edit-time-log\"]/div/div/div[3]/button");
    // private By btyes = By.xpath("//*[@id=\"confirmation-dialog-submit\"]");
    private By btno = By.xpath("//*[@id=\"cancel-confirmation-dialog\"]");

    public ButtonsTime cancel() {
        wait.until(ExpectedConditions.elementToBeClickable(btncancel));
        WebElement canceltime = browser.findElement(btncancel);
        canceltime.click();

     /*   wait.until(ExpectedConditions.elementToBeClickable(btyes));
        WebElement yess= browser.findElement(btyes);
       yess.click();*/
        wait.until(ExpectedConditions.elementToBeClickable(btno));
        WebElement noo= browser.findElement(btno);
        noo.click();
        return this;
    }
}


