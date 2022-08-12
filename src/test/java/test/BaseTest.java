package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import pages.SendMessagePage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {


    private WebDriver driver;
    private static final String GOOGLE_MAIL_URL = "https://mail.google.com/";


    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(GOOGLE_MAIL_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public SendMessagePage getSendMessagePage() {
        return new SendMessagePage(getDriver());
    }
}
