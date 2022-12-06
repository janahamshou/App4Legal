package BaseT;
import EditTask.Buttons;
import HomePage.HomePage;
import Login.LoginPage;
import TaskGrid.AllTasks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseDriver_Hashmap_edit {
    public WebDriver browser;
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
        HomePage hompage=new HomePage(browser);
        hompage.Taskgrid();

        AllTasks at=new AllTasks(browser);
        at.Alltask();
        Buttons Bt=new Buttons(browser);
        Bt.clickuser().clickonedit();
    }
}
