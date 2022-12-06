package HashmapEditform;

import BaseT.BaseDriver_Hashmap_edit;
import EditTask.Hashmap_Edit;
import org.testng.annotations.Test;

public class Hashmapedit extends BaseDriver_Hashmap_edit {
    @Test
    public void mapedit(){
        Hashmap_Edit hp=new Hashmap_Edit(browser);
        hp.hashmapedit();
    }
}
