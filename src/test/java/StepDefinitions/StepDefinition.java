package StepDefinitions;

import Login.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class StepDefinition {
    public WebDriver browser;





    ResourceBundle rb; // for reading properties file
    String br; //to store browser name



    @Before
    public void setup()    //Junit hook - executes once before starting
    {

        rb=ResourceBundle.getBundle("config");
        br=rb.getString("browser");

    }



    @Given("User Launch browser")
    public void user_launch_browser() {
        if(br.equals("chrome"))
        {
            browser=new ChromeDriver();
        }
        else if (br.equals("firefox")) {
            browser= new FirefoxDriver();
        }
        else if (br.equals("edge")) {
             browser= new EdgeDriver();
        }
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Given("opens URL")
    public void opens_url() {
     String url= System.getProperty("url");
     browser.get(url);
        browser.manage().window().maximize();
    }


    @When("User login into application with username and password")
    public void user_login_into_applicatin_with_username_and_password()  {
        LoginPage login = new LoginPage(browser);
        login.setemailaddress("racha.elsayed@app4legal.com")
                .setinstance();
        login.setemailpass("RaRa@123");
       System.out.println("When") ;
    }

    @Then("Homepage is populated")
    public void homepage_is_populated()  {




       System.out.println("Then") ;
    }

    @And("Cards are displayed")
    public void cards_are_displayed()  {
        System.out.println("And") ;
    }
}
