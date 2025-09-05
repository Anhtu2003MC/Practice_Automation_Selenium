package evaluationtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;


public class IframeAndWindowHandling {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Step 1: Navigate to iframe page
        driver.get("https://the-internet.herokuapp.com/iframe");

        // Step 2: Switch to iframe using id or name or WebElement
        driver.switchTo().frame("mce_0_ifr"); // iframe ka name or id

        // Step 3: Locate element inside iframe and interact
        WebElement textArea = driver.findElement(By.id("tinymce"));
        textArea.clear();
        textArea.sendKeys("Hello from inside the iframe!");

        // Step 4: Switch back to main content
        driver.switchTo().defaultContent();

        // Step 5: Open a new tab (JavaScriptExecutor can be used)
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.open('https://www.google.com','_blank');");

        // Step 6: Handle multiple tabs
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1)); // switch to new tab

        System.out.println("New Tab Title: " + driver.getTitle());

        // Step 7: Switch back to original tab
        driver.switchTo().window(tabs.get(0));
        System.out.println("Back to Original Tab: " + driver.getTitle());

        // Step 8: Close all tabs
        driver.quit();
    }
}
