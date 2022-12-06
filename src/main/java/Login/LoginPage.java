package Login;
import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends Base {

    private By emailaddressT=By.name("email");
    private By next1=By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[1]/div[2]/div[2]/div[1]/div/div[2]/button");
    private By pass1=By.name("password");
    private By instance1=By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[1]/div[2]/div[2]/div[1]/div/div[1]/div/div[2]/div/div/div/div/div/div[2]/div[1]");
    private By signup1=By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[1]/div[2]/div[2]/div[1]/div/div[2]/button[2]");

    public LoginPage(WebDriver browserDriver) {
        super (browserDriver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailaddressT));

    }

    public void Runing(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://site.app4legal.com/users/login.php");

        System.out.println("Given") ;
    }



    public LoginPage setemailaddress(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailaddressT));
        WebElement emailbox = browser.findElement(emailaddressT);
        emailbox.clear();
        emailbox.sendKeys(email);
        WebElement Buttonnext = browser.findElement(next1);
        Buttonnext.click();
        return this;
    }
    public LoginPage setinstance() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(instance1));
        WebElement instance = browser.findElement(instance1);
        instance.click();
        return this;
    }
    public LoginPage setemailpass(String pass) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(pass1));
        WebElement password = browser.findElement(pass1);
        password.clear();
        password.sendKeys(pass);
        WebElement Btsign = browser.findElement(signup1);
        Btsign.click();
        return this;
    }
}
