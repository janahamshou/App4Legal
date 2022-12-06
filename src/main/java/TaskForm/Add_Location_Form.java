package TaskForm;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Add_Location_Form extends Base {
    public Add_Location_Form(WebDriver browserDriver){
        super(browserDriver);
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(titletask));
    }

    private By link_addtask_location=By.linkText("+ Add New Location");
    private By location_name=By.xpath("//*[@id=\"field-name\"]");


    public  Add_Location_Form AddlocationForm(String nameLoca){
        wait.until(ExpectedConditions.visibilityOfElementLocated(link_addtask_location));
        WebElement plus_location = browser.findElement(link_addtask_location);
        plus_location.click() ;

        wait.until(ExpectedConditions.visibilityOfElementLocated(location_name));
        WebElement plus_location_name = browser.findElement(location_name);
        plus_location_name.sendKeys(nameLoca);




        return this;
    }

    private By save_addlocation=By.xpath("//*[@id=\"administration-dialog-submit\"]");

    public Add_Location_Form save_addlocation(){

        wait.until(ExpectedConditions.elementToBeClickable(save_addlocation));
        WebElement plus_saveloca = browser.findElement(save_addlocation);
        plus_saveloca.click();

        return  this;
    }
}
