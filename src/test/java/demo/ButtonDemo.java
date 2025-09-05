package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 // Locate the alert button
	        WebElement button = driver.findElement(By.id("alertbtn"));
	        
	        // Check if enabled and perform operations
	        if(button.isEnabled()) {
	            System.out.println("Button text: " + button.getText());
	            button.click(); // Click button
	            System.out.println("Button clicked!");
	            
	            // Handle alert
	            driver.switchTo().alert().accept();
	        }
	        Thread.sleep(5000);
	        driver.quit();
	}

}
