package TaskGrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TasksGridBase {
    WebDriver browser;
    WebDriverWait wait;
    String  getResults ;
    public TasksGridBase(WebDriver browserDriver){
        browser = browserDriver;
        wait = new WebDriverWait(browser, Duration.ofSeconds(150));

    }


}

