import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    AndroidDriver Mydriver;
    @BeforeMethod
    public void setUP() throws MalformedURLException {
        UiAutomator2Options Options =new UiAutomator2Options();
        Options.setAutomationName("Uiautomator2");
        Options.setPlatformName("Android");
        Options.setPlatformVersion("16");
        Options.setDeviceName("emulator-5556 ");
        Options.setApp("Downloads\\ApiDemos-release.apk");

        Mydriver = new AndroidDriver(new URL("http://127.0.0.1:4723/  " ),Options);
    }
    @AfterMethod
    public void quit(){
        Mydriver.quit();
    }
}
