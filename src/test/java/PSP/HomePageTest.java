package PSP;

import PageObject.HomePage;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static DataObject.HomePageData.search2;
import static DataObject.HomePageData.searchFor;
import static DataObject.LogInData.*;

public class HomePageTest extends ChromeRunner {

    @Test(priority = 1,groups = "regression")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify Search Functionality")
    public void SearchFunctionality() throws InterruptedException{
        HomePage page = new HomePage(driver);
        page
                .clickSignInButton()
                .emailInput(emailInput)
                .passwordInput(passwordInputLogIn)
                .clickToSubmit()
                .clickSearchBtn(searchFor);
    }

    @Test(priority = 2, groups = "smoke")
    @Severity(SeverityLevel.CRITICAL )
    @Description ("Verify Add to Cart Functionality")
    public void AddToCart () throws InterruptedException{
        HomePage page = new HomePage(driver);
        page
                .clickSignInButton()
                .emailInput(emailInput)
                .passwordInput(passwordInputLogIn)
                .clickToSubmit()
                .clickCosmeticBtn()
                .clickProductCheckbox()
                .chooseButton()
                .clickProduct2Checkbox()
                .chooseButton2()
                .dropDown()
                .clickDropdown()
                .clickToAddCart();


    }
    @Test(priority = 3,groups = "UAT")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Cart Functionality")
    public void CartFunctionality() throws InterruptedException {
        HomePage page = new HomePage(driver);
        page
                .clickSignInButton()
                .emailInput(emailInput)
                .passwordInput(passwordInputLogIn)
                .clickToSubmit()
                .chooseCity()
                .chooseTbilisi()
                .clickSearchBtn(search2)
                .deleteTitle()
                .clickCosmeticBtn()
                .clickMizonProduct()
                .clickChekbox3()
                .chooseButton3()
                .clickTheProduct1()
                .clickTheProduct2()
                .clickTheProduct3()
                .headerCart()
                .updateQuantity()
                .removeItem();
    }

    @Test (priority = 4, groups = "smoke")
    @Severity(SeverityLevel.MINOR)
    @Description("Website Footer Link Verification")
    public void VerifyNavigationMenu () throws InterruptedException{
        HomePage page = new HomePage(driver);

                    page.FooterNavigationMenu();


    }


    }






