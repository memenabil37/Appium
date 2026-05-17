import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Expandable_list {
    AndroidDriver Mydriver;
    public final By AllelementsOfNextPageEX= AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]");
    public Expandable_list(AndroidDriver Mydriver){
        this.Mydriver=Mydriver;
    }
    public void ClickOnExpandableList (int Index){
        List<WebElement>AllElements=Mydriver.findElements(AllelementsOfNextPageEX);
        AllElements.get(Index).click();

    }
}
