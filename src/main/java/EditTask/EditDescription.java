package EditTask;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EditDescription extends Base {
    public EditDescription(WebDriver browserDriver) {
        super(browserDriver);
      //  wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    private By descrip=By.xpath("//*[@id=\"description_ifr\"]");
    public EditDescription description(String des){
        wait.until(ExpectedConditions.visibilityOfElementLocated(descrip));
        WebElement descri = browser.findElement(descrip);
        descri.sendKeys(des);
        int size = browser.findElements(By.tagName("iframe")).size();
        System.out.println("Total Frames --" + size);
        browser.switchTo().frame(1);
        size = browser.findElements(By.tagName("iframe")).size();
        // prints the total number of frames inside outer frame
        System.out.println("Total Frames --" + size);
        WebElement descrip =  browser.findElement(By.id("tinymce"));
        descrip.sendKeys("test");
        browser.switchTo().defaultContent();
        return this;
    }
}