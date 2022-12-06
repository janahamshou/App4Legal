package EditTask;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Buttons extends Base {
    public Buttons(WebDriver browserDriver) {
        super(browserDriver);
}


    private By edittask = By.xpath("//*[@id=\"header-content\"]/div[2]/button[1]");

    public Buttons clickonedit() {
        wait.until(ExpectedConditions.elementToBeClickable(edittask));
        WebElement edit = browser.findElement(edittask);
        edit.click();
        return this;
    }




    private By user=By.linkText("T00000054");
    public Buttons clickuser(){
        wait.until(ExpectedConditions.elementToBeClickable(user));
        WebElement use= browser.findElement(user);
        use.click();
        return  this;
    }
    private By clickonmorefields = By.xpath("//*[@id=\"task-form\"]/div[4]/div/div[2]/a");

    public Buttons clickonmore() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickonmorefields));
        WebElement selectdocmat = browser.findElement(clickonmorefields);
        selectdocmat.click();
        return this;
    }
    private By setaspriv = By.xpath("//*[@id=\"private\"]");

    public Buttons Setasprivate() {
        wait.until(ExpectedConditions.elementToBeClickable(setaspriv));
        WebElement set = browser.findElement(setaspriv);
        set.click();
        return this;
    }
    private By saveonedit = By.xpath("//*[@id=\"save-task-btn\"]");

    public Buttons btsave1() {
        wait.until(ExpectedConditions.elementToBeClickable(saveonedit));
        WebElement save1 = browser.findElement(saveonedit);
        save1.click();
        return this;
    }

    private By cancel = By.xpath("//*[@id=\"task-modal\"]/div/div/div[3]/div/button");
    private By yess = By.xpath("//*[@id=\"confirmation-dialog-submit\"]");

    //private By clno= By.xpath("//*[@id=\"cancel-confirmation-dialog\"]");
    public Buttons Cancel() {
        wait.until(ExpectedConditions.elementToBeClickable(cancel));
        WebElement can = browser.findElement(cancel);
        can.click();
        wait.until(ExpectedConditions.elementToBeClickable(yess));
        WebElement clickyes = browser.findElement(yess);
        clickyes.click();
        //wait.until(ExpectedConditions.elementToBeClickable(clno));
        //WebElement clickno= browser.findElement(clno);
        //clickno.click();
        return this;
    }

    private By exitedit = By.xpath("//*[@id=\"task-modal\"]/div/div/div[3]/div/button");
    // private By clickonyess= By.xpath("//*[@id=\"confirmation-dialog-submit\"]");
    private By clickno = By.xpath("//*[@id=\"cancel-confirmation-dialog\"]");

    public Buttons Exit() {
        wait.until(ExpectedConditions.elementToBeClickable(exitedit));
        WebElement exi = browser.findElement(exitedit);
        exi.click();
        // wait.until(ExpectedConditions.elementToBeClickable(clickonyess));
        //WebElement clickyesed= browser.findElement(clickonyess);
        //clickyesed.click();
        wait.until(ExpectedConditions.elementToBeClickable(clickno));
        WebElement clickonno = browser.findElement(clickno);
        clickonno.click();
        return this;
    }
}
