package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By accountBtn = By.xpath("//*[@id=\"app\"]/header/div[2]/div[2]/div[1]/div[2]/div[1]/button[2]");
    By FirstInput = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/form/div[1]/div/input");
    By SecondInput = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/form/div[2]/div/input");
    By SubmitBtn = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/div[2]/form/button[1]");
    By SearchBtn = By.xpath("/html/body/div[1]/header/div[2]/div[2]/div[1]/div[1]/div/div[1]/input");
    By CosmeticBtn = By.xpath("//*[@id=\"app\"]/header/div[2]/div[2]/div[2]/div[1]/div/nav/a[2]");
    By Product1 = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[3]/div[2]/div[3]/div[3]/div/div[3]/label[4]/span");
    By ChooseBtn = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[3]/div[2]/div[2]/div/button[2]");
    By Product2 = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[3]/div[2]/div[3]/div[1]/ul/li[4]/label/span");
    By DropDown = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[3]/div[3]/div[1]/div[2]/ul/li[2]/div/button");
    By DropDownOPT = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[3]/div[3]/div[1]/div[2]/ul/li[2]/div/div/div[4]");
    By ProductAddBtn = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[3]/div[3]/div[2]/div[2]/a/div[1]/div[2]/div/button");
    By Mizon = By.xpath("//*[@id=\"app\"]/header/div[2]/div[2]/div[1]/div[1]/div/div[2]/div[2]/ul[1]/li/a");
    By Checkbox = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[2]/div[2]/div[3]/div[8]/div[2]/label[2]/span");
    By ChooseBtn2 = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[2]/div[2]/div[2]/div/button[2]");
    By AcneProduct1 = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[2]/div[3]/div[2]/div[1]/a/div[1]/div[2]/div/button");
    By AcneProduct2 = By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/div[2]/a/div[1]/div[2]/div/button");
    By AcneProduct3 = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[2]/div[3]/div[2]/div[3]/a/div[1]/div[2]/div/button");
    By City = By.xpath("//*[@id=\"app\"]/header/div[2]/div[2]/div[2]/div[2]/div/nav/span");
    By Tbilisi = By.xpath("//*[@id=\"app\"]/div[3]/div[1]/div[2]/div/ul/li[1]");
    By HeaderCart = By.xpath("//*[@id=\"app\"]/header/div[2]/div[2]/div[1]/div[2]/div[1]/button");
    By Quantity = By.xpath("//*[@id=\"app\"]/div[3]/div[1]/div[2]/div/div[1]/div[1]/div/div[3]");
    By DeleteBtn = By.xpath("//*[@id=\"app\"]/div[3]/div[1]/div[2]/div/div[2]/a[2]/button");
    By PurchaseBtn = By.xpath("//*[@id=\"app\"]/div[3]/div[1]/div[3]/a[1]/button");


    @Step("Click Sign In Button")
    public HomePage clickSignInButton() throws InterruptedException {
        driver.findElement(accountBtn).click();
        Thread.sleep(2000);
        return this;
    }

    @Step("Fill Email")
    public HomePage emailInput(String emailInput) {
        driver.findElement(FirstInput).sendKeys(emailInput);
        return this;
    }

    @Step("Fill Password ")
    public HomePage passwordInput(String passwordInput) {
        driver.findElement(SecondInput).sendKeys(passwordInput);
        return this;
    }

    @Step("Click on the Submit button.")
    public HomePage clickToSubmit() throws InterruptedException {
        driver.findElement(SubmitBtn).click();
        Thread.sleep(2000);
        return this;
    }

    @Step("Click on the Search button.")
    public HomePage clickSearchBtn(String searchFor) throws InterruptedException {
        driver.findElement(SearchBtn).sendKeys(searchFor);
        Thread.sleep(1000);
        return this;
    }

    @Step("Click on the cosmetic Button") // Verify Add to Cart Functionality - აქედაან
    public HomePage clickCosmeticBtn() throws InterruptedException {
        driver.findElement(CosmeticBtn).click();
        Thread.sleep(2000);
        return this;
    }


    @Step("Click on the product checkbox")
    public HomePage clickProductCheckbox() {
        driver.findElement(Product1).click();
        return this;
    }

    @Step("Click on the Choose Button")
    public HomePage chooseButton() throws InterruptedException {
        driver.findElement(ChooseBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(ChooseBtn)).click();
        Thread.sleep(3000);
        return this;

    }

    @Step("Click on the second product checkbox")
    public HomePage clickProduct2Checkbox() {
        driver.findElement(Product2).click();
        return this;
    }

    @Step("Click on the Choose Button2")
    public HomePage chooseButton2() throws InterruptedException {
        driver.findElement(ChooseBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(ChooseBtn)).click();
        Thread.sleep(3000);
        return this;

    }

    @Step("Click on the dropdown button")
    public HomePage dropDown() throws InterruptedException {
        driver.findElement(DropDown).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement catchElement = wait.until(ExpectedConditions.elementToBeClickable(DropDown));
        return this;

    }

    @Step("Click menu")
    public HomePage clickDropdown() throws InterruptedException {
        driver.findElement(DropDownOPT).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement catchElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ProductAddBtn));
        return this;

    }

    @Step("Click add to cart")
    public HomePage clickToAddCart() throws InterruptedException {
        WebElement hoverElement = driver.findElement(ProductAddBtn);
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverElement).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement catchElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ProductAddBtn));
        //  Thread.sleep(3000);
        return this;

    }

    @Step("Click on the Search button2.")
    public HomePage clickSearchBtn2(String searchFor) throws InterruptedException {
        driver.findElement(SearchBtn).sendKeys(searchFor);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(SearchBtn));
        return this;
    }

    @Step("Delete the previous title ")
    public HomePage deleteTitle() throws InterruptedException {
        driver.findElement(SearchBtn).clear();
        return this;
    }

    @Step("Click on the Search button3.")
    public HomePage clickSearchBtn3(String searchFor) throws InterruptedException {
        driver.findElement(SearchBtn).sendKeys(searchFor);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(SearchBtn));
        Thread.sleep(4000);
        return this;

    }

    @Step("Click to Mizon")
    public HomePage clickMizonProduct() throws InterruptedException {
        driver.findElement(Mizon).click();
        Thread.sleep(1000);
        return this;
    }

    @Step("Scrolling down ")
    public HomePage scrollToElement0() throws InterruptedException {
        JavascriptExecutor jsExucutor = (JavascriptExecutor) driver;
        jsExucutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(Mizon));
        Thread.sleep(2000);
        return this;
    }

    @Step("Click on the third product checkbox")
    public HomePage clickChekbox3() throws InterruptedException {
        driver.findElement(Checkbox).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(Checkbox));
        Thread.sleep(4000);
        return this;
    }

    @Step("Click on the Choose Button3")
    public HomePage chooseButton3() throws InterruptedException {
        driver.findElement(ChooseBtn2).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(ChooseBtn2)).click();
        Thread.sleep(3000);
        return this;
    }

    @Step("Scrolling down - 1 ")
    public HomePage scrollToElement1() throws InterruptedException {
        JavascriptExecutor jsExucutor = (JavascriptExecutor) driver;
        jsExucutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(AcneProduct1));
        Thread.sleep(2000);
        return this;
    }

    @Step("Click on the product1 to add it to your cart")
    public HomePage clickTheProduct1() throws InterruptedException {
        driver.findElement(AcneProduct1).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(AcneProduct1)).click();
        Thread.sleep(2000);
        return this;
    }

    @Step("Click on the product2 to add it to your cart")
    public HomePage clickTheProduct2() throws InterruptedException {
        driver.findElement(AcneProduct2).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(AcneProduct2)).click();
        Thread.sleep(2000);
        return this;
    }

    @Step("Click on the product3 to add it to your cart")
    public HomePage clickTheProduct3() throws InterruptedException {
        driver.findElement(AcneProduct3).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(AcneProduct3)).click();
        Thread.sleep(4000);
        return this;
    }

    @Step("Choose city")
    public HomePage chooseCity() {
        driver.findElement(City).click();
        return this;
    }

    @Step("Choose Tbilisi")
    public HomePage chooseTbilisi() {
        driver.findElement(Tbilisi).click();
        return this;
    }

    @Step("Click on the header cart")
    public HomePage headerCart() {
        driver.findElement(HeaderCart).click();
        return this;
    }

    @Step("Updating quantity")
    public HomePage updateQuantity() throws InterruptedException {
        WebElement quantityElement = driver.findElement(Quantity);
        Actions actions = new Actions(driver);
        actions.doubleClick(quantityElement).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(Quantity)).click();
        Thread.sleep(6000);
        return this;
    }

    @Step("Removing items")
    public HomePage removeItem() {
        driver.findElement(DeleteBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(DeleteBtn)).click();
        return this;
    }

    @Step("Verify Checkout Process")
    public HomePage checkout() {
        driver.findElement(PurchaseBtn).click();
        return this;
    }

    @Step("Verify Navigation Menu")
    public HomePage FooterNavigationMenu() {

        List<WebElement> footerLinks = driver.findElements(By.xpath("//*[@id=\"app\"]/footer//a"));

        for (WebElement link : footerLinks) {
            String LinkText = link.getText();
            System.out.println("Verifying link" + LinkText);

            link.click();
            String expectedTitle = LinkText; // Assuming the link text is the expected page title
            String actualTitle = driver.getTitle();

            if (actualTitle.contains(expectedTitle)) {
                System.out.println("Page loaded correctly:" + actualTitle);
            } else {
                System.out.println("Page not loaded correctly:" + actualTitle);
            }
            driver.navigate().back();


            // Re-locate the footer links
            footerLinks = driver.findElements(By.xpath("//*[@id=\"app\"]/footer//a"));

        }
        return this;
    }

        }




