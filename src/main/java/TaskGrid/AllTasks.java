package TaskGrid;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AllTasks extends TasksGridBase{
    public AllTasks(WebDriver browserDriver) {
        super(browserDriver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(togrid));
    }
    private By togrid = By.xpath("//*[@id=\"top-nav-item-list\"]/li[7]/a");
    public AllTasks Taskgrid(){
        wait.until(ExpectedConditions.elementToBeClickable(togrid));
        WebElement grid= browser.findElement(togrid);
        grid.click();
        return this;
    }
    public  AllTasks Alltask(){
        int ct=0;

        By buttons = By.className("btn-default");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(buttons)) ;
        List<WebElement> button_list = browser.findElements(buttons );

        for (WebElement btn: button_list) {
            System.out.println(btn.getText()) ;
        }

        for (WebElement btn: button_list) {
            if (!(btn.getText().equals("All Tasks"))) {
                ct +=1 ;
            }
            else {
                break ;
            }
        }

        String alltest_xpath=  "//*[@id=\"grid-header-fixed-navbar\"]/div/div/div/div[1]/div/a[" + ct +"]";
        System.out.println(alltest_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(alltest_xpath)))  ;
        WebElement all_test = browser.findElement(By.xpath(alltest_xpath));
        JavascriptExecutor js = (JavascriptExecutor)browser;
        js.executeScript("arguments[0].click()",all_test);
        return this;
    }
}