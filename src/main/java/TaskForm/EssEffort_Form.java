package TaskForm;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EssEffort_Form extends Base {

    public EssEffort_Form(WebDriver browserDriver){
        super(browserDriver);
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(titletask));
    }




    private By more=By.linkText("More Details");
    public EssEffort_Form moredetails(){
        wait.until(ExpectedConditions.elementToBeClickable(more));
        WebElement moreD = browser.findElement(more);
        moreD.click() ;
        return this;
    }
    private By est_Effort=By.xpath("//*[@id=\"pv_id_5_1_content\"]/div/div[1]/input");
    public EssEffort_Form Effort(String effort){
        wait.until(ExpectedConditions.visibilityOfElementLocated(est_Effort));
        WebElement est_eff = browser.findElement(est_Effort);
        est_eff.sendKeys(effort);

        return this;
    }
}
