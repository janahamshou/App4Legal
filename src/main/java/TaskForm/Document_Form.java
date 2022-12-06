package TaskForm;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Document_Form extends Base {
    public Document_Form(WebDriver browserDriver){
        super(browserDriver);
        //  wait.until(ExpectedConditions.visibilityOfElementLocated(titletask));
    }


    private By relateddocs=By.xpath("//*[@id=\"pv_id_5_2_header\"]");
    public Document_Form clickonrelateddocument(){

        wait.until(ExpectedConditions.elementToBeClickable(relateddocs));
        WebElement adddoc = browser.findElement(relateddocs);
        JavascriptExecutor js = (JavascriptExecutor)browser;
        js.executeScript("arguments[0].click()",adddoc);
        return this;
    }

    public Document_Form upload(){
By file=By.xpath("//*[@id=\"pv_id_5_2_content\"]/div/div/div[2]/div/div");
        wait.until(ExpectedConditions.elementToBeClickable(file));
        WebElement chooseFile = browser.findElement(file);
        //chooseFile.click();
        chooseFile.sendKeys("C:\\Users\\Dell\\Downloads\\columns.txt");
        return this;
    }









}
