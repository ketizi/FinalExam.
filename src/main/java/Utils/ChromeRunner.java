package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class ChromeRunner {
    public static WebDriver driver = new ChromeDriver();
    @BeforeMethod
    public void setUp(){
        driver.get("https://psp.ge/");

        driver.manage().deleteAllCookies();


    }

    @BeforeTest
    public void openBrowser() {
        driver.manage().window().maximize();
        driver.get("https://psp.ge/");

    }

    @AfterTest
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}