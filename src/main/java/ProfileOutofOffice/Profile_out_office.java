package ProfileOutofOffice;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Profile_out_office extends Base {

    public Profile_out_office(WebDriver browserDriver){
        super(browserDriver);
        //  wait.until(ExpectedConditions.visibilityOfElementLocated(titletask));
    }
    private By myprofile=By.xpath("//*[@id=\"tour_Administration\"]");
    private By profile=By.xpath("//*[@id=\"tour_Administration\"]/ul/li[1]/a");
    public Profile_out_office gotoprofile(){
        wait.until(ExpectedConditions.elementToBeClickable(myprofile));
        WebElement mp = browser.findElement(myprofile);
        mp.click();
        wait.until(ExpectedConditions.elementToBeClickable(profile));
        WebElement  clickonprof= browser.findElement(profile);
        clickonprof.click();
        return this;
    }

    public String Info_user(){



        By Name_lab = By.xpath("//*[@id=\"basic_information_div\"]/div/div[1]/div[1]/label");
        wait.until(ExpectedConditions.visibilityOfElementLocated(Name_lab));
        WebElement Name_la = browser.findElement(Name_lab);
      //  System.out.print(Name_la.getText());

        By Name_info = By.xpath("//*[@id=\"firstName\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(Name_info));
        WebElement Name_in = browser.findElement(Name_info);
     //       System.out.println(Name_in.getText());

        By Last_lab = By.xpath("//*[@id=\"basic_information_div\"]/div/div[1]/div[2]/label");
        wait.until(ExpectedConditions.visibilityOfElementLocated(Last_lab));
        WebElement Last_la = browser.findElement(Last_lab);
        //System.out.print(Last_la.getText());

        By Last_info = By.xpath("//*[@id=\"lastName\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(Last_info));
        WebElement Last_in = browser.findElement(Last_info);
      //  System.out.println(Last_in.getText());

 String NameUser=Name_la.getText()+" "+Name_in.getAttribute("value");

 String LastUser=Last_la.getText()+" "+Last_in.getAttribute("value");
 String InFoUser=NameUser+" "+LastUser;
System.out.println(InFoUser);
        return InFoUser;
    }


    private By outofoffice=By.xpath("//*[@id=\"out-of-office-tab\"]");
    public Profile_out_office Outofoffice(){
        wait.until(ExpectedConditions.elementToBeClickable(outofoffice));
        WebElement  out= browser.findElement(outofoffice);
        out.click();
        return this;
    }



    private By setoutoffice=By.xpath("//*[@id=\"out-of-office\"]/div/div[1]/div/div/label[2]");
    public Profile_out_office On_office() {
        wait.until(ExpectedConditions.elementToBeClickable(setoutoffice));
        WebElement oof = browser.findElement(setoutoffice);
        oof.click();
        return this;
    }
    public Profile_out_office AlternativeAssignee() {
        String selected_assignee = "najib ghosh" ;
        int ind = 1;
        By assigned_to_btn = By.xpath("//*[@id=\"assigne-to-id-wrapper\"]/span[2]");
        wait.until(ExpectedConditions.elementToBeClickable(assigned_to_btn))  ;
        WebElement assigned_btn = browser.findElement(assigned_to_btn);
        assigned_btn.click() ;

        By assigned_to_lst = By.xpath("//*[@id=\"assigne-to-id-wrapper\"]/span[1]/div/div/div") ;
        wait.until(ExpectedConditions.visibilityOfElementLocated(assigned_to_lst)) ;
        List<WebElement> assigned_to = browser.findElements(assigned_to_lst);

        for (WebElement group : assigned_to) {
            System.out.println(group.getText()) ;
        }

        for (WebElement assignee : assigned_to) {
            if (!(assignee.getText().equals(selected_assignee))) {
                ind +=1 ;
            }
            else {
                break ;
            }
        }

        String selected_assignee_xpath =  "/html/body/div[6]/div[2]/div/div/div[1]/div/div/form/div[2]/div[8]/div/div[2]/div/span[1]/div/div/div["+ind+"]";
        System.out.print(selected_assignee_xpath);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selected_assignee_xpath)))  ;
        WebElement assigned_selected = browser.findElement(By.xpath(selected_assignee_xpath));
        assigned_selected.click() ;
        return this;
    }
    private By off_setoutoffice=By.xpath("//*[@id=\"out-of-office\"]/div/div[1]/div/div/label[2]");
    public Profile_out_office Off_office() {
        wait.until(ExpectedConditions.elementToBeClickable(off_setoutoffice));
        WebElement oof = browser.findElement(off_setoutoffice);
        oof.click();
        return this;
    }


    public Profile_out_office save_out(){
        By save_out0f=By.xpath("//*[@id=\"userDetailsForm\"]/div[3]/input");

        wait.until(ExpectedConditions.elementToBeClickable(save_out0f));
        WebElement save_oof = browser.findElement(save_out0f);
        save_oof.click();
        return this;
    }
}
