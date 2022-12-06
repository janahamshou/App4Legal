package EditTaskForm;

import BaseT.BaseDriver_Edit;
import EditTask.*;
import org.testng.annotations.Test;

public class Edit_Task_Form extends BaseDriver_Edit {
    @Test
    public void EditFormRun(){

        EditTitle edit_title=new EditTitle(browser);
        edit_title.editTitle("jana");
        EditType edit_type=new EditType(browser);
        edit_type.edittype();
        // EditDescription edit_desc=new EditDescription(browser);
        // edit_desc.description("laravelle");
        EditAssignedTo assigned_edit=new EditAssignedTo(browser);
        assigned_edit.AssignedTo();
        EditRequestedby edit_req=new EditRequestedby(browser);
        edit_req.requestedbyedit();
        EditPriority edit_prio=new EditPriority(browser);
        edit_prio.priorityedit();
        EditRelatedMatter edit_matter=new EditRelatedMatter(browser);
        edit_matter.relatedmatter();
        EditRelatedContract edit_contract=new EditRelatedContract(browser);
        edit_contract.relateddoc("tes");
        Buttons Bt_M=new Buttons(browser);
        Bt_M.clickonmore();
        EditEstimatedEffort edit_eff=new EditEstimatedEffort(browser);
        edit_eff.estimatedeffort("2");
        EditContributors edit_cont=new EditContributors(browser);
        edit_cont.Contributors();
        EditLocation edit_location=new EditLocation(browser);
        edit_location.Location("bei");
        Buttons Bt_P=new Buttons(browser);
        Bt_P.Setasprivate();
        EditSharedWith edit_share=new EditSharedWith(browser);
        edit_share.share();
        Buttons Bt_S=new Buttons(browser);
        Bt_S.btsave1();

    }
}
