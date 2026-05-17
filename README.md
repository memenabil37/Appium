ApiDemos Android — Appium Automation Framework
Automated mobile testing framework for the ApiDemos Android app using Appium + Java + TestNG, built with the Page Object Model (POM) design pattern.

 Tech Stack
ToolDetailsLanguageJavaAutomation FrameworkAppium (UiAutomator2)Test RunnerTestNGDesign PatternPage Object Model (POM)PlatformAndroid (Emulator)App Under TestApiDemos-release.apk

 Project Structure
src/
├── main/java/
│   ├── HomeActivity.java             # Home page locators & actions
│   ├── ViewsActivites.java           # Views section actions
│   ├── DragAndDrop.java              # Drag & Drop gestures
│   ├── CustomApaptor.java            # Custom Adaptor actions (long click)
│   ├── Expandable_list.java          # Expandable List actions
│   ├── PreRefrencepage.java          # Preference page actions
│   └── prerfrence_dependancies.java  # Preference Dependencies (WiFi settings)
│
└── test/java/
    ├── BaseClass.java                        # Driver setup & teardown
    ├── Home_pageTestCases.java               # Home page test cases
    ├── DragandDropTestCases.java             # Drag & Drop test cases
    ├── CustoAdaptorTestCases.java            # Custom Adaptor test cases
    ├── Expandable_listTestCases.java         # Expandable List test cases
    ├── PreRefrencePageTestCases.java         # Preference page test cases
    └── PreRefrence_dependancesTestCases.java # Preference Dependencies test cases

 Test Coverage
ModuleTest CaseDescriptionHome PageClickONElementNavigate between home page elements by indexDrag & DropverifrDragAndDropDrag first circle and drop onto target using mobile: dragGestureCustom Adaptor—Long click on "People Names" using mobile: longClickGestureExpandable List—Click on expandable list items by indexPreference PageVerifyValidWifiNameEnable WiFi checkbox → open settings → enter WiFi name → confirm

 Setup & Configuration
Prerequisites

Java JDK 11+
Maven or Gradle
Appium Server 2.x
Android Studio + Android Emulator
ApiDemos-release.apk placed in your Downloads folder

Appium Capabilities (BaseClass)
javaOptions.setAutomationName("Uiautomator2");
Options.setPlatformName("Android");
Options.setPlatformVersion("16");
Options.setDeviceName("emulator-5556");
Options.setApp("Downloads\\ApiDemos-release.apk");
Appium Server URL
http://127.0.0.1:4723

 How to Run

Start the Android Emulator (emulator-5556)
Start the Appium Server

bash   appium

Run tests via TestNG XML or your IDE

 Design Pattern
The project follows Page Object Model (POM):

Main classes → contain locators and reusable action methods per screen
Test classes → extend BaseClass and call page actions, keeping tests clean and maintainable
BaseClass → handles driver initialization (@BeforeMethod) and session teardown (@AfterMethod)


 Notes

Drag & Drop implemented using Appium's mobile: dragGesture via JavaScript executor
Long press implemented using mobile: longClickGesture
Element selection is index-based using findElements() lists for dynamic screens
