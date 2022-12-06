package ColumnsGrid;

import BaseT.BaseDriver_ColumnsGrid;
import TaskGrid.Colomuns_Grid;
import org.testng.annotations.Test;

public class Columns_Grid extends BaseDriver_ColumnsGrid {


    @Test

    public void RunColumn_Grid(){


        Colomuns_Grid Colmun=new Colomuns_Grid(browser);
    //    Colmun.clickoncolumns();
       // Colmun.restoreDefaults();
        Colmun.clickoncolumns().columns().done();







    }
}
