package BaseT;
import Login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseDriver{
 public   WebDriver browser;


    @BeforeSuite
    @Parameters({"email","password"})
    public void InitializeDriver(String email,String password) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://site.app4legal.com/users/login.php");


        LoginPage login = new LoginPage(browser);
        login.setemailaddress(email)
                .setinstance()
                .setemailpass(password);
    }
}
