package Tests.Testcases;

import DataLoader.Reader;
import DataLoader.TestData;
import TestComponents.BaseTest;
import Tests.Steps.UserRegistrationSteps;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class UserRegistrationTest extends BaseTest {

    UserRegistrationSteps userRegistrationSteps = new UserRegistrationSteps();
    @Test(description = "Nopcommerce registration feature Test", dataProvider = "TestDataProviderFunction", dataProviderClass = TestData.class)
    public void testToVerifyRegistration(String testDataFromDataProvider, ITestContext testContext){

        Reader.testDataCurrentRow = testDataFromDataProvider;

        userRegistrationSteps.userGoesToNopCommerceHomePage();
        userRegistrationSteps.userNavigateToRegistrationPage();
        userRegistrationSteps.userSelectGender();
        userRegistrationSteps.userSetFirstNameAndLastName();
        userRegistrationSteps.userSetDOB();
        userRegistrationSteps.userSetEmail();
        userRegistrationSteps.userSetCompanyName();
        userRegistrationSteps.userSetNewsletterOption();
        userRegistrationSteps.userSetPassword();
        userRegistrationSteps.userClickOnRegisterButton();
        userRegistrationSteps.verifyRegistrationMessage();

    }

}
