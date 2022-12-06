package TimeEntries;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Categories extends Base {
    public Categories (WebDriver browserDriver) {
        super(browserDriver);
        // wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    public Categories Category() {
        By category_dropdown = By.xpath("//*[@id=\"userActivityLogForm\"]/div[3]/div[2]/div[2]/button");
        wait.until(ExpectedConditions.elementToBeClickable(category_dropdown));
        WebElement tt_dpd = browser.findElement(category_dropdown);
        tt_dpd.click();

        By category_class = By.xpath("//*[@id=\"bs-select-2\"]/ul/li");
        System.out.println("we are here");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(category_class));

        System.out.println("we are here now ");
        List<WebElement> category = browser.findElements(category_class);
        System.out.print("We are the champions");

        for (WebElement temp : category) {
            System.out.print(temp.getText());
        }
        System.out.print("We are the champions");

        int index = 0;
        String catg = "Administration";

        for (WebElement vales : category) {
            if (!(vales.getText().equals(catg))) {
                index += 1;
            } else {
                break;
            }
        }

        String category_xpath = "//*[@id=\"bs-select-2-" + index + "\"]";
        System.out.println(category_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(category_xpath)));
        WebElement tt_selected = browser.findElement(By.xpath(category_xpath));
        tt_selected.click();
        return this;

    }

}
