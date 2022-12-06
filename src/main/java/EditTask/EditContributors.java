package EditTask;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class EditContributors extends Base {
    public EditContributors(WebDriver browserDriver) {
        super(browserDriver);
        //wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    private By contr = By.xpath("//*[@id=\"contributors-lookup\"]");
    private By selectcont = By.xpath("//*[@id=\"contributors-container\"]/div/div/div[1]/span[1]/div/div/div[1]");

    public EditContributors Contributors() {
        By con_dropdown = By.xpath("//*[@id=\"contributors-lookup\"]");
        wait.until(ExpectedConditions.elementToBeClickable(con_dropdown));
        WebElement tt_dpd = browser.findElement(con_dropdown);
        tt_dpd.click();
//*[@id="bs-select-2"]/ul/li/a/span

        By con_class = By.xpath("//*[@id=\"contributors-container\"]/div/div/div[1]/span[1]/div/div/div");
        System.out.println("we are here");

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(con_class));

        System.out.println("we are here now ");
        List<WebElement> priority = browser.findElements(con_class);
        System.out.println();
        System.out.println();
        System.out.print("this is size");
        System.out.println(priority.size());
        System.out.println();


        for (WebElement temp : priority) {
            System.out.print(temp.getText());
        }

        int index = 1;
        String contributor = "karim ghosh";

        for (WebElement vales : priority) {
            if (!(vales.getText().equals(contributor))) {
                index += 1;
            } else {
                break;
            }
        }
        String con_xpath = "//*[@id=\"contributors-container\"]/div/div/div[1]/span[1]/div/div/div["+index+"]";
        System.out.println(con_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(con_xpath)));
        WebElement tt_selected = browser.findElement(By.xpath(con_xpath));
        tt_selected.click();
        return this;
    }
}
