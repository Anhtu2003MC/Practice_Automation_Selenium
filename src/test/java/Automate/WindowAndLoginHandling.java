package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowAndLoginHandling {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
        
        // Step 1: Navigate to login page
        driver.get("https://the-internet.herokuapp.com/login");
        System.out.println("Login page title: " + driver.getTitle());
        
     // Step 2: Store original window handle
        String originalWindow = driver.getWindowHandle();
        System.out.println("Original window handle: " + originalWindow);
        
        // Step 3: Click Elemental Selenium link (opens new tab)
        WebDriver elementalLink = (WebDriver) driver.findElement(By.linkText("Elemental Selenium"));
        ((WebElement) elementalLink).click();
        System.out.println("Clicked Elemental Selenium link");
        // Step 4: Wait for new window and switch to it
        Thread.sleep(2000); // In real code, use WebDriverWait
        
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.equals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                System.out.println("Switched to new window/tab");
                break;              

	}

}
     // Step 5: Perform actions in new tab
        // Enter email
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("test@example.com");
        System.out.println("Entered email address");
        // Select Python from dropdown
        Select languageDropdown = new Select(driver.findElement(By.id("language")));
        languageDropdown.selectByVisibleText("Python");
        System.out.println("Selected Python from dropdown");
        // Click submit button
        WebElement submitButton = driver.findElement(By.className("submit-button"));
        submitButton.click();
        System.out.println("Clicked submit button");
        // Step 6: Close the new tab
        driver.close();
        System.out.println("Closed new tab");
     // Step 7: Switch back to original window
        driver.switchTo().window(originalWindow);
        System.out.println("Switched back to original window");
        // Step 8: Perform login on main page
        // Enter username
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");
        System.out.println("Entered username");
     // Enter password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");
        System.out.println("Entered password");   
        // Click login button
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();
        System.out.println("Clicked login button");
     // Verification
        WebElement successMessage = driver.findElement(By.id("flash"));
        System.out.println("Login message: " + successMessage.getText());
        Thread.sleep(2000); // For demonstration only
        driver.quit();
        
	}
	
}