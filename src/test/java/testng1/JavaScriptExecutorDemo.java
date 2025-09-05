package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutorDemo {

    public static void main(String[] args) throws InterruptedException {

        // Setup Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open the datepicker demo site
        driver.get("https://www.globalsqa.com/demo-site/datepicker/");

        // Switch to the correct iframe (important for accessing calendar)
        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame.lazyloaded")));

        // Locate the date input box
        WebElement dateInput = driver.findElement(By.id("datepicker"));

        // Create JavaScriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // ✅ Scroll to the date input field
        js.executeScript("arguments[0].scrollIntoView(true);", dateInput);
        Thread.sleep(1000); // wait to see scroll effect

        // ✅ Click on the hidden date input field
        js.executeScript("arguments[0].click();", dateInput);
        Thread.sleep(1000); // wait to see calendar

        // ✅ Pick a date (e.g., 15th)
        WebElement date = driver.findElement(By.xpath("//a[text()='15']"));
        js.executeScript("arguments[0].click();", date); // Click using JS if normal click fails

        // Wait and close
        Thread.sleep(2000);
        driver.quit();
    }
}

