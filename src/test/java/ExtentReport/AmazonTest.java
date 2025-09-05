package ExtentReport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

@Listeners(AmazonTest.class)
public class AmazonTest extends BaseTest {

    @Test(groups = "smoke")
    public void searchLaptopTest() {
        ExtentListener.test = ExtentListener.extent.createTest("Amazon Laptop Search Test").assignCategory("Smoke Test");

        // Step 1: Open Amazon
        driver.get("https://www.amazon.com");
        ExtentListener.test.info("Navigated to Amazon homepage");

        // Step 2: Search for "Laptops"
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertNotNull(searchBox, "Search box is not present on the page");
        ExtentListener.test.info("Search box found");

        searchBox.sendKeys("Laptop");
        searchBox.submit();

        // Step 3: Validate Page Title
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Laptop"), "Page title does not contain 'Laptop'");
        ExtentListener.test.info("Page title contains 'Laptop'");

        // Step 4: Validate search results are not empty
        List<WebElement> results = driver.findElements(By.cssSelector("div.s-main-slot > div[data-component-type='s-search-result']"));
        Assert.assertTrue(results.size() > 0, "Search results are empty");
        ExtentListener.test.pass("Search results are displayed successfully");
    }
}
