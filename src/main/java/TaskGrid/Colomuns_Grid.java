package TaskGrid;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.HashMap;
import java.util.List;
public class Colomuns_Grid extends Base {
    public Colomuns_Grid (WebDriver browserDriver) {
        super(browserDriver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(togrid));
    }
    private By columnsbt=By.xpath("//*[@id=\"column-picker-trigger-container\"]/button");
    private By arch=By.xpath("//*[@id=\"unselected\"]/li[1]/label/input");
    private By contr=By.xpath("//*[@id=\"unselected\"]/li[2]/label/input");
    private By createdby=By.xpath("//*[@id=\"unselected\"]/li[3]/label/input");
    private By createdon=By.xpath("//*[@id=\"unselected\"]/li[4]/label/input");
    private By Eff=By.xpath("//*[@id=\"unselected\"]/li[5]/label/input");
    private By EffH=By.xpath("//*[@id=\"unselected\"]/li[6]/label/input");
    private By Est=By.xpath("//*[@id=\"unselected\"]/li[7]/label/input");
    private By location=By.xpath("//*[@id=\"unselected\"]/li[8]/label/input");
    private By matterId=By.xpath("//*[@id=\"unselected\"]/li[9]/label/input");
    private By ModifiedBy=By.xpath("//*[@id=\"unselected\"]/li[10]/label/input");
    private By ModifiedOn=By.xpath("//*[@id=\"unselected\"]/li[11]/label/input");
    private By RequestedBy=By.xpath("//*[@id=\"unselected\"]/li[12]/label/input");
    private By Done=By.id("submit-grid-columns");
    private By Def=By.xpath("//*[@id=\"selected-columns\"]/button");
    // private By archiv=By.xpath("//*[@id=\"unselected\"]/li[1]/label/input");
    //private By con=By.xpath("//*[@id=\"unselected\"]/li[2]/label/input");
    By togrid = By.xpath("//*[@id=\"top-nav-item-list\"]/li[7]/a");
    By headr = By.xpath("//*[@id=\"fixed-navbar\"]/div/div/table/thead/tr/th");
    By rows = By.xpath("//*[@id=\"tasksGrid\"]/div[2]/table/tbody/tr/td[2]/a");
    private By productLinksLocator = By.cssSelector("a.add-success-link");

    public Colomuns_Grid clickoncolumns(){
        wait.until(ExpectedConditions.elementToBeClickable(columnsbt));
        WebElement col= browser.findElement(columnsbt);
        JavascriptExecutor js = (JavascriptExecutor)browser;
        js.executeScript("arguments[0].click()",col);
        return this;
    }

    public Colomuns_Grid columns(){

        wait.until(ExpectedConditions.elementToBeClickable(arch));
        WebElement archived= browser.findElement(arch);
        archived.click();

        wait.until(ExpectedConditions.elementToBeClickable(contr));
        WebElement contributors= browser.findElement(contr);
        contributors.click();

        wait.until(ExpectedConditions.elementToBeClickable(createdby));
        WebElement createdBy= browser.findElement(createdby);
        createdBy.click();

        wait.until(ExpectedConditions.elementToBeClickable(createdon));
        WebElement createdOn= browser.findElement(createdon);
        createdOn.click();

        wait.until(ExpectedConditions.elementToBeClickable(Eff));
        WebElement Effort= browser.findElement(Eff);
        Effort.click();

        wait.until(ExpectedConditions.elementToBeClickable(EffH));
        WebElement EffortH= browser.findElement(EffH);
        EffortH.click();

        wait.until(ExpectedConditions.elementToBeClickable(Est));
        WebElement Esteff= browser.findElement(Est);
        Esteff.click();

        wait.until(ExpectedConditions.elementToBeClickable(location));
        WebElement loc= browser.findElement(location);
        loc.click();

        wait.until(ExpectedConditions.elementToBeClickable(matterId));
        WebElement Mid= browser.findElement(matterId);
        Mid.click();

        wait.until(ExpectedConditions.elementToBeClickable(ModifiedBy));
        WebElement Modifiedby= browser.findElement(ModifiedBy);
        Modifiedby.click();

        wait.until(ExpectedConditions.elementToBeClickable(ModifiedOn));
        WebElement Modifiedon= browser.findElement(ModifiedOn);
        Modifiedon.click();

        wait.until(ExpectedConditions.elementToBeClickable(RequestedBy));
        WebElement Requestedby= browser.findElement(RequestedBy);
        Requestedby.click();
        return  this;
    }
    public Colomuns_Grid donee(){
        wait.until(ExpectedConditions.elementToBeClickable(Done));
        WebElement done= browser.findElement(Done);
        done.click();
        return  this;
    }

