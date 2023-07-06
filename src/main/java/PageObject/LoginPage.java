package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public static WebElement facebook;
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    By accountBtn = By.xpath("//*[@id=\"app\"]/header/div[2]/div[2]/div[1]/div[2]/div[1]/button[2]");
    By firstInput = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/form/div[1]/div/input");
    By secondInput = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/form/div[2]/div/input");
    By submitBtn = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/form/button[1]");
    By resetBtn = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/form/div[2]/div/button");
    By emailBtn= By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/form/div/div/input");
    By sendBtn= By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/form/button");


    @Step ("Click To Login")
    public LoginPage ClickToUser() throws InterruptedException {
        driver.findElement(accountBtn).click();
        Thread.sleep(2000);
        return this;
    }

    @Step ("Fill Email")
    public LoginPage EmailInput(String emailInput){
        driver.findElement(firstInput).sendKeys(emailInput);
        return this;
    }

    @Step ("Fill Password ")
    public LoginPage PasswordInput(String passwordInput){
        driver.findElement(secondInput).sendKeys(passwordInput);
        return this;
    }

    @Step("Click Submit Button")
    public LoginPage ClickToSubmit() throws InterruptedException {
            driver.findElement(submitBtn).click();
            Thread.sleep(2000);
            return this;

    }
    @Step ("Click Password Reset")
    public LoginPage ClickResetButton(){
        driver.findElement(resetBtn).click();
        return this;
    }
    @Step ("Fill Phone Number")
    public LoginPage NumberField(String number ) {
        driver.findElement(emailBtn).sendKeys(number);
        return this;
    }
    @Step ("Click the send button")
    public LoginPage ClickSendButton() {
        driver.findElement(sendBtn).click();
        return this;
    }
    public boolean isErrorMessageDisplayed() {
        try {
            WebElement errorMessage = driver.findElement(By.xpath("//div[@class='error-message']"));
            return errorMessage.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}

