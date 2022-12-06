package GeneralInfo;

import BaseT.BaseDriver_OutputGeneralInfo;
import Output_General_info.Generalinfo;
import org.testng.annotations.Test;

public class General_Info extends BaseDriver_OutputGeneralInfo {

    @Test

    public void RunOutupGeneralInfo(){


        Generalinfo gn=new Generalinfo(browser);
       gn.output_General();

    }
}
