package steps;

import pages.TestPage;

import static com.codeborne.selenide.Condition.exactText;

public class TestSteps {
    public TestPage page = new TestPage();
    public TestSteps clickElement(){
        page.elementsTag.scrollTo().click();
        return this;
    }
    public TestSteps selectImpressive(){
        page.secondRadioBUtton.click();
        return this;
    }
    public TestSteps clickRadioBtn(){
        page.radioButton.click();
        return this;
    }
    public TestSteps checkText(String searchText){
        page.forValidation.shouldHave(exactText(searchText));
        return this;
    }
    public TestSteps clickOnButtons(){
        page.buttons.scrollTo().click();
        return this;
    }
    public TestSteps clickClickMeButton(){
        page.clickMe.click();
        return this;
    }
    public TestSteps checkClickMeText(String searchText){
        page.clickMeValidator.shouldHave(exactText(searchText));
        return this;
    }
    public TestSteps clickOnRightClickButton(){
        page.rightClick.click();
        return this;
    }
    public TestSteps checkRightClickText(String searchText){
        page.rightClickValidator.shouldHave(exactText(searchText));
        return this;
    }
}
