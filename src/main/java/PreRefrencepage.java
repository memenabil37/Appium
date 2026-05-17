import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PreRefrencepage {
    AndroidDriver Mydriver;
    public final By AllElementsOfPrePage = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]");


    public PreRefrencepage(AndroidDriver Mydriver) {
        this.Mydriver = Mydriver;
    }
    public void ClickOnElementsOnThePage(int index){
        List<WebElement>AllElements=Mydriver.findElements(AllElementsOfPrePage);
        AllElements.get(index).click();
    }
}
