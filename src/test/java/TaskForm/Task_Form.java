package TaskForm;
import BaseT.BaseDriver;
import BaseT.BaseDriver_form;
import HomePage.HomePage;
import TaskGrid.AllTasks;
import org.testng.annotations.Test;


public class Task_Form extends BaseDriver_form {
    @Test
    public void FormRun() {

        Title_Form title=new Title_Form(browser);
        title.Title("rasha");
        Type_Form type=new Type_Form(browser);
        type.Type();
        AssignedTo_Form assgneto=new AssignedTo_Form(browser);
        assgneto.Assgnto();
        Priority_Form prio=new Priority_Form(browser);
        prio.Priority();
        RequestedBy_Form reqby=new RequestedBy_Form(browser);
        reqby.requestedBy();
        Description_Form desc=new Description_Form(browser);
        desc.Description("najib");
        SharedWith_Form share=new SharedWith_Form(browser);
        share.Everyone().sharedwith().donesharedwith();
      //  RelatedMatter_Form re_matter=new RelatedMatter_Form(browser);
        //re_matter.RelatedMatter();
        RelatedContract_Form re_cont=new RelatedContract_Form(browser);
        re_cont.Relatedcontract();
        EssEffort_Form es_Eff=new EssEffort_Form(browser);
        es_Eff.moredetails().Effort("1");
        Contributors_form contr=new Contributors_form(browser);
        contr.contributors();
        Location_Form location=new Location_Form(browser);
        location.Select_location();
    }
}