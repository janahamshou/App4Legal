package EditTask;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Comment_edit extends Base {
    public Comment_edit(WebDriver browserDriver) {
        super(browserDriver);
        //   wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    private By clickoncomment = By.xpath("//*[@id=\"header-content\"]/div[2]/button[2]");
    private By cmnt = By.xpath("//*[@id=\"cke_1_contents\"]/iframe");
    private By addcmnt = By.xpath("//*[@id=\"save-comment\"]");

    public Comment_edit comment(String comm) {


        wait.until(ExpectedConditions.elementToBeClickable(clickoncomment));
        WebElement clickoncmnt = browser.findElement(clickoncomment);
        clickoncmnt.click();

        wait.until(ExpectedConditions.elementToBeClickable(cmnt));
        WebElement addcomment = browser.findElement(cmnt);
        addcomment.sendKeys(comm);
        int size = browser.findElements(By.tagName("iframe")).size();
        System.out.println("Total Frames --" + size);
        browser.switchTo().frame(1);
        size = browser.findElements(By.tagName("iframe")).size();
        // prints the total number of frames inside outer frame
        System.out.println("Total Frames --" + size);
        WebElement cmnt =  browser.findElement(By.xpath("/html/body"));
        cmnt.sendKeys("test");
        browser.switchTo().defaultContent();

        wait.until(ExpectedConditions.elementToBeClickable(addcmnt));
        WebElement add = browser.findElement(addcmnt);
        add.click();
        return this;
    }

    private By delcmnt = By.xpath("//*[@id=\"comment-20\"]/div[1]/span[2]/a[2]");

    public Comment_edit deletecommnet() {
        wait.until(ExpectedConditions.elementToBeClickable(delcmnt));
        WebElement del = browser.findElement(delcmnt);
        del.click();
        return this;
    }

    private By editcmnt = By.xpath("//*[@id=\"comment-20\"]/div[1]/span[2]/a[1]");
    private By saveeditedcmnt=By.xpath("//*[@id=\"form-submit\"]");

    public Comment_edit editcommnet(String commnt) {
        wait.until(ExpectedConditions.elementToBeClickable(editcmnt));
        WebElement editt = browser.findElement(editcmnt);
        editt.click();
        wait.until(ExpectedConditions.elementToBeClickable(cmnt));
        WebElement addcomment = browser.findElement(cmnt);
        addcomment.sendKeys(commnt);
        int size = browser.findElements(By.tagName("iframe")).size();
        System.out.println("Total Frames --" + size);
        browser.switchTo().frame(1);
        size = browser.findElements(By.tagName("iframe")).size();
        // prints the total number of frames inside outer frame
        System.out.println("Total Frames --" + size);
        WebElement cment =browser.findElement(By.xpath("/html/body"));
        cment.clear();
        cment.sendKeys("test2");
        browser.switchTo().defaultContent();
        return this;
    }
    public Comment_edit saveed(){
        wait.until(ExpectedConditions.elementToBeClickable(saveeditedcmnt));
        WebElement saveedit = browser.findElement(saveeditedcmnt);
        saveedit.click();
        return this;
    }
    private By clickcan=By.xpath("//*[@id=\"task-comment-form\"]/div/div/div[3]/button");
    public Comment_edit canceledit(){
        wait.until(ExpectedConditions.elementToBeClickable(clickcan));
        WebElement cancedit = browser.findElement(clickcan);
        cancedit.click();
        return this;
    }

}
