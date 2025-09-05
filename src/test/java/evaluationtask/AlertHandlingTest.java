package evaluationtask;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingTest {

    public static void main(String[] args) throws InterruptedException {
        // Step 1: Browser setup
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Step 2: Navigate to the URL
        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

        // Step 3: Handle simple Alert popup (Accept)
        driver.findElement(By.id("alertexamples")).click(); // Click on "Show alert box"
        Alert alert1 = driver.switchTo().alert(); // Switch to alert
        System.out.println("Alert Message: " + alert1.getText()); // Print message
        alert1.accept(); // Accept the alert (click OK)
        Thread.sleep(2000);
        // Step 4: Handle Confirmation popup (Accept)
        driver.findElement(By.id("confirmexample")).click(); // Click on "Show confirm box"
        Alert alert2 = driver.switchTo().alert();
        System.out.println("Confirmation Message: " + alert2.getText());
        alert2.accept(); // Click OK (You can also use alert2.dismiss() to click Cancel)
        Thread.sleep(2000);
        // Step 5: Handle Prompt popup (enter text and accept)
        driver.findElement(By.id("promptexample")).click(); // Click on "Show prompt box"
        Alert alert3 = driver.switchTo().alert();
        System.out.println("Prompt Message: " + alert3.getText());
        alert3.sendKeys("Selenium Test"); // Send input to prompt
        alert3.accept(); // Accept the prompt
         Thread.sleep(2000);
        // Step 6: Close browser
        driver.quit();
    }
}
