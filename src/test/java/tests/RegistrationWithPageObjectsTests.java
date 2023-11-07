package tests;

import org.junit.jupiter.api.Test;


public class RegistrationWithPageObjectsTests extends TestBase {

    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .setFirstName("Vyacheslav")
                .setLastName("Erokhin")
                .setEmail("er.vyacheslav2023@gmail.com")
                .setGender("Male")
                .setuserNumber("9508628655")
                .setDateOfBirth("04", "March", "1992")
                .setSubjects("Computer Science")
                .setHobby("Sports")
                .uploadPicture("1.png")
                .setCurrentAddress("Currect Address")
                .setState("Rajasthan")
                .setCity("Jaipur")
                .clickSubmit();

        //$(".modal-dialog").should(appear);
        //$("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        //$(".table-responsive").shouldHave(text("Vyacheslav"), text("Erokhin"),
        //        text("er.vyacheslav2023@gmail.com"), text("9508628655"));

        registrationPage.checkResult("Student Name", "Vyacheslav Erokhin")
                .checkResult("Student Email", "er.vyacheslav2023@gmail.com")
                .checkResult("Mobile", "9508628655");
    }
}