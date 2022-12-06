package TaskForm;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SharedWith_Form extends Base {

    public SharedWith_Form(WebDriver browserDriver){
        super(browserDriver);
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(titletask));
    }

    private By everyone=By.xpath("//*[@id=\"required-task-fields\"]/div[5]/a");
    public SharedWith_Form Everyone(){
        wait.until(ExpectedConditions.elementToBeClickable(everyone));
        WebElement every = browser.findElement(everyone);
        every.click();
        return this;
    }
    public SharedWith_Form sharedwith(){
        System.out.print("We are in shared with ");
        String selected_user = "najib ghosh" ;
        int ind = 1 ;
        By share_to_btn = By.xpath("//*[@id=\"overlay_panel\"]/div/span/button");
        System.out.print("We are in shared with");
        wait.until(ExpectedConditions.elementToBeClickable(share_to_btn))  ;
        WebElement assigned_btn = browser.findElement(share_to_btn);
        assigned_btn.click() ;


        By shared_to_lst = By.xpath("/html/body/div[16]/ul/li") ;
        wait.until(ExpectedConditions.visibilityOfElementLocated(shared_to_lst)) ;
        List<WebElement> shared_to = browser.findElements(shared_to_lst);

        for (WebElement group : shared_to) {
            System.out.println(group.getText()) ;
        }


        for (WebElement assignee : shared_to) {
            if (!(assignee.getText().equals(selected_user))) {
                ind +=1 ;
            }
            else {
                break ;
            }
        }


        String selected_assignee_xpath =  "//*[@id=\"pv_id_8_list\"]/li["+ind+"]/div";
        System.out.print(selected_assignee_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selected_assignee_xpath)))  ;
        WebElement assigned_selected = browser.findElement(By.xpath(selected_assignee_xpath));
        assigned_selected.click() ;
        return this;
    }

    private By doneshared=By.xpath("//*[@id=\"overlay_panel\"]/div/div[3]/a[1]");
    public SharedWith_Form donesharedwith(){
        wait.until(ExpectedConditions.elementToBeClickable(doneshared));
        WebElement done = browser.findElement(doneshared);
        done.click() ;
        return this;
    }

/*private By exit=By.xpath("//*[@id=\"overlay_panel\"]/button");
public FormAddTask exitsharedwith(){
    wait.until(ExpectedConditions.elementToBeClickable(exit));
    WebElement ex = browser.findElement(exit);
   ex.click() ;
    return this;
}


    private By setaspublicinshared=By.xpath("//*[@id=\"overlay_panel\"]/div/div[3]/a[2]");
    public FormAddTask Setaspublic(){
        wait.until(ExpectedConditions.elementToBeClickable(setaspublicinshared));
        WebElement set = browser.findElement(setaspublicinshared);
        set.click() ;
        return this;
    }*/

}
