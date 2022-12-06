package HomePage;

import BaseT.Base;
import TaskGrid.AllTasks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends Base {
    public HomePage(WebDriver browserDriver) {
        super(browserDriver);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(navbar));
        wait.until(ExpectedConditions.elementToBeClickable(togrid));
    }

    private By navbar =By.id("top-links-navbar-collapse-2");
    private By dashboard = By.xpath("/html/body/div[6]/div[1]/nav/div/ul/li") ;
    private By itTask=By.xpath("//*[@id=\"top-menu-add-button-task\"]/a");

    private By togrid = By.xpath("//*[@id=\"top-nav-item-list\"]/li[7]/a");
    private By clickonalltasks=By.xpath("//*[@id=\"grid-header-fixed-navbar\"]/div/div/div/div[1]/div/a[2]");

    private By set=By.xpath("//*[@id=\"top-links-navbar-collapse-2\"]/div/div/ul/li[6]/a");
    private By systemsetting=By.xpath("//*[@id=\"top-links-navbar-collapse-2\"]/div/div/ul/li[6]/ul/li[1]/a");


    public HomePage btnew() {
        By newbt=By.id("top-menu-add-button");
        wait.until(ExpectedConditions.elementToBeClickable(newbt));
        WebElement addnew= browser.findElement(newbt);
        JavascriptExecutor js = (JavascriptExecutor)browser;
        js.executeScript("arguments[0].click()",addnew);
        return this;

    }



    public HomePage NewTask(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(itTask));
        WebElement tasknew= browser.findElement(itTask);
        JavascriptExecutor js = (JavascriptExecutor)browser;
        js.executeScript("arguments[0].click()",tasknew);
        return this;
    }



    public HomePage Taskgrid(){
        wait.until(ExpectedConditions.elementToBeClickable(togrid));
        WebElement grid= browser.findElement(togrid);
        grid.click();
        return this;
    }
}
