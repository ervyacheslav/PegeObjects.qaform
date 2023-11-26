package tests;

import org.junit.jupiter.api.Test;


public class RegistrationWithPageObjectsTests extends TestBase {

    @Test
    void fillFormTest() {
        registrationPage. openPage().
                setFirstName(testData.randomName).
                setLastName(testData.randomLastName).
                setEmail(testData.randomEmail).
                setGender(testData.randomGender).
                setuserNumber(testData.randomNumber).
                setDateOfBirth(testData.randomDay, testData.randomMonth, testData.randomYear).
                setSubjects(testData.randomSubject).
                setHobby(testData.randomHobbi).
                uploadPicture(testData.randomPicture).
                setCurrentAddress(testData.randomAdress).
                setState(testData.randomState).
                setCity(testData.randomStateCity).
                clickSubmit().
                resultOfTable(testData.randomName+ " " +testData.randomLastName).
                resultOfTable(testData.randomEmail).
                resultOfTable(testData.randomGender).
                resultOfTable(testData.randomNumber).
                resultOfTable(testData.randomDay+ " " +testData.randomMonth+ "," +testData.randomYear).
                resultOfTable(testData.randomSubject).
                resultOfTable(testData.randomHobbi).
                resultOfTable(testData.randomPicture).
                resultOfTable(testData.randomAdress).
                resultOfTable(testData.randomState+" "+testData.randomStateCity);

    }
}
