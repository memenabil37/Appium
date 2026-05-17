import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragandDropTestCases extends BaseClass {
    HomeActivity MyHomePageActivites;
    ViewsActivites MyViewActivites;
    DragAndDrop MyDragandDrop;
    @BeforeMethod
    public void preCondition(){
        MyHomePageActivites=new HomeActivity(Mydriver);
        MyHomePageActivites.AllElements(11);
        MyViewActivites=new ViewsActivites(Mydriver);
        MyViewActivites.ClickOnAllElementsofHomePage(7);
        MyDragandDrop=new DragAndDrop(Mydriver);

    }
    @Test
    public void verifrDragAndDrop(){
        MyDragandDrop=new DragAndDrop(Mydriver);
        MyDragandDrop.Draganddrop();
    }


}
