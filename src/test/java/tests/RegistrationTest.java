package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationTest extends TestBase {


    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));

        $("#firstName").setValue("Vyacheslav");
        $("#lastName").setValue("Erokhin");
        $("#userEmail").setValue("er.vyacheslav2023@gmail.com");
        $(byText("Male")).click();
        $("#userNumber").setValue("9508628655");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-dropdown-container").$(byText("March")).click();
        $(".react-datepicker__year-select").selectOption("1992");
        $(".react-datepicker__day--004").click();
        $("#subjectsInput").setValue("Computer Science").pressEnter();
        $(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("1.png");
        $("#currentAddress").setValue("Currect Address");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Rajasthan")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Jaipur")).click();
        $("#submit").click();

        $(".modal-dialog").shouldHave(text("Thanks for submitting the form"));
        $(".modal-content").shouldHave(
                text("Vyacheslav Erokhin"),
                text("er.vyacheslav2023@gmail.com"),
                text("Male"),
                text("9508628655"),
                text("04 March,1992"),
                text("Computer Science"),
                text("Sports"),
                text("1.png"),
                text("Currect Address"),
                text("Rajasthan Jaipur")
        );
    }
}