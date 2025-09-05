package evaluationtask;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class FormAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://way2automation.com/way2auto_jquery/registration.php#load_box");
        Thread.sleep(2000); // Let page load

        // 1. Click on the registration tab if needed
        // Not required if directly loaded

        // 2. Edit boxes: First name and Email
        driver.findElement(By.name("name")).sendKeys("John Doe");
        driver.findElement(By.name("phone")).sendKeys("9876543210");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("johndoe@test.com");

        // 3. Checkbox for agreeing to terms
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();

        // 4. Radio buttons 
        driver.findElement(By.cssSelector("input[type='radio']")).click(); 

       

        // Final pause to observe the result
        Thread.sleep(5000);

        driver.quit();
    }
}