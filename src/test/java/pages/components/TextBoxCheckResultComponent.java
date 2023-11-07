package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxCheckResultComponent {
    SelenideElement  resultName = $("#output").$("#name"),
            resultEmail = $("#output").$("#email"),
            resultCurrentAddress = $("#output").$("#currentAddress"),
            resultPermanentAddress = $("#output").$("#permanentAddress");
    public TextBoxCheckResultComponent verifyResultName(String text) {
        resultName.shouldHave(text(text));
        return this;
    }

    public TextBoxCheckResultComponent verifyResultEmail(String text) {
        resultEmail.shouldHave(text(text));
        return this;
    }

    public TextBoxCheckResultComponent verifyResultCurrentAddress(String text) {
        resultCurrentAddress.shouldHave(text(text));
        return this;
    }

    public TextBoxCheckResultComponent verifyResultPermanentAddress(String text) {
        resultPermanentAddress.shouldHave(text(text));
        return this;
    }
}