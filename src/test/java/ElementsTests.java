import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.TestSteps;
import com.codeborne.selenide.Configuration;
import data.TestData;


import static com.codeborne.selenide.Selenide.open;

public class ElementsTests {
    public TestData testVar = new TestData();
    public TestSteps testSteps = new TestSteps();
    @BeforeClass
    public void ElementsTests() {
        Configuration.browser = "chrome";
    }
    @Test
    public void first(){
        open("https://demoqa.com/");
        testSteps.clickElement().clickRadioBtn()
                .selectImpressive().checkText(testVar.impressiveTextCheck);
    }
    @Test(dependsOnMethods={"first"},alwaysRun = true)
    public void second(){
        open("https://demoqa.com/");
        testSteps.clickElement().clickOnButtons().clickClickMeButton()
                .checkClickMeText(testVar.dynamicClickText)
                .clickOnRightClickButton().checkRightClickText(testVar.rightClickText);
    }
}
