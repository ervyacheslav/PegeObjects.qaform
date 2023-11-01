package tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationWithPageObjectsTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .setFirstName("Vyacheslav")
                .setlastName("Erokhin")
                .setuserEmail("er.vyacheslav2023@gmail.com")
                .setGender("Male")
                .setuserNumber("9508628655");



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