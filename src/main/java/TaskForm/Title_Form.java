package TaskForm;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Title_Form extends Base {

    public Title_Form(WebDriver browserDriver){
        super(browserDriver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(titletask));
    }

    private By titletask =By.xpath("//*[@id=\"required-task-fields\"]/div[1]/input");

    public Title_Form Title(String TitleTest){

        wait.until(ExpectedConditions.visibilityOfElementLocated(titletask));
        WebElement TaskTitles = browser.findElement(titletask);
        TaskTitles.clear();
        TaskTitles.sendKeys(TitleTest);

        return this;
    }

}
