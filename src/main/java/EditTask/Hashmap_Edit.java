package EditTask;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.print.DocFlavor;
import java.util.HashMap;

public class Hashmap_Edit extends Base {
    public Hashmap_Edit(WebDriver browserDriver){
        super(browserDriver);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(titletask));
    }
   public HashMap<String,String> hashmapedit(){
       HashMap<String,String> editmap=new HashMap<String,String>();

       By Title_lab = By.xpath("//*[@id=\"required-fields-task-demo\"]/div[1]/div[1]/div/label");
       wait.until(ExpectedConditions.visibilityOfElementLocated(Title_lab));
       WebElement Title_la = browser.findElement(Title_lab);
           // System.out.print(mod_la.getText());

       By Title_info = By.xpath("//*[@id=\"title\"]");
       wait.until(ExpectedConditions.visibilityOfElementLocated(Title_info));
       WebElement Title_in = browser.findElement(Title_info);
       //     System.out.println(contr_in.getText());

       editmap.put(Title_la.getText(),Title_in.getText());


       By Type_lab = By.xpath("//*[@id=\"type-wrapper\"]/label");
       wait.until(ExpectedConditions.visibilityOfElementLocated(Type_lab));
       WebElement Type_la = browser.findElement(Type_lab);
       //      System.out.print(mod_la.getText());

       By Type_info = By.xpath("//*[@id=\"type-wrapper\"]/div/div[1]/div/button/div/div/div");
       wait.until(ExpectedConditions.visibilityOfElementLocated(Type_info));
       WebElement Type_in = browser.findElement(Type_info);
       //     System.out.println(contr_in.getText());

       editmap.put(Type_la.getText(),Type_in.getText());


       By Assign_lab = By.xpath("//*[@id=\"assignedToLabelId\"]");
       wait.until(ExpectedConditions.visibilityOfElementLocated(Assign_lab));
       WebElement Assign_la = browser.findElement(Assign_lab);
       //      System.out.print(mod_la.getText());

       By Assign_info = By.xpath("//*[@id=\"assignedToLookUp\"]");
       wait.until(ExpectedConditions.visibilityOfElementLocated(Type_info));
       WebElement Assign_in = browser.findElement(Type_info);
       //     System.out.println(contr_in.getText());

       editmap.put(Assign_la.getText(),Type_in.getText());



       By Requestedby_lab = By.xpath("//*[@id=\"reporterLabelId\"]");
       wait.until(ExpectedConditions.visibilityOfElementLocated(Requestedby_lab));
       WebElement Requestedby_la = browser.findElement(Requestedby_lab);
       //      System.out.print(mod_la.getText());

       By Requestedby_info = By.xpath("//*[@id=\"reporterLookUp\"]");
       wait.until(ExpectedConditions.visibilityOfElementLocated(Requestedby_info));
       WebElement Requestedby_in = browser.findElement(Requestedby_info);
       //     System.out.println(contr_in.getText());

       editmap.put(Requestedby_la.getText(),Requestedby_in.getText());

       By priority_lab = By.xpath("//*[@id=\"priority-wrapper\"]/label");
       wait.until(ExpectedConditions.visibilityOfElementLocated(priority_lab));
       WebElement priority_la = browser.findElement(priority_lab);
       //      System.out.print(mod_la.getText());

       By priority_info = By.xpath("//*[@id=\"priority-wrapper\"]/div/div/div/button/div/div/div");
       wait.until(ExpectedConditions.visibilityOfElementLocated(priority_info));
       WebElement priority_in = browser.findElement(priority_info);
       //     System.out.println(contr_in.getText());

       editmap.put(priority_la.getText(),priority_in.getText());

       By relatedmatter_lab = By.xpath("//*[@id=\"required-fields-task-demo\"]/div[3]/div/label");
       wait.until(ExpectedConditions.visibilityOfElementLocated(relatedmatter_lab));
       WebElement relatedmatter_la = browser.findElement(relatedmatter_lab);
       //      System.out.print(mod_la.getText());

       By relatedmatter_info = By.xpath("//*[@id=\"caseLookup\"]");
       wait.until(ExpectedConditions.visibilityOfElementLocated(relatedmatter_info));
       WebElement relatedmatter_in = browser.findElement(relatedmatter_info);
       //     System.out.println(contr_in.getText());

       editmap.put(relatedmatter_la.getText(),relatedmatter_in.getText());

       By relatedcontractdocument_lab = By.xpath("//*[@id=\"task-form\"]/div[2]/div/label");
       wait.until(ExpectedConditions.visibilityOfElementLocated(relatedcontractdocument_lab));
       WebElement relatedcontractdocument_la = browser.findElement(relatedcontractdocument_lab);
       //      System.out.print(mod_la.getText());

       By relatedcontractdocument_info = By.xpath("//*[@id=\"lookup-contract\"]");
       wait.until(ExpectedConditions.visibilityOfElementLocated(relatedcontractdocument_info));
       WebElement relatedcontractdocument_in = browser.findElement(relatedcontractdocument_info);
       //     System.out.println(contr_in.getText());

       editmap.put(relatedcontractdocument_la.getText(),relatedcontractdocument_in.getText());

       By clickonmorefields = By.xpath("//*[@id=\"task-form\"]/div[4]/div/div[2]/a");
       wait.until(ExpectedConditions.visibilityOfElementLocated(clickonmorefields));
       WebElement selectdocmat = browser.findElement(clickonmorefields);
       selectdocmat.click();


       By Esteffort_lab = By.xpath("//*[@id=\"task-form\"]/div[5]/div[2]/div/label");
       wait.until(ExpectedConditions.visibilityOfElementLocated(Esteffort_lab));
       WebElement Esteffort_la = browser.findElement(Esteffort_lab);
       //      System.out.print(mod_la.getText());

       By Esteffort_info = By.xpath("//*[@id=\"estimatedEffortHour\"]");
       wait.until(ExpectedConditions.visibilityOfElementLocated(relatedcontractdocument_info));
       WebElement Esteffort_in = browser.findElement(relatedcontractdocument_info);
       //     System.out.println(contr_in.getText());

       editmap.put(Esteffort_la.getText(),Esteffort_in.getText());

       By contributors_lab = By.xpath("//*[@id=\"contributors-container\"]/div/label");
       wait.until(ExpectedConditions.visibilityOfElementLocated(contributors_lab));
       WebElement contributors_la = browser.findElement(contributors_lab);
       //      System.out.print(mod_la.getText());

       By contributors_info = By.xpath("//*[@id=\"contributors-lookup\"]");
       wait.until(ExpectedConditions.visibilityOfElementLocated(contributors_info));
       WebElement contributors_in = browser.findElement(contributors_info);
       //     System.out.println(contr_in.getText());

       editmap.put(contributors_la.getText(),contributors_in.getText());

       By location_lab = By.xpath("//*[@id=\"task-form\"]/div[5]/div[4]/div/label");
       wait.until(ExpectedConditions.visibilityOfElementLocated(location_lab));
       WebElement location_la = browser.findElement(location_lab);
       //      System.out.print(mod_la.getText());

       By location_info = By.xpath("//*[@id=\"location\"]");
       wait.until(ExpectedConditions.visibilityOfElementLocated(location_info));
       WebElement location_in = browser.findElement(location_info);
       //     System.out.println(contr_in.getText());
       editmap.put(location_la.getText(),location_in.getText());
       System.out.println(editmap);
       return editmap;
   }
}
