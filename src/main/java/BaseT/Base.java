package BaseT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;

public class Base {
  public   WebDriver browser;
   public WebDriverWait wait;
    String  getResults ;

    public Base(WebDriver browserDriver){
        browser = browserDriver;
        wait = new WebDriverWait(browser, Duration.ofSeconds(150));

    }


}
