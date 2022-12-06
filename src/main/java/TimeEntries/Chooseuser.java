package TimeEntries;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Chooseuser extends Base {
    public Chooseuser(WebDriver browserDriver) {
        super(browserDriver);
        // wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
    public Chooseuser chooseuser() {

        By users_dropdown = By.xpath("//*[@id=\"shared-with-users\"]");
        wait.until(ExpectedConditions.elementToBeClickable(users_dropdown));
        WebElement is_dpd = browser.findElement(users_dropdown);
        is_dpd.click();

        By users_class = By.xpath("/html/body/div[11]/div/div/div/div/div[2]/form/div[5]/div[1]/div/div[1]/span[1]/div/div");
        System.out.println("we are here");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(users_class));

        System.out.println("we are here now ");
        List<WebElement> intstat = browser.findElements(users_class);
        System.out.print("We are the champions");

        for (WebElement temp : intstat) {
            System.out.print(temp.getText());
        }
        System.out.print("We are the champions");

        int index = 1;
        String intst = "najib ghosh";

        for (WebElement vales : intstat) {
            if (!(vales.getText().equals(intst))) {
                index += 1;
            } else {
                break;
            }
        }

        String users_xpath = "/html/body/div[11]/div/div/div/div/div[2]/form/div[5]/div[1]/div/div[1]/span[1]/div/div[1]/div[" + index + "]";
        System.out.println(users_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(users_xpath)));
        WebElement is_selected = browser.findElement(By.xpath(users_xpath));
        is_selected.click();
        return this;
    }

    public Chooseuser userRate() {
        By usersrate_dropdown = By.xpath("//*[@id=\"rate-time-log-lookup-wrapper\"]/div/button");
        wait.until(ExpectedConditions.elementToBeClickable(usersrate_dropdown));
        WebElement is_dpd = browser.findElement(usersrate_dropdown);
        is_dpd.click();

        By usersrate_class = By.xpath("//*[@id=\"bs-select-4\"]/ul/li");
        System.out.println("we are here");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(usersrate_class));

        System.out.println("we are here now ");
        List<WebElement> intstat = browser.findElements(usersrate_class);
        System.out.print("We are the champions");

        for (WebElement temp : intstat) {
            System.out.print(temp.getText());
        }
        System.out.print("We are the champions");

        int index = 0;
        String intst = "Fixed Rate";

        for (WebElement vales : intstat) {
            if (!(vales.getText().equals(intst))) {
                index += 1;
            } else {
                break;
            }
        }

        String usersrate_xpath = "//*[@id=\"bs-select-4-" + index + "\"]";
        System.out.println(usersrate_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usersrate_xpath)));
        WebElement is_selected = browser.findElement(By.xpath(usersrate_xpath));
        is_selected.click();
        return this;

    }

    private By rate = By.xpath("//*[@id=\"fixed-rate-input\"]");

    public Chooseuser fixedrate(String ratee) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(rate));
        WebElement fr = browser.findElement(rate);
        fr.sendKeys(ratee);
        return this;
    }

}
