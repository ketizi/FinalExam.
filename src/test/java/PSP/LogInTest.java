package PSP;

import PageObject.LoginPage;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LogInData.*;
import static DataObject.RegistrationData.mobileInput;

public class LogInTest extends ChromeRunner {



    @Test(priority = 1, groups = "smoke")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Log In with valid credentials")
    public void VerifyLoginFunctionality() throws InterruptedException {
        LoginPage home = new LoginPage(driver);

        home.ClickToUser();
        home.EmailInput(emailInput);
        home.PasswordInput(passwordInputLogIn);
        home.ClickToSubmit();



    }

    @Test(priority = 2, groups = "smoke")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Log In with invalid credentials")
    public void VerifyInvalidLoginCredentials() throws InterruptedException {
        LoginPage home = new LoginPage(driver);
        home
                .ClickToUser()
                .EmailInput(fakeEmail)
                .PasswordInput(fakePassword)
                .ClickToSubmit();

        boolean isErrorDisplayed = home.isErrorMessageDisplayed();
        Assert.assertTrue(isErrorDisplayed, "Error message not displayed for invalid login credentials.");
    }



    @Test(priority = 3, groups = "UAT")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Password Reset Functionality")
    public void PasswordReset() throws InterruptedException{
        LoginPage home = new LoginPage(driver);
        home
                .ClickToUser()
                .ClickResetButton()
                .NumberField(mobileInput)
                .ClickSendButton();

    }

    }

