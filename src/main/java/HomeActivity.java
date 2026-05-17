import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.URL;
import java.util.List;

public class HomeActivity {
    AndroidDriver driver;
    public final By button1 = AppiumBy.accessibilityId("Access'ibility");
    public final By button2 = AppiumBy.accessibilityId("Accessibility");
    public final By button3 = AppiumBy.accessibilityId("Animation");

    public final By allelementsOfHomePage=AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]");

    public HomeActivity(AndroidDriver driver) {
        this.driver = driver;
    }
    public void clickOnElement(By Locator){
        driver.findElement(Locator).click();

    }
public void AllElements(int Index){
    List<WebElement>Allbuttons =driver.findElements(allelementsOfHomePage);
    Allbuttons.get(Index).click();
}

}
