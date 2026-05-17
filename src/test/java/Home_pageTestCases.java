import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

public class Home_pageTestCases extends BaseClass {
    HomeActivity MyHomePageA;

    @Test
    public void ClickONElement(){
        MyHomePageA=new HomeActivity(Mydriver);
        MyHomePageA.AllElements(1);
        Mydriver.navigate().back();
        MyHomePageA.AllElements(2);

    }
}
