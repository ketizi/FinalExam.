package PSP;

import PageObject.CheckoutPage;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static DataObject.CheckoutPageData.*;
import static DataObject.LogInData.*;

public class CheckoutPageTest extends ChromeRunner {

    @Test(priority = 1, groups = "regression")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Checkout Process")
    public void VerifyCheckoutProcess() throws InterruptedException {
        CheckoutPage page = new CheckoutPage(driver);
        page
                .clickSignInButton()
                .emailInput(emailInput)
                .passwordInput(passwordInputLogIn)
                .clickToSubmit()
                .chooseCity()
                .chooseTbilisi()
                .clickCosmeticBtn()
                .clickMizonProduct()
                .scrollToElement0()
                .clickChekbox3()
                .chooseButton3()
                .clickTheProduct1()
                .clickTheProduct2()
                .clickTheProduct3()
                .headerCart() //"PROBLEM"
                .updateQuantity()
                .removeItem()
                .checkout()
                .addToTheAddress()
                .chooseTheAllCityOption()
                .chooseCity2()
                .fillTheAddress(AddressInput)
                .actualAddress()
                .fillOutTheName(Name)
                .fillOutTheLastname(Lastname)
                .fillInTheConfirmationButton()
                .instruction(Enterthetext)
                .addBankCard()
                .clickPaymentButton();

    }


    }



