import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.List;

public class CustomApaptor {
    AndroidDriver Mydriver;
    public final By CustomAdaptor = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]");
    public final By PeopleName=AppiumBy.androidUIAutomator("new UiSelector().text(\"People Names\")");
    public CustomApaptor(AndroidDriver Mydriver){
        this.Mydriver=Mydriver;
    }
    public Void ClickOnCusyomAdaptorButoon(int Index){
        List<WebElement>AllElementsOFcustomadaptorButton=Mydriver.findElements(CustomAdaptor);
        AllElementsOFcustomadaptorButton.get(Index).click();
        return null;
    }
    public void ClickOnPeopleNameButtonLONGLY(){
        // Java
        ((JavascriptExecutor) Mydriver).executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) Mydriver.findElement(PeopleName)).getId()
        ));
    }
}
