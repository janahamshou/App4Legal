package StepDefinitionAddTask;
import HomePage.HomePage;
import Login.LoginPage;
import TaskForm.*;
import TaskGrid.AllTasks;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.time.Duration;
import java.util.Properties;
import java.util.ResourceBundle;

public class StepDefinition_AddTask {
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


    @When("Home Page and All Task")
    public void home_page_and_all_task() {

        LoginPage login = new LoginPage(browser);
        login.setemailaddress("racha.elsayed@app4legal.com")
                .setinstance();
        login.setemailpass("RaRa@123");   // Write code here that turns the phrase above into concrete actions

        HomePage hompage=new HomePage(browser);
        hompage.Taskgrid();

        AllTasks at=new AllTasks(browser);
        at.Alltask();

        hompage.btnew().NewTask();
    }
    @Then("Add new Task")
    public void add_new_task() throws AWTException {
        // Write code here that turns the phrase above into concrete actions
        Title_Form title=new Title_Form(browser);
        title.Title("SAMIk");
        Type_Form type=new Type_Form(browser);
        type.Type();
        AssignedTo_Form assgneto=new AssignedTo_Form(browser);
        assgneto.Assgnto();
        Priority_Form prio=new Priority_Form(browser);
        prio.Priority();
        RequestedBy_Form reqby=new RequestedBy_Form(browser);
        reqby.requestedBy();
        Description_Form desc=new Description_Form(browser);
        desc.Description("najib");
        SharedWith_Form share=new SharedWith_Form(browser);
        share.Everyone().sharedwith().donesharedwith();
        //  RelatedMatter_Form re_matter=new RelatedMatter_Form(browser);
        //re_matter.RelatedMatter();
        RelatedContract_Form re_cont=new RelatedContract_Form(browser);
        re_cont.Relatedcontract();
        EssEffort_Form es_Eff=new EssEffort_Form(browser);
        es_Eff.moredetails().Effort("1");
        Contributors_form contr=new Contributors_form(browser);
        contr.contributors();
        Location_Form location=new Location_Form(browser);
        location.Select_location();
        //Document_Form DC=new Document_Form(browser);
       // DC.clickonrelateddocument();
       // DC.upload();
        Save_Form sv=new Save_Form(browser);
       sv.save_newTask();
       sv.get_ID_new_Task();
    }
    @And("Task added")
    public void task_added() {
        // Write code here that turns the phrase above into concrete actions
    System.out.println("Added");
    }








}
