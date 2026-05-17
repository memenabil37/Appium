import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PreRefrencePageTestCases extends BaseClass{
    prerfrence_dependancies MyPre_dep;
    HomeActivity MYhome;
    PreRefrencepage MYpre2;
    @BeforeMethod
    public void PreCondition(){
        MYhome=new HomeActivity(Mydriver);
       MYhome.AllElements(9);
       MYpre2= new PreRefrencepage(Mydriver);
        MYpre2.ClickOnElementsOnThePage(2);
        MyPre_dep=new  prerfrence_dependancies(Mydriver);

    }
    @Test
    public void VerifyValidWifiName(){
        MyPre_dep=new prerfrence_dependancies(Mydriver);
        MyPre_dep.ClickONElementsOfWIFIPage();
        MyPre_dep.ClickOnWifiSettings();
        MyPre_dep.EnterTextField("Vodafone");
        MyPre_dep.ClickOnOkButton();

        
    }
}
