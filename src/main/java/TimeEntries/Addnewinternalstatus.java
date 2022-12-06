package TimeEntries;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Addnewinternalstatus extends Base {
    public Addnewinternalstatus(WebDriver browserDriver) {
        super(browserDriver);
        // wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    private By more_field = By.xpath("//*[@id=\"administration-dialog-form\"]/div[2]/div/a");
    private By link_addinternalstatus = By.xpath("//*[@id=\"userActivityLogForm\"]/div[3]/div[2]/div[3]/div[1]");
    private By is_eng = By.xpath("//*[@id=\"name_en\"]");

    private By is_ar = By.xpath("//*[@id=\"name_ar\"]");
    private By is_fr = By.xpath("//*[@id=\"name_fr\"]");
    private By is_sp = By.xpath("//*[@id=\"name_sp\"]");
    private By is_tu = By.xpath("//*[@id=\"name_tu\"]");
    private By is_ru = By.xpath("//*[@id=\"name_ru\"]");
    private By is_de = By.xpath("//*[@id=\"name_de\"]");
    public Addnewinternalstatus Addinternalstatus(String en, String arab, String fr, String sp, String tu, String ru, String de) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(link_addinternalstatus));
        WebElement plus_is = browser.findElement(link_addinternalstatus);
        plus_is.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(is_eng));
        WebElement plus_is_eng = browser.findElement(is_eng);
        plus_is_eng.sendKeys(en);

        wait.until(ExpectedConditions.visibilityOfElementLocated(more_field));
        WebElement click_more = browser.findElement(more_field);
        click_more.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(is_ar));
        WebElement plus_is_ar = browser.findElement(is_ar);
        plus_is_ar.sendKeys(arab);

        wait.until(ExpectedConditions.visibilityOfElementLocated(is_fr));
        WebElement plus_is_fr = browser.findElement(is_fr);
        plus_is_fr.sendKeys(fr);

        wait.until(ExpectedConditions.visibilityOfElementLocated(is_sp));
        WebElement plus_is_sp = browser.findElement(is_sp);
        plus_is_sp.sendKeys(sp);

        wait.until(ExpectedConditions.visibilityOfElementLocated(is_tu));
        WebElement plus_is_tu = browser.findElement(is_tu);
        plus_is_tu.sendKeys(tu);


        wait.until(ExpectedConditions.visibilityOfElementLocated(is_ru));
        WebElement plus_is_ru = browser.findElement(is_ru);
        plus_is_ru.sendKeys(ru);

        wait.until(ExpectedConditions.visibilityOfElementLocated(is_de));
        WebElement plus_is_de = browser.findElement(is_de);
        plus_is_de.sendKeys(de);
        return this;
    }

    private By save_add_is = By.xpath("//*[@id=\"administration-dialog-submit\"]");

    public Addnewinternalstatus saveaddis() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(save_add_is));
        WebElement plus_saveis = browser.findElement(save_add_is);
        plus_saveis.click();
        return this;
    }

}
