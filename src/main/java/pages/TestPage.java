package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TestPage {
    public SelenideElement elementsTag = $(byText("Elements")),
            radioButton = $("#item-2"),
            secondRadioBUtton = $(by("for","impressiveRadio")),
            forValidation = $(".mt-3"),
            buttons = $("#item-4"),//
            clickMe = $(byText("Click Me")),
            clickMeValidator = $("#dynamicClickMessage"),
            rightClick = $("#rightClickBtn"),
            rightClickValidator = $("#rightClickMessage");;
}
