package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By accountBtn = By.xpath("//*[@id=\"app\"]/header/div[2]/div[2]/div[1]/div[2]/div[1]/button[2]");
    By FirstInput = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/form/div[1]/div/input");
    By SecondInput = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/form/div[2]/div/input");
    By SubmitBtn = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/form/button[1]");
    By SearchBtn = By.xpath("/html/body/div[1]/header/div[2]/div[2]/div[1]/div[1]/div/div[1]/input");
    By CosmeticBtn = By.xpath("//*[@id=\"app\"]/header/div[2]/div[2]/div[2]/div[1]/div/nav/a[2]");
    By Product1 = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[3]/div[2]/div[3]/div[3]/div/div[3]/label[7]/span");
    By ChooseBtn = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[3]/div[2]/div[2]/div/button[2]");
    By Product2 = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[3]/div[2]/div[3]/div[1]/ul/li[4]/label/span");
    By DropDown = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[3]/div[3]/div[1]/div[2]/ul/li[2]/div/button");
    By DropDownOPT = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[3]/div[3]/div[1]/div[2]/ul/li[2]/div/div/div[4]");
    By ProductAddBtn = By.xpath("//*[@id=\"app\"]/header/div[2]/div[2]/div[1]/div[2]/div[1]/button");
    By Mizon = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[3]/div[2]/div[3]/div[3]/div/div[3]/label[7]/span");
    By Checkbox = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[3]/div[2]/div[3]/div[10]/div[2]/label[7]/span");
    By ChooseBtn2 = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[3]/div[2]/div[2]/div/button[2]");
    By AcneProduct1 = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[3]/div[3]/div[2]/div[1]/a/div[1]/div[2]/div");
    By AcneProduct2 = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[3]/div[3]/div[2]/div[2]/a/div[1]/div[2]/div");
    By AcneProduct3 = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[3]/div[3]/div[2]/div[3]/a/div[1]/div[2]/div");
    By City = By.xpath("//*[@id=\"app\"]/header/div[2]/div[2]/div[2]/div[2]/div/nav/span");
    By Tbilisi = By.xpath("//*[@id=\"app\"]/div[3]/div[1]/div[2]/div/ul/li[1]");
    By HeaderCart = By.xpath("//*[@id=\"app\"]/header/div[2]/div[2]/div[1]/div[2]/div[1]/button");
    By Quantity = By.xpath("//*[@id=\"app\"]/div[3]/div[1]/div[2]/div/div[1]/div[1]/div/div[3]");
    By DeleteBtn = By.xpath("//*[@id=\"app\"]/div[3]/div[1]/div[2]/div/div[2]/a[2]/button");
    By PurchaseBtn = By.xpath("//*[@id=\"app\"]/div[3]/div[1]/div[3]/a[1]/button");
    By AddressBtn = By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/div[1]/div/div[1]/div[2]/div/div[2]/button");
    By ChooseCity = By.xpath("//*[@id=\"city\"]/div/select");
    By AddressField = By.xpath("//*[@id=\"shipping-details-form\"]/div/div/div[1]/div[1]/div[1]/div[2]/div[1]/label/input");
    By AddressConfirm = By.xpath("/html/body/div[4]/div[1]/span[2]/span");
    By Name = By.xpath("//*[@id=\"firstName\"]");
    By Lastname = By.xpath("//*[@id=\"last-name\"]");
    By ConfirmButton = By.xpath("//*[@id=\"shipping-details-form\"]/div/button");
    By Instruction = By.xpath("//*[@id=\"floatingInput\"]");
    By AddCard = By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/div[1]/div/div[4]/div[2]/div/div/div/label");
    By OrderButton = By.xpath("//*[@id=\"orderButton\"]");


    @Step("Click Sign In Button")
    public CheckoutPage clickSignInButton() throws InterruptedException {
        driver.findElement(accountBtn).click();
        Thread.sleep(2000);
        return this;
    }

    @Step("Fill Email")
    public CheckoutPage emailInput(String emailInput) {
        driver.findElement(FirstInput).sendKeys(emailInput);
        return this;
    }

    @Step("Fill Password ")
    public CheckoutPage passwordInput(String passwordInput) {
        driver.findElement(SecondInput).sendKeys(passwordInput);
        return this;
    }

    @Step("Click on the Submit button.")
    public CheckoutPage clickToSubmit() throws InterruptedException {
        driver.findElement(SubmitBtn).click();
        Thread.sleep(2000);
        return this;
    }

    @Step("Click on the cosmetic Button") // Verify Add to Cart Functionality
    public CheckoutPage clickCosmeticBtn() throws InterruptedException {
        driver.findElement(CosmeticBtn).click();
        Thread.sleep(2000);
        return this;
    }

    @Step("Scrolling down the page")
    public CheckoutPage scrollToElement() throws InterruptedException {
        JavascriptExecutor jsExucutor = (JavascriptExecutor) driver;
        jsExucutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(CosmeticBtn));
        Thread.sleep(2000);
        return this;
    }

    @Step("Click on the product checkbox")
    public CheckoutPage clickProductCheckbox() {
        driver.findElement(Product1).click();
        return this;
    }

    @Step("Click on the Choose Button")
    public CheckoutPage chooseButton() throws InterruptedException {
        driver.findElement(ChooseBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(ChooseBtn)).click();
        Thread.sleep(3000);
        return this;

    }

    @Step("Click on the second product checkbox")
    public CheckoutPage clickProduct2Checkbox() {
        driver.findElement(Product2).click();
        return this;
    }

    @Step("Click on the Choose Button2")
    public CheckoutPage chooseButton2() throws InterruptedException {
        driver.findElement(ChooseBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(ChooseBtn)).click();
        Thread.sleep(3000);
        return this;

    }

    @Step("Click on the dropdown button")
    public CheckoutPage dropDown() throws InterruptedException {
        driver.findElement(DropDown).click();
        return this;

    }

    @Step("Click menu")
    public CheckoutPage clickDropdown() throws InterruptedException {
        driver.findElement(DropDownOPT).click();
        Thread.sleep(2000);
        return this;

    }

    @Step("Click add to cart")
    public CheckoutPage clickToAddCart() throws InterruptedException {
        WebElement hoverElement = driver.findElement(ProductAddBtn);
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverElement).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement catchElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ProductAddBtn));
        Thread.sleep(3000);
        return this;

    }

    @Step("Click on the Search button2.")
    public CheckoutPage clickSearchBtn2(String searchFor) throws InterruptedException {
        driver.findElement(SearchBtn).sendKeys(searchFor);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(SearchBtn));
        return this;
    }

    @Step("Delete the previous title ")
    public CheckoutPage deleteTitle() throws InterruptedException {
        driver.findElement(SearchBtn).clear();
        return this;
    }

    @Step("Click on the Search button3.")
    public CheckoutPage clickSearchBtn3(String searchFor) throws InterruptedException {
        driver.findElement(SearchBtn).sendKeys(searchFor);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(SearchBtn));
        Thread.sleep(4000);
        return this;

    }

    @Step("Click to Mizon")
    public CheckoutPage clickMizonProduct() throws InterruptedException {
        driver.findElement(Mizon).click();
        Thread.sleep(1000);
        return this;
    }

    @Step("Scrolling down ")
    public CheckoutPage scrollToElement0() throws InterruptedException {
        JavascriptExecutor jsExucutor = (JavascriptExecutor) driver;
        jsExucutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(Mizon));
        Thread.sleep(2000);
        return this;
    }

    @Step("Click on the third product checkbox")
    public CheckoutPage clickChekbox3() throws InterruptedException {
        driver.findElement(Checkbox).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(Checkbox));
        Thread.sleep(4000);
        return this;
    }

    @Step("Click on the Choose Button3")
    public CheckoutPage chooseButton3() throws InterruptedException {
        driver.findElement(ChooseBtn2).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(ChooseBtn2)).click();
        Thread.sleep(3000);
        return this;
    }

    @Step("Scrolling down - 1 ")
    public CheckoutPage scrollToElement1() throws InterruptedException {
        JavascriptExecutor jsExucutor = (JavascriptExecutor) driver;
        jsExucutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(AcneProduct1));
        Thread.sleep(2000);
        return this;
    }

    @Step("Click on the product1 to add it to your cart")
    public CheckoutPage clickTheProduct1() throws InterruptedException {
        driver.findElement(AcneProduct1).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(AcneProduct1)).click();
        Thread.sleep(2000);
        return this;
    }

    @Step("Click on the product2 to add it to your cart")
    public CheckoutPage clickTheProduct2() throws InterruptedException {
        driver.findElement(AcneProduct2).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(AcneProduct2)).click();
        Thread.sleep(2000);
        return this;
    }

    @Step("Click on the product3 to add it to your cart")
    public CheckoutPage clickTheProduct3() throws InterruptedException {
        driver.findElement(AcneProduct3).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(AcneProduct3)).click();
        Thread.sleep(4000);
        return this;
    }

    @Step("Choose city")
    public CheckoutPage chooseCity() {
        driver.findElement(City).click();
        return this;
    }

    @Step("Choose Tbilisi")
    public CheckoutPage chooseTbilisi() {
        driver.findElement(Tbilisi).click();
        return this;
    }

    @Step("Click on the header cart")
    public CheckoutPage headerCart() {
        driver.findElement(HeaderCart).click();
        return this;
    }

    @Step("Updating quantity")
    public CheckoutPage updateQuantity() throws InterruptedException {
        WebElement quantityElement = driver.findElement(Quantity);
        Actions actions = new Actions(driver);
        actions.doubleClick(quantityElement).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(Quantity)).click();
        Thread.sleep(6000);
        return this;
    }

    @Step("Removing items")
    public CheckoutPage removeItem() {
        driver.findElement(DeleteBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(DeleteBtn)).click();
        return this;
    }

    @Step("Verify Checkout Process")
    public CheckoutPage checkout() throws InterruptedException {
        driver.findElement(PurchaseBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       WebElement catchElement = wait.until(ExpectedConditions.elementToBeClickable(AddressBtn));
        return this;
    }

    @Step("Add to the address")
    public CheckoutPage addToTheAddress() throws InterruptedException {
        driver.findElement(AddressBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement catchElement = wait.until(ExpectedConditions.elementToBeClickable(AddressBtn));
        Thread.sleep(3000);
        return new CheckoutPage(driver);
    }

    @Step("Choose City2")
    public CheckoutPage chooseCity2() {
        driver.findElement(ChooseCity).click();
        Select selectOption = new Select(driver.findElement(ChooseCity));
        selectOption.selectByVisibleText("თბილისი");
        return this;
    }


    @Step("Choose the all city option")
    public CheckoutPage chooseTheAllCityOption() throws InterruptedException {
        driver.findElement(ChooseCity).click();
        Select selectOption = new Select(driver.findElement(ChooseCity));

        int dropDownSize = selectOption.getOptions().size();

        for (int i = 0; i < dropDownSize; i++) {
            selectOption.selectByIndex(i);
            Thread.sleep(7000);
        }
        return this;
    }


    @Step("Fill the address")
    public CheckoutPage fillTheAddress(String AddressInput) {
        driver.findElement(AddressField).sendKeys(AddressInput);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement catchElement = wait.until(ExpectedConditions.visibilityOfElementLocated(AddressConfirm));
        return this;
    }

    @Step("Choose current address")
    public CheckoutPage actualAddress() throws InterruptedException {
        driver.findElement(AddressConfirm).click();
        return this;
    }

    @Step("Fill out the name")
    public CheckoutPage fillOutTheName(String nameField) {
        driver.findElement(Name).sendKeys(nameField);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement catchElement = wait.until(ExpectedConditions.elementToBeClickable(Lastname));
        return this;
    }

    @Step("Fill out the lastname")
    public CheckoutPage fillOutTheLastname(String lastnameField) throws InterruptedException {
        driver.findElement(Lastname).sendKeys(lastnameField);
        Thread.sleep(5000);
        return this;
    }

    @Step("Click/Press the confirm button")
    public CheckoutPage fillInTheConfirmationButton() throws InterruptedException {
        driver.findElement(ConfirmButton).click();
        return this;
    }

    @Step("Instruction to courier")
    public CheckoutPage instruction(String Enterthetext) throws InterruptedException {
        driver.findElement(Instruction).sendKeys(Enterthetext);
        return this;
    }
    @Step ("Add bank card")
    public CheckoutPage addBankCard()throws InterruptedException{
        driver.findElement(AddCard).click();
        return this;
    }
    @Step ("Press the payment button")
    public CheckoutPage clickPaymentButton() throws InterruptedException{
        driver.findElement(OrderButton).click();
        Thread.sleep(3000);
        return this;

    }
}








