package testng1;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerificationTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void verifyHomePageTitle() {
        driver.get("https://bookcart.azurewebsites.net/");
        String expectedTitle = "Bookcart";
        String actualTitle = driver.getTitle();
        assert actualTitle.contains(expectedTitle) : "Title doesn't match!";
    }

    @Test
    public void verifyLoginPageTitle() {
        driver.get("https://bookcart.azurewebsites.net/login");
        String expectedTitle = "Login";
        String actualTitle = driver.getTitle();
        assert actualTitle.contains(expectedTitle) : "Title doesn't match!";
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

