package EditTask;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Addnewtype_Edit extends Base {
    public Addnewtype_Edit(WebDriver browserDriver) {
        super(browserDriver);
     //   wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    private By add_task_type = By.xpath("//*[@id=\"quickAddButton\"]");

    private By type_english = By.xpath("//*[@id=\"name_en\"]");
    private By more_fields = By.xpath("//*[@id=\"administration-dialog-form\"]/div[2]/div/a");

    private By type_arab = By.xpath("//*[@id=\"name_ar\"]");
    private By type_frensh = By.xpath("//*[@id=\"name_fr\"]");

    private By type_span = By.xpath("//*[@id=\"name_sp\"]");

    private By type_turk = By.xpath("//*[@id=\"name_tu\"]");

    private By type_russ = By.xpath("//*[@id=\"name_ru\"]");
    private By type_deu = By.xpath("//*[@id=\"name_de\"]");
    private By save = By.xpath("//*[@id=\"administration-dialog-submit\"]");

    public Addnewtype_Edit editaddtasktype(String eng, String arb, String frs, String spn, String tur, String russ, String deu) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(add_task_type));
        WebElement plus_typeedit = browser.findElement(add_task_type);
        plus_typeedit.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(type_english));
        WebElement plus_type_engl = browser.findElement(type_english);
        plus_type_engl.sendKeys(eng);

        wait.until(ExpectedConditions.visibilityOfElementLocated(more_fields));
        WebElement click_moreedit = browser.findElement(more_fields);
        click_moreedit.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(type_arab));
        WebElement plus_type_arb = browser.findElement(type_arab);
        plus_type_arb.sendKeys(arb);

        wait.until(ExpectedConditions.visibilityOfElementLocated(type_frensh));
        WebElement plus_type_fre = browser.findElement(type_frensh);
        plus_type_fre.sendKeys(frs);

        wait.until(ExpectedConditions.visibilityOfElementLocated(type_span));
        WebElement plus_type_spa = browser.findElement(type_span);
        plus_type_spa.sendKeys(spn);

        wait.until(ExpectedConditions.visibilityOfElementLocated(type_turk));
        WebElement plus_type_tur = browser.findElement(type_turk);
        plus_type_tur.sendKeys(tur);


        wait.until(ExpectedConditions.visibilityOfElementLocated(type_russ));
        WebElement plus_type_rus = browser.findElement(type_russ);
        plus_type_rus.sendKeys(russ);


        wait.until(ExpectedConditions.visibilityOfElementLocated(type_deu));
        WebElement plus_type_deu = browser.findElement(type_deu);
        plus_type_deu.sendKeys(deu);
        wait.until(ExpectedConditions.elementToBeClickable(save));
        WebElement savetype = browser.findElement(save);
        savetype.click();
        return this;
    }
  /*  private By canc = By.xpath("/html/body/div[14]/div/div/div/div/div[3]/button");
    private By yes = By.xpath("//*[@id=\"confirmation-dialog-submit\"]");

    // private By no=By.xpath("//*[@id=\"cancel-confirmation-dialog\"]");
    public TaskEdit canceladd() {
        wait.until(ExpectedConditions.elementToBeClickable(canc));
        WebElement can = browser.findElement(canc);
        can.click();
        wait.until(ExpectedConditions.elementToBeClickable(yes));
        WebElement yess = browser.findElement(yes);
        yess.click();
       /* wait.until(ExpectedConditions.elementToBeClickable(no));
        WebElement noo= browser.findElement(no);
       noo.click();
        return this;
    }*/
}