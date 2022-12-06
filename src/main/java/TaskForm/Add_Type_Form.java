package TaskForm;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Add_Type_Form extends Base {
    public Add_Type_Form(WebDriver browserDriver){
        super(browserDriver);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(titletask));
    }

    private By link_addtasktype=By.linkText("+ Task Type");
    private By type_eng=By.xpath("name_en");
    private By more_field=By.linkText("More Fields");

    private By type_ar=By.id("name_ar");
    private By type_fr=By.id("name_fr");

    private By type_sp=By.id("name_sp");

    private By type_tu=By.id("name_tu");

    private By type_ru=By.id("name_ru");
    private By type_de=By.id("name_de");

    public  Add_Type_Form AddtypeForm(String en,String ar,String fr,String sp,String tu,String ru,String de){
        wait.until(ExpectedConditions.visibilityOfElementLocated(link_addtasktype));
        WebElement plus_type = browser.findElement(link_addtasktype);
        plus_type.click() ;

        wait.until(ExpectedConditions.visibilityOfElementLocated(type_eng));
        WebElement plus_type_eng = browser.findElement(type_eng);
        plus_type_eng.sendKeys(en);

        wait.until(ExpectedConditions.visibilityOfElementLocated(more_field));
        WebElement click_more = browser.findElement(more_field);
        click_more.click() ;

        wait.until(ExpectedConditions.visibilityOfElementLocated(type_ar));
        WebElement plus_type_ar = browser.findElement(type_ar);
        plus_type_ar.sendKeys(ar);

        wait.until(ExpectedConditions.visibilityOfElementLocated(type_fr));
        WebElement plus_type_fr = browser.findElement(type_fr);
        plus_type_fr.sendKeys(fr);

        wait.until(ExpectedConditions.visibilityOfElementLocated(type_sp));
        WebElement plus_type_sp = browser.findElement(type_sp);
        plus_type_sp.sendKeys(sp);

        wait.until(ExpectedConditions.visibilityOfElementLocated(type_tu));
        WebElement plus_type_tu = browser.findElement(type_tu);
        plus_type_tu.sendKeys(tu);


        wait.until(ExpectedConditions.visibilityOfElementLocated(type_ru));
        WebElement plus_type_ru = browser.findElement(type_ru);
        plus_type_ru.sendKeys(ru);

        wait.until(ExpectedConditions.visibilityOfElementLocated(type_de));
        WebElement plus_type_de = browser.findElement(type_de);
        plus_type_de.sendKeys(de);


        return this;
    }
    private By save_add=By.xpath("//*[@id=\"administration-dialog-submit\"]");
    public Add_Type_Form saveadd(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(save_add));
        WebElement plus_save = browser.findElement(save_add);
        plus_save.click();
        return this;
    }

    private By cancel_add=By.linkText("Cancel");
    public Add_Type_Form Canceladd(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(cancel_add));
        WebElement plus_save = browser.findElement(cancel_add);
        plus_save.click();
        return this;
    }
    private By exit_add=By.linkText("×");
    public Add_Type_Form Exitadd(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(exit_add));
        WebElement plus_save = browser.findElement(exit_add);
        plus_save.click();
        return this;
    }






}
