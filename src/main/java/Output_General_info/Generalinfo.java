package Output_General_info;

import BaseT.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;

public class Generalinfo extends Base {

    public Generalinfo(WebDriver browserDriver) {
        super(browserDriver);
        // wait.until(ExpectedConditions.visibilityOfElementLocated());
    }





    public HashMap<String,String> output_General() {


        HashMap<String,String> GeneralInfo=new HashMap<String,String>();

        By Type_lab = By.xpath("//*[@id=\"details\"]/ul[1]/li[1]/div/span[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(Type_lab));
        WebElement Type_la = browser.findElement(Type_lab);
       //  System.out.print(Type_la.getText().substring(0, Type_la.getText().length()- 1));

        By Type_info = By.xpath("//*[@id=\"type-val\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(Type_info));
        WebElement Type_in = browser.findElement(Type_info);
       //   System.out.println(Type_in.getText());

       GeneralInfo.put(Type_la.getText().substring(0, Type_la.getText().length()- 1),Type_in.getText());

        By Ttile_lab = By.xpath("//*[@id=\"details\"]/ul[1]/li[2]/div/span[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(Ttile_lab));
        WebElement Title_la = browser.findElement(Ttile_lab);
      //  System.out.print(Title_la.getText());

        By Title_info = By.xpath("//*[@id=\"title-val\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(Title_info));
        WebElement Title_in = browser.findElement(Title_info);
       // System.out.println(Title_in.getText());

        GeneralInfo.put(Title_la.getText().substring(0,Title_la.getText().length()- 1),Title_in.getText());

        By prio_lab = By.xpath("//*[@id=\"details\"]/ul[1]/li[4]/div/span[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(prio_lab));
        WebElement prio_la = browser.findElement(prio_lab);
       // System.out.print(prio_la.getText());

        By prio_info = By.xpath("//*[@id=\"type-val\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(prio_info));
        WebElement prio_in = browser.findElement(prio_info);
      //  System.out.println(prio_in.getText());

        GeneralInfo.put(prio_la.getText().substring(0,prio_la.getText().length()- 1),prio_in.getText());


        By mat_lab = By.xpath("//*[@id=\"details\"]/ul[2]/li[1]/div/span[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(mat_lab));
        WebElement mat_la = browser.findElement(mat_lab);
      //  System.out.print(mat_la.getText());

        By mat_info = By.xpath("/html/body/div[6]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[1]/ul[2]/li[1]/div/span[2]/span");
        wait.until(ExpectedConditions.visibilityOfElementLocated(mat_info));
        WebElement mat_in = browser.findElement(mat_info);
   //     System.out.println(mat_in.getText());

        GeneralInfo.put(mat_la.getText().substring(0,mat_la.getText().length()- 1),mat_in.getText());

        By cont_lab = By.xpath("//*[@id=\"details\"]/ul[2]/li[2]/div/span[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(cont_lab));
        WebElement cont_la = browser.findElement(cont_lab);
       // System.out.print(cont_la.getText());

        By cont_info = By.xpath("/html/body/div[6]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[1]/ul[2]/li[2]/div/span[2]/span");
        wait.until(ExpectedConditions.visibilityOfElementLocated(cont_info));
        WebElement cont_in = browser.findElement(cont_info);
      //  System.out.println(cont_in.getText());

        GeneralInfo.put(cont_la.getText().substring(0,cont_la.getText().length()- 1),cont_in.getText());



        By work_lab = By.xpath("//*[@id=\"details\"]/ul[1]/li[3]/div/span[1]");
            wait.until(ExpectedConditions.visibilityOfElementLocated(work_lab));
            WebElement work_la = browser.findElement(work_lab);
           // System.out.print(work_la.getText());

            By work_info = By.xpath("//*[@id=\"status-val\"]/span");
            wait.until(ExpectedConditions.visibilityOfElementLocated(work_info));
            WebElement work_in = browser.findElement(work_info);
          //  System.out.println(work_in.getText());

        GeneralInfo.put(work_la.getText().substring(0,work_la.getText().length()- 1),work_in.getText());


                By loca_lab = By.xpath("//*[@id=\"details\"]/ul[1]/li[5]/div/span[1]");
                wait.until(ExpectedConditions.visibilityOfElementLocated(loca_lab));
                WebElement loca_la = browser.findElement(loca_lab);
             //   System.out.print(loca_la.getText());

                By loca_info = By.xpath("/html/body/div[6]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/div/span[2]/span");
                wait.until(ExpectedConditions.visibilityOfElementLocated(loca_info));
                WebElement loca_in = browser.findElement(loca_info);
              //  System.out.println(loca_in.getText());

        GeneralInfo.put(loca_la.getText().substring(0,loca_la.getText().length()- 1),loca_in.getText());


                By desc_lab = By.xpath("//*[@id=\"description-module-heading\"]/h4");
                wait.until(ExpectedConditions.visibilityOfElementLocated(desc_lab));
                WebElement desc_la = browser.findElement(desc_lab);
              //  System.out.print(desc_la.getText());

                By desc_info = By.xpath("//*[@id=\"description-val\"]/p");
                wait.until(ExpectedConditions.visibilityOfElementLocated(desc_info));
                WebElement desc_in = browser.findElement(desc_info);
             //   System.out.println(desc_in.getText());

        GeneralInfo.put(desc_la.getText(),desc_in.getText());


        By assgn_lab = By.xpath("//*[@id=\"people-details\"]/li/dl[1]/dt");
                wait.until(ExpectedConditions.visibilityOfElementLocated(assgn_lab));
                WebElement assgn_la = browser.findElement(assgn_lab);
              //  System.out.print(assgn_la.getText());

                By assgn_info = By.xpath("//*[@id=\"assignee-val\"]");
                wait.until(ExpectedConditions.visibilityOfElementLocated(assgn_info));
                WebElement assgn_in = browser.findElement(assgn_info);
            //    System.out.println(assgn_in.getText());

        GeneralInfo.put(assgn_la.getText().substring(0,assgn_la.getText().length()- 1),assgn_in.getText());


        By req_lab = By.xpath("//*[@id=\"people-details\"]/li/dl[2]/dt");
                wait.until(ExpectedConditions.visibilityOfElementLocated(req_lab));
                WebElement req_la = browser.findElement(req_lab);
              //  System.out.print(req_la.getText());

                By req_info = By.xpath("//*[@id=\"reporter-val\"]");
                wait.until(ExpectedConditions.visibilityOfElementLocated(req_info));
                WebElement req_in = browser.findElement(req_info);
             //   System.out.println(req_in.getText());

        GeneralInfo.put(req_la.getText().substring(0,req_la.getText().length()- 1),req_in.getText());


        By contr_lab = By.xpath("//*[@id=\"contributors\"]/li/dl/dt");
                wait.until(ExpectedConditions.visibilityOfElementLocated(contr_lab));
                WebElement contr_la = browser.findElement(contr_lab);
          //      System.out.print(contr_la.getText());

                By contr_info = By.xpath("//*[@id=\"contributors\"]/li/dl/dd");
                wait.until(ExpectedConditions.visibilityOfElementLocated(contr_info));
                WebElement contr_in = browser.findElement(contr_info);
           //     System.out.println(contr_in.getText());

        GeneralInfo.put(contr_la.getText().substring(0,contr_la.getText().length()- 1),contr_in.getText());


        //////////////////////////////////////////////////////////////////////////


        By shared_lab = By.xpath("//*[@id=\"watchers\"]/li/dl/dt");
        wait.until(ExpectedConditions.visibilityOfElementLocated(shared_lab));
        WebElement shared_la = browser.findElement(shared_lab);
        //      System.out.print(shared_la.getText());

        By shared_info = By.xpath("//*[@id=\"watchers\"]/li/dl/dd");
        wait.until(ExpectedConditions.visibilityOfElementLocated(shared_info));
        WebElement shared_in = browser.findElement(shared_info);
        //     System.out.println(contr_in.getText());

        GeneralInfo.put(shared_la.getText().substring(0,shared_la.getText().length()- 1),shared_in.getText());
/////////////////////////////////////////////////////////////////////////////
        By created_lab = By.xpath("//*[@id=\"users\"]/li[1]/dl/dt");
        wait.until(ExpectedConditions.visibilityOfElementLocated(created_lab));
        WebElement created_la = browser.findElement(created_lab);
        //      System.out.print(created_la.getText());

        By created_info = By.xpath("//*[@id=\"users\"]/li[1]/dl/dd");
        wait.until(ExpectedConditions.visibilityOfElementLocated(created_info));
        WebElement created_in = browser.findElement(created_info);
        //     System.out.println(contr_in.getText());

        GeneralInfo.put(created_la.getText().substring(0,created_la.getText().length()- 1),created_in.getText());
///////////////////////////////////////////////////////////////////////////
        By mod_lab = By.xpath("//*[@id=\"users\"]/li[2]/dl/dt");
        wait.until(ExpectedConditions.visibilityOfElementLocated(mod_lab));
        WebElement mod_la = browser.findElement(mod_lab);
        //      System.out.print(mod_la.getText());

        By mod_info = By.xpath("//*[@id=\"modified-by\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(mod_info));
        WebElement mod_in = browser.findElement(mod_info);
        //     System.out.println(contr_in.getText());

        GeneralInfo.put(mod_la.getText().substring(0,mod_la.getText().length()- 1),mod_in.getText());
////////////////////////////////////////////////////////////////////////////////////////












        System.out.println(GeneralInfo);
        return GeneralInfo;

            }
        }

