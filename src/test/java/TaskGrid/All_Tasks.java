package TaskGrid;
import BaseT.BaseDriver;
import org.testng.annotations.Test;


public class All_Tasks extends BaseDriver {
    @Test
    public void Alltaskstest() {

        AllTasks at=new AllTasks(browser);
        at.Taskgrid().Alltask();

    }
}
