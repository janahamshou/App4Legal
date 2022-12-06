package TimeEntries;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Addnewcategory extends Base {
    public Addnewcategory(WebDriver browserDriver) {
        super(browserDriver);
        // wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    private By link_addcategory = By.xpath("//*[@id=\"userActivityLogForm\"]/div[3]/div[2]/div[1]");

    private By cat_eng = By.xpath("//*[@id=\"name_en\"]");
    private By more_field = By.xpath("//*[@id=\"administration-dialog-form\"]/div[2]/div/a");
    private By cat_ar = By.xpath("//*[@id=\"name_ar\"]");
    private By cat_fr = By.xpath("//*[@id=\"name_fr\"]");
    private By cat_sp = By.xpath("//*[@id=\"name_sp\"]");
    private By cat_tu = By.xpath("//*[@id=\"name_tu\"]");
    private By cat_ru = By.xpath("//*[@id=\"name_ru\"]");
    private By cat_de = By.xpath("//*[@id=\"name_de\"]");

    public Addnewcategory Addcategory(String en, String ar, String fr, String sp, String tu, String ru, String de) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(link_addcategory));
        WebElement plus_cat = browser.findElement(link_addcategory);
        plus_cat.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(cat_eng));
        WebElement plus_cat_eng = browser.findElement(cat_eng);
        plus_cat_eng.sendKeys(en);

        wait.until(ExpectedConditions.visibilityOfElementLocated(more_field));
        WebElement click_more = browser.findElement(more_field);
        click_more.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(cat_ar));
        WebElement plus_cat_ar = browser.findElement(cat_ar);
        plus_cat_ar.sendKeys(ar);

        wait.until(ExpectedConditions.visibilityOfElementLocated(cat_fr));
        WebElement plus_cat_fr = browser.findElement(cat_fr);
        plus_cat_fr.sendKeys(fr);

        wait.until(ExpectedConditions.visibilityOfElementLocated(cat_sp));
        WebElement plus_cat_sp = browser.findElement(cat_sp);
        plus_cat_sp.sendKeys(sp);

        wait.until(ExpectedConditions.visibilityOfElementLocated(cat_tu));
        WebElement plus_type_tu = browser.findElement(cat_tu);
        plus_type_tu.sendKeys(tu);


        wait.until(ExpectedConditions.visibilityOfElementLocated(cat_ru));
        WebElement plus_cat_ru = browser.findElement(cat_ru);
        plus_cat_ru.sendKeys(ru);

        wait.until(ExpectedConditions.visibilityOfElementLocated(cat_de));
        WebElement plus_cat_de = browser.findElement(cat_de);
        plus_cat_de.sendKeys(de);

        return this;
    }

    private By save_add_cat = By.xpath("//*[@id=\"administration-dialog-submit\"]");

    public Addnewcategory saveaddcat() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(save_add_cat));
        WebElement plus_savecat = browser.findElement(save_add_cat);
        plus_savecat.click();
        return this;
    }

}
