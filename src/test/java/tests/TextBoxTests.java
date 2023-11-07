package tests;

import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase{
    @Test
    void fillTextBoxTest(){
        textBoxPage.openPage("\\text-box")
                .setName("Vyacheslav Erokhin")
                .setEmail("er.vyacheslav2023@gmail.com")
                .setCurrentAddress("Pobeda, 104")
                .setPermanentAddress("Pobeda, 104")
                .submitButtonClick();

        textBoxCheckResultComponent.verifyResultName("Vyacheslav Erokhin")
                .verifyResultEmail("er.vyacheslav2023@gmail.com")
                .verifyResultCurrentAddress("Pobeda, 104")
                .verifyResultPermanentAddress("Pobeda, 104");
    }
}