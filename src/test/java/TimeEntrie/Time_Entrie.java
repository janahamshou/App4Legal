package TimeEntrie;

import BaseT.BaseDriver_TimeEntrie;
import TimeEntries.*;
import org.testng.annotations.Test;

public class Time_Entrie extends BaseDriver_TimeEntrie {

    @Test

    public void TimeEntrieRun(){

        Effort effort=new Effort(browser);
        effort.effort("4");
        Categories cat=new Categories(browser);
        cat.Category();
        InternalStatus intStatus=new InternalStatus(browser);
        intStatus.internalStatus();
        Comment com=new Comment(browser);
        com.addcomment("rasha");
      //  Nonbillable non_B=new Nonbillable(browser);
       // non_B.nonbillabletime();
        ButtonsTime BT_M=new ButtonsTime(browser);
        BT_M.clickonmore();
        Chooseuser ch_user=new Chooseuser(browser);
        ch_user.chooseuser().userRate().fixedrate("40");









    }
}
