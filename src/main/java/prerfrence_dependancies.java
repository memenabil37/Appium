import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class prerfrence_dependancies {
   AndroidDriver Mydriver;
    public final By checkbox= AppiumBy.id("android:id/checkbox");
    public final By TextFiled = AppiumBy.id("android:id/edit");
    public final By okButton =AppiumBy.id("android:id/button1");
    public final By WifiSettings =AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.RelativeLayout\").instance(1)");
    public prerfrence_dependancies (AndroidDriver Mydriver){
        this.Mydriver=Mydriver;
    }
    public void ClickONElementsOfWIFIPage(){
        Mydriver.findElement(checkbox).click();
    }
    public void EnterTextField(String TEXT){
        Mydriver.findElement(TextFiled).sendKeys(TEXT);
    }
    public void ClickOnOkButton(){
        Mydriver.findElement(okButton).click();
    }
    public void ClickOnWifiSettings(){
        Mydriver.findElement(WifiSettings).click();
    }

}