    public Colomuns_Grid restoreDefaults(){
        wait.until(ExpectedConditions.elementToBeClickable(Def));
        WebElement restdef= browser.findElement(Def);
        restdef.click();
        return  this;
    }



   public Colomuns_Grid selectSpecifiecColumn(){
        By columns_class = By.xpath("//*[@id=\"unselected\"]/li") ;
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(columns_class)) ;
        List<WebElement> columns_loc = browser.findElements(columns_class);
        for (WebElement temp : columns_loc) {

            System.out.println(temp.getText());

        }
        System.out.println("This is size");
       System.out.println(columns_loc.size());

        int index = 1 ;
        String columns_req = "Modified By" ;
        for (WebElement vals : columns_loc) {

            if (!(vals.getText().equals(columns_req))) {

                System.out.println("this is vals.get");
                System.out.println(vals.getText());
                System.out.println("this is the first index");
                System.out.println(index);

                index+=1 ;
            }
            else {
                System.out.println("this is the second index");
                System.out.println(index) ;
                break ;
            }
        }
       //*[@id="unselected"]/li[1]/label/input

       //*[@id="unselected"]/li[2]/label/input

       //*[@id="unselected"]/li[3]/label/input
        System.out.println("this is the third index");
       System.out.println(index) ;
        String columns_xpath = "//*[@id=\"unselected\"]/li["+index+"]/label/input" ;
        System.out.print(columns_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(columns_xpath)))  ;
        WebElement tt_selected = browser.findElement(By.xpath(columns_xpath));
        tt_selected.click() ;

        return this;
    }

    private By Donesc=By.id("submit-grid-columns");
    public Colomuns_Grid done(){
        wait.until(ExpectedConditions.elementToBeClickable(Donesc));
        WebElement donesc= browser.findElement(Donesc);
        donesc.click();
        return  this;
    }
    public Colomuns_Grid unselectSpecifiecColumn(){

        By columns_class_unselect = By.xpath("//*[@id=\"selected\"]/li") ;
        wait.until(ExpectedConditions.visibilityOfElementLocated(columns_class_unselect)) ;
        List<WebElement> columns_loc = browser.findElements(columns_class_unselect);
        for (WebElement temp : columns_loc) {
            System.out.print(temp.getText());
        }
        int index = 1 ;
        String columns_req = "Priority" ;
        for (WebElement vals : columns_loc) {
            if (!(vals.getText().equals(columns_req))) {
                index+=1 ;
            }
            else {
                break ;
            }
        }

        String columns_xpath = "//*[@id=\"selected\"]/li["+index+"]/label/input" ;
        System.out.print(columns_xpath);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(columns_xpath)))  ;
        WebElement tt_selected = browser.findElement(By.xpath(columns_xpath));
        tt_selected.click() ;

        return this;
    }
    private By Doneuc=By.id("submit-grid-columns");
    public Colomuns_Grid doneuns(){
        wait.until(ExpectedConditions.elementToBeClickable(Doneuc));
        WebElement doneusc= browser.findElement(Doneuc);
        doneusc.click();
        return  this;
    }

    /*private By next=By.xpath("//*[@id=\"tasksGrid\"]/div[3]/a[3]");
    public Taskgrid nextpage(){
    wait.until(ExpectedConditions.elementToBeClickable(next));
    WebElement nextp= browser.findElement(next);
    nextp.click();
    return  this;
      }


    private By last=By.xpath("//*[@id=\"tasksGrid\"]/div[3]/a[4]");
    public Taskgrid gotolastpage(){
    wait.until(ExpectedConditions.elementToBeClickable(last));
    WebElement lastp= browser.findElement(last);
    lastp.click();
    return  this;
     }

    private By previous=By.xpath("//*[@id=\"tasksGrid\"]/div[3]/a[2]");
    public Taskgrid previouspage(){
        wait.until(ExpectedConditions.elementToBeClickable(previous));
        WebElement prev= browser.findElement(previous);
        prev.click();
        return  this;
        }

      public void printTable() {

     WebElement table = browser.findElement(By.xpath("//*[@id=\"fixed-navbar\"]/div/div/table"));
     List<WebElement> rowsList = table.findElements(By.tagName("tr"));

     List<WebElement> columnsList = null;

     for (WebElement row : rowsList) {
         columnsList = row.findElements(By.tagName("td"));

         for (WebElement column : columnsList) {
             System.out.println("column text" + column.getText()+ ", "); // here is is just printing number of rows, like 1, 2
         }

     }
     browser.quit();
 }
 */


    public Colomuns_Grid test1(){
        WebElement scroll = browser.findElement(By.xpath("//*[@id=\"fixed-navbar\"]/div/div/table/thead/tr/th[9]"));
        JavascriptExecutor js = (JavascriptExecutor)browser;
        js.executeScript("window.scrollBy(2000,0)", "");
        return this;
    }

    public Colomuns_Grid test2() {
        int count_id = 1;
        wait.until(ExpectedConditions.visibilityOfElementLocated(headr));
        List<WebElement> headrList = browser.findElements(headr);
        System.out.println(headrList.size());

        for (WebElement heads : headrList) {
            if (!(heads.getText()).equals("ID")) {
                System.out.println(heads.getText());
                count_id += 1;
            } else {
                System.out.print(count_id);
                break;

            }
        }
        System.out.print("This is count_id");
        System.out.print(count_id);
        return this;
    }

    public Colomuns_Grid test3(){

        WebElement productLinksLocator= browser.findElement(By.cssSelector("a.add-success-link"));
        String  id_s =productLinksLocator.getText();

        wait.until(ExpectedConditions.visibilityOfElementLocated(rows) )  ;
        List <WebElement> rowsList = browser.findElements(rows);
        int index = 1 ;
        System.out.println(rowsList.size());



        for (WebElement id : rowsList) {  //this function should be a separate function where it takes a string and a list as variables
            if (!(id_s).equals(id.getText())) {
                index+=1 ;
            }
            else {
                break ;
            }
        }
        return this;
    }

    public Colomuns_Grid test4(){
        int index = 1 ;
        String row_xpath = "//*[@id=\"tasksGrid\"]/div[2]/table/tbody/tr["+ index+ "]/td" ;
        List <WebElement> my_task = browser.findElements(By.xpath(row_xpath));
        System.out.println(my_task.size());
        for (WebElement val : my_task) {
            System.out.println(val.getText());
        }
        System.out.println("This is my row entirely");
        return this;
    }

    public Colomuns_Grid test5() {

        List<WebElement> headrList = browser.findElements(headr);
        List<WebElement> my_task = browser.findElements((rows));
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < headrList.size(); i++) {
            map.put(headrList.get(i).getText(), my_task.get(i).getText());
        }
        System.out.print(map);

        return this;
    }

    /*  private By productLinksLocator = By.cssSelector("a.add-success-link");

      public WebElement getProductNameLinks() {
          wait.until(ExpectedConditions.elementToBeClickable(productLinksLocator));
          List<WebElement> productLinks = browser.findElements(productLinksLocator);
          return productLinks.get(0);
      }


        wait.until(ExpectedConditions.visibilityOfElementLocated(tab) )  ;

          List <WebElement> rowList = browser.findElements(tab);
          System.out.println("This is data");

          for (WebElement row : rowList) {
              System.out.println(row.getText());
          }
          System.out.println("Done");
       }
       */


    public WebElement getProductNameLinks() {
        wait.until(ExpectedConditions.elementToBeClickable(productLinksLocator));
        List<WebElement> productLinks = browser.findElements(productLinksLocator);
        return productLinks.get(0);
    }
    private By user=By.linkText("T00000221");
 public Colomuns_Grid clickuser(){
     wait.until(ExpectedConditions.elementToBeClickable(user));
     WebElement use= browser.findElement(user);
     use.click();

     return  this;
 }
}