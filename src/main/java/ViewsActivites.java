import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.WeakHashMap;

public class ViewsActivites {
    AndroidDriver Mydriver;
    public final By AllelementsONHOMEPage= AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]");
    public ViewsActivites(AndroidDriver Mydriver){
        this.Mydriver=Mydriver;
    }
    public void ClickOnAllElementsofHomePage(int Index){
        List<WebElement>AllElements=Mydriver.findElements(AllelementsONHOMEPage);
        AllElements.get(Index).click();
    }
}
