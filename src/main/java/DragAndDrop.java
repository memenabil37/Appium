import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.List;

public class DragAndDrop {
    AndroidDriver Mydriver;
    public final By ElementsTOgetDragANDDrop = AppiumBy.androidUIAutomator("new UiSelector().text(\"Drag and Drop\")");
    public final By FristCircle = AppiumBy.id("io.appium.android.apis:id/drag_dot_1");
    public final By SecCircle = AppiumBy.id("io.appium.android.apis:id/drag_dot_2");

    public DragAndDrop(AndroidDriver Mydriver) {
        this.Mydriver = Mydriver;
    }

    public void ClickOnDragAndDrop(int Index) {
        List<WebElement> AllElements = Mydriver.findElements(ElementsTOgetDragANDDrop);
        AllElements.get(Index).click();

    }

    public void Draganddrop() {
        // Java
        ((JavascriptExecutor) Mydriver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) Mydriver.findElement(FristCircle)).getId(),
                "endX", 626,
                "endY", 556, "speed", 500
        ));
    }
}
