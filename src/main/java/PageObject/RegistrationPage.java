package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage {
    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    By accountBtn = By.xpath("//*[@id=\"app\"]/header/div[2]/div[2]/div[1]/div[2]/div[1]/button[2]");
    By registrationBtn = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/button");
    By firstInput = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/form/div[1]/div[1]/div/input");
    By secondInput = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/form/div[1]/div[2]/div/input");
    By thirdInput = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/form/div[2]/div/input");
    By fourthInput = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/form/div[3]/div/input");
    By fifthInput = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/form/div[4]/div/input");
    By sixthInput = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/form/div[5]/div/input");
    By seventhInput = By.xpath("//span[@class=\"checkbox__mark\"]\n");
    By eighthInput = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/form/button");

    @Step("Click To Login")
    public RegistrationPage ClickToUser() throws InterruptedException {
        driver.findElement(accountBtn).click();
        Thread.sleep(2000);
        return this;
    }
    @Step("Click To SigUp Button")
    public RegistrationPage ClickToRegister() throws InterruptedException {
        driver.findElement(registrationBtn).click();
        Thread.sleep(2000);
        return this;
    }
    @Step ("Fill First Name")
    public RegistrationPage ClickFirstNameInput(String nameInput){
        driver.findElement(firstInput).sendKeys(nameInput);
        return this;
    }
    @Step ("Fill Last Name")
    public RegistrationPage ClickLastNameInput(String surname){
        driver.findElement(secondInput).sendKeys(surname);
        return this;
    }
    @Step ("Fill Mobile Number")
    public RegistrationPage ClickMobileNumberInput(String mobileInput){
        driver.findElement(thirdInput).sendKeys(mobileInput);
        return this;
    }
    @Step ("Fill Email")
    public RegistrationPage ClickEmailField(String emailInput){
        driver.findElement(fourthInput).sendKeys(emailInput);
        return this;
    }
    @Step("Fill Password")
    public RegistrationPage PasswordField(String passwordInput){
        driver.findElement(fifthInput).sendKeys(passwordInput);
        return this;
    }
    @Step ("Fill Confirm Password")
    public RegistrationPage ConfirmPassword(String retryPasswordInput){
        driver.findElement(sixthInput).sendKeys(retryPasswordInput);
        return  this;
    }
    @Step("Mark Checkbox")
    public RegistrationPage Checkbox(){
        driver.findElement(seventhInput).click();
        return this;
    }
    @Step ("Click Submit Button")
    public RegistrationPage ClickToSubmit() throws InterruptedException {
        driver.findElement(eighthInput).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(eighthInput)).click();
        Thread.sleep(3000);
        return this;

    }
}


