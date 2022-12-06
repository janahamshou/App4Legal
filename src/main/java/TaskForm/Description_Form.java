package TaskForm;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Description_Form extends Base {

    public Description_Form(WebDriver browserDriver){
        super(browserDriver);
       // wait.until(ExpectedConditions.visibilityOfElementLocated());
    }

    //
    private By descr=By.xpath("//*[@id=\"task-description\"]/div/div[2]/div[1]");
    public Description_Form Description(String des){
        wait.until(ExpectedConditions.visibilityOfElementLocated(descr));
        WebElement descript = browser.findElement(descr);
        descript.sendKeys(des); ;
        return this;
    }

}
