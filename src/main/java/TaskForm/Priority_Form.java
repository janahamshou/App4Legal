package TaskForm;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Priority_Form extends Base {

    public Priority_Form(WebDriver browserDriver){
        super(browserDriver);
      //  wait.until(ExpectedConditions.visibilityOfElementLocated());
    }

    public Priority_Form Priority(){
        By priority_dropdown = By.xpath("//*[@id=\"task-required-fields-step-2\"]/div[2]/div/div[2]");
        wait.until(ExpectedConditions.elementToBeClickable(priority_dropdown)) ;
        WebElement tt_dpd= browser.findElement(priority_dropdown) ;
        tt_dpd.click();

        By priority_class = By.xpath("/html/body/div[13]/div[2]/ul/li") ;
        System.out.println("we are here") ;

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(priority_class)) ;

        System.out.println("we are here now ") ;
        List<WebElement> priority = browser.findElements(priority_class);

        System.out.println("We are the champions") ;

        for (WebElement temp : priority) {
            System.out.println(temp.getText());
        }
        System.out.print("We are the champions") ;

        int index = 0 ;
        String prio = "Low";

        for (WebElement vales : priority) {
            if (!(vales.getText().equals(prio))) {
                index+=1 ;
            }
            else {
                break ;
            }
        }

        String priority_xpath =" /html/body/div[13]/div[2]/ul/li["+index+"]/div";
        System.out.println(priority_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(priority_xpath)))  ;
        WebElement tt_selected = browser.findElement(By.xpath(priority_xpath));
        tt_selected.click() ;

        return this;
    }
}
