package EditTask;


import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Addnewlocation_Edit extends Base {
    public Addnewlocation_Edit(WebDriver browserDriver) {
        super(browserDriver);
        //wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    private By addloc = By.xpath("//*[@id=\"task-form\"]/div[5]/div[4]/div/div[1]/div[2]/a");
    private By addlocationname = By.xpath("//*[@id=\"field-name\"]");

    public Addnewlocation_Edit  addlocationedit(String loc) {
        wait.until(ExpectedConditions.elementToBeClickable(addloc));
        WebElement selectloc = browser.findElement(addloc);
        selectloc.click();
        wait.until(ExpectedConditions.elementToBeClickable(addlocationname));
        WebElement addloca = browser.findElement(addlocationname);
        addloca.sendKeys(loc);
        return this;
    }

    private By savel = By.xpath("//*[@id=\"administration-dialog-submit\"]");
    private By cancello = By.xpath("/html/body/div[14]/div/div/div/div/div[3]/button");

    public Addnewlocation_Edit  savelocation() {
        wait.until(ExpectedConditions.elementToBeClickable(savel));
        WebElement saveloc = browser.findElement(savel);
        saveloc.click();
        return this;
    }

    private By yesloc = By.xpath("//*[@id=\"confirmation-dialog-submit\"]");
    private By noloc = By.xpath("//*[@id=\"cancel-confirmation-dialog\"]");

    public Addnewlocation_Edit  CancelLocation() {
        wait.until(ExpectedConditions.elementToBeClickable(cancello));
        WebElement canceloc = browser.findElement(cancello);
        canceloc.click();
        wait.until(ExpectedConditions.elementToBeClickable(yesloc));
        WebElement loc = browser.findElement(yesloc);
        loc.click();
        wait.until(ExpectedConditions.elementToBeClickable(noloc));
        WebElement loca = browser.findElement(noloc);
        loca.click();
        return this;
    }

}
