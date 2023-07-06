package PSP;

import PageObject.RegistrationPage;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static DataObject.RegistrationData.*;


public class RegistrationTest extends ChromeRunner {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Registration Functionality -Valid")
    public void validRegistration() throws InterruptedException {

        RegistrationPage page = new RegistrationPage(driver);
        page

                .ClickToUser()
                .ClickToRegister()
                .ClickFirstNameInput(nameInput)
                .ClickLastNameInput(surnameInput)
                .ClickMobileNumberInput(registrationNumber)
                .ClickEmailField(registrationEmail)
                .PasswordField(passwordInput)
                .ConfirmPassword(passwordInput)
                .Checkbox()
                .ClickToSubmit();
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Registration Functionality - Invalid")
    public void invalidRegister() throws InterruptedException {

        RegistrationPage page = new RegistrationPage(driver);
        page
                .ClickToUser()
                .ClickToRegister()
                .ClickFirstNameInput(nameInput)
                .ClickLastNameInput(surnameInput)
                .ClickMobileNumberInput(mobileInput)
                .ClickEmailField(registrationEmail)
                .PasswordField(passwordInput)
                .ConfirmPassword(passwordInput)
                .Checkbox()
                .ClickToSubmit();
    }


}
