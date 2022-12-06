package TaskGrid;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Workflow_Status_filter extends Base {

    public Workflow_Status_filter(WebDriver browserDriver) {
        super(browserDriver);}



    public Workflow_Status_filter Click_work_F_status(){

        By click_W=By.linkText("Workflow Status Filter");
        wait.until(ExpectedConditions.elementToBeClickable(click_W));
        WebElement W_click= browser.findElement(click_W);
        W_click.click();

        return this;
    }

public  Workflow_Status_filter Select_All_status(){


    By click_All=By.xpath("//*[@id=\"all-task-status-filter\"]/i");
    wait.until(ExpectedConditions.elementToBeClickable(click_All));
    WebElement all_click= browser.findElement(click_All);
    all_click.click();



    By click_Apply=By.xpath("//*[@id=\"taskStatusesList\"]/a[25]");
    wait.until(ExpectedConditions.elementToBeClickable(click_Apply));
    WebElement apply_click= browser.findElement(click_Apply);
    apply_click.click();

    return this;

}

    public Workflow_Status_filter selectSpecifiecColumn(){

        By workflow_class = By.xpath("/html/body/div[7]/div[2]/div/div/div/form/nav/div/div/div/div[3]/div[2]/div/div[3]/div/a") ;
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(workflow_class)) ;
        List<WebElement> workflow_loc = browser.findElements(workflow_class);
        for (WebElement temp : workflow_loc) {

            System.out.println(temp.getText());

        }
        System.out.println("This is size");
        System.out.println(workflow_loc.size());

        int index = 1 ;
        String workflow_req = "5-Done" ;
        for (WebElement vals : workflow_loc) {

            if (!(vals.getText().equals(workflow_req))) {

                System.out.println("this is vals.get");
                System.out.println(vals.getText());
                System.out.println("this is the first index");
                System.out.println(index);

                index+=1 ;
            }
            else {
                System.out.println("this is the second index");
                System.out.println(index) ;
                break ;
            }
        }

        System.out.println("this is the third index");
        System.out.println(index) ;

        String workflow_xpath = "/html/body/div[7]/div[2]/div/div/div/form/nav/div/div/div/div[3]/div[2]/div/div[3]/div/a["+index+"]" ;
        System.out.print(workflow_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(workflow_xpath)))  ;
        WebElement tt_selected = browser.findElement(By.xpath(workflow_xpath));
        tt_selected.click() ;

        return this;
    }


    public Workflow_Status_filter UnselectSpecifiecColumn(){

        By workflow_class = By.xpath("/html/body/div[7]/div[2]/div/div/div/form/nav/div/div/div/div[3]/div[2]/div/div[3]/div/a") ;
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(workflow_class)) ;
        List<WebElement> workflow_loc = browser.findElements(workflow_class);
        for (WebElement temp : workflow_loc) {

            System.out.println(temp.getText());

        }
        System.out.println("This is size");
        System.out.println(workflow_loc.size());

        int index = 1 ;
        String workflow_req = "5-Done" ;
        for (WebElement vals : workflow_loc) {

            if (!(vals.getText().equals(workflow_req))) {

                System.out.println("this is vals.get");
                System.out.println(vals.getText());
                System.out.println("this is the first index");
                System.out.println(index);

                index+=1 ;
            }
            else {
                System.out.println("this is the second index");
                System.out.println(index) ;
                break ;
            }
        }

        System.out.println("this is the third index");
        System.out.println(index) ;

        String workflow_xpath = "/html/body/div[7]/div[2]/div/div/div/form/nav/div/div/div/div[3]/div[2]/div/div[3]/div/a["+index+"]" ;
        System.out.print(workflow_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(workflow_xpath)))  ;
        WebElement tt_selected = browser.findElement(By.xpath(workflow_xpath));
        tt_selected.click() ;

        return this;
    }


}
















