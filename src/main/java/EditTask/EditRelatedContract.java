package EditTask;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EditRelatedContract extends Base {
    public EditRelatedContract(WebDriver browserDriver) {
        super(browserDriver);
        //   wait.until(ExpectedConditions.visibilityOfElementLocated());
    }

    private By relatedcontrdoc = By.xpath("//*[@id=\"lookup-contract\"]");
    private By selectrelatedcontrdoc = By.xpath("//*[@id=\"task-form\"]/div[2]/div/div[1]/span/div/div/div[1]");

    public EditRelatedContract relateddoc(String contrardoc) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(relatedcontrdoc));
        WebElement selectmatter = browser.findElement(relatedcontrdoc);
        selectmatter.sendKeys(contrardoc);
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectrelatedcontrdoc));
        WebElement selectdocmat = browser.findElement(selectrelatedcontrdoc);
        selectdocmat.click();
        return this;
    }}