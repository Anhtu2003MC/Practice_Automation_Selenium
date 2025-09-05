package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        // Locate the edit box
        WebElement input = driver.findElement(By.id("autocomplete"));
	
	  // Check if enabled and perform operations
    if(input.isEnabled()) {
        input.sendKeys("India"); // Enter text
        System.out.println("Entered value: " + input.getAttribute("value"));
        
        input.clear(); // Clear text
        System.out.println("After clearing: " + input.getAttribute("value"));
    }
    Thread.sleep(5000);
    driver.quit();
}
	
}
