package EditTask;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Checklist_edit extends Base {
    public Checklist_edit(WebDriver browserDriver) {
        super(browserDriver);
    }
    private By addchecklist = By.xpath("//*[@id=\"add-item\"]");
    private By addch = By.xpath("//*[@id=\"txt-checklist-item\"]");
    private By savech = By.xpath("//*[@id=\"submit-addition\"]");

    public Checklist_edit checklist(String checktest) {
        wait.until(ExpectedConditions.elementToBeClickable(addchecklist));
        WebElement add = browser.findElement(addchecklist);
        add.click();

        WebElement newchecklist = browser.findElement(addch);
        newchecklist.sendKeys(checktest);

        wait.until(ExpectedConditions.elementToBeClickable(savech));
        WebElement save = browser.findElement(savech);
        save.click();
        return this;
    }
    private By check=By.xpath("//*[@id=\"chk-item-33\"]");
    public Checklist_edit checkthechecklist(){
        wait.until(ExpectedConditions.elementToBeClickable(check));
        WebElement ch = browser.findElement(check);
        ch.click();
        return this;
    }
    private By deletecheck=By.xpath("//*[@id=\"checklist-item-33\"]/div[2]/a");
    private By delyes=By.xpath("//*[@id=\"confirmation-dialog-submit\"]");
    //private By delno=By.xpath("//*[@id=\"cancel-confirmation-dialog\"]");
    public Checklist_edit deletethechecklist(){
        wait.until(ExpectedConditions.elementToBeClickable(deletecheck));
        WebElement del = browser.findElement(deletecheck);
        del.click();
        wait.until(ExpectedConditions.elementToBeClickable(delyes));
        WebElement dele = browser.findElement(delyes);
        dele.click();
        /*wait.until(ExpectedConditions.elementToBeClickable(delno));
        WebElement delete = browser.findElement(delno);
        delete.click();*/
        return this;
    }
    private By deleteallcheck=By.xpath("//*[@id=\"delete-all-items\"]");
    private By yesdelall=By.xpath("//*[@id=\"confirmation-dialog-submit\"]");
    // private By nodelall=By.xpath("//*[@id=\"cancel-confirmation-dialog\"]");
    public Checklist_edit deleteallthechecklist(){
        wait.until(ExpectedConditions.elementToBeClickable(deleteallcheck));
        WebElement delall = browser.findElement(deleteallcheck);
        delall.click();
        wait.until(ExpectedConditions.elementToBeClickable(yesdelall));
        WebElement deleteall = browser.findElement(yesdelall);
        deleteall.click();
       /* wait.until(ExpectedConditions.elementToBeClickable(nodelall));
        WebElement deletealln = browser.findElement(nodelall);
        deletealln.click();*/
        return this;
    }
}


