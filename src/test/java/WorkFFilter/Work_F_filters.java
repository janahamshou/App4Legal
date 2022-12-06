package WorkFFilter;

import BaseT.BaseDriver_work_F_Filter;
import TaskGrid.Workflow_Status_filter;
import org.testng.annotations.Test;

public class Work_F_filters extends BaseDriver_work_F_Filter {
    @Test
    public void workFRun(){

        Workflow_Status_filter Wf_S=new Workflow_Status_filter(browser);
        Wf_S.Click_work_F_status();
        Wf_S.UnselectSpecifiecColumn();
   //.Select_All_status()
    }
}
