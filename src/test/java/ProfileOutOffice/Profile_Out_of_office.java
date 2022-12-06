package ProfileOutOffice;

import BaseT.BaseDriver_Profile_user_out_office;
import ProfileOutofOffice.Profile_out_office;
import org.testng.annotations.Test;

public class Profile_Out_of_office extends BaseDriver_Profile_user_out_office {

    @Test

    public void RunProfile(){
        Profile_out_office PF=new Profile_out_office(browser);
        PF.gotoprofile();
        PF.Info_user();
        PF.Outofoffice();
        PF.On_office();
        PF.AlternativeAssignee();
    }

}
