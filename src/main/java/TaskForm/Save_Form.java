package TaskForm;

import BaseT.Base;
import TimeEntries.InternalStatus;
import io.cucumber.java.bs.I;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Save_Form extends Base {
    public Save_Form(WebDriver browserDriver){
        super(browserDriver);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(titletask));
    }

    private By save_addTask=By.xpath("/html/body/div[11]/div[2]/div/div[3]/div[2]/button[1]");
    public Save_Form save_newTask(){

        wait.until(ExpectedConditions.elementToBeClickable(save_addTask));
        WebElement plus_saveTAsk = browser.findElement(save_addTask);
        plus_saveTAsk.click();

        return this;

    }
    private By save_addanotherTask=By.xpath("/html/body/div[11]/div[2]/div/div[3]/div[2]/button[2]");
    public Save_Form save_another_newTask(){

        wait.until(ExpectedConditions.elementToBeClickable(save_addanotherTask));
        WebElement plus_save_another_TAsk = browser.findElement(save_addanotherTask);
        plus_save_another_TAsk.click();

        return this;

    }

    private By cancel_Task=By.xpath("/html/body/div[11]/div[2]/div/div[3]/div[2]/button[3]");
    public Save_Form cancel_newTask(){

        wait.until(ExpectedConditions.elementToBeClickable(cancel_Task));
        WebElement cancel_save_TAsk = browser.findElement(cancel_Task);
        cancel_save_TAsk.click();

        return this;

    }


    public Save_Form get_ID_new_Task(){
   By ID_newTask=By.xpath("/html/body/div[13]/div[2]/div/a");
        wait.until(ExpectedConditions.visibilityOfElementLocated(ID_newTask));
        WebElement ID_save_TAsk = browser.findElement(ID_newTask);
        System.out.println(ID_save_TAsk.getText());
        return this;
    }


}
