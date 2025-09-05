package AutomationTestingProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopLogout {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		//open the website
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		// click on login button
		WebElement loginLink = driver.findElement(By.className("ico-login"));
		loginLink.click();
		
		//Enter Email and password
		WebElement emailField = driver.findElement(By.id("Email"));
		emailField.sendKeys("gta9639@gmail.com");
		
		WebElement passwordField = driver.findElement(By.id("Password"));
		passwordField.sendKeys("123456");
		
		//Click on Log in  Button 
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginButton.click();
		
		driver.findElement(By.className("ico-logout")).click();
		// Verify logout was successful
		boolean isLoginVisible = driver.findElement(By.className("ico-login")).isDisplayed();
       if(isLoginVisible) {
    	   System.out.println("Successfully logged out.");
    	   
       }else {
    	   System.out.println("Logout faild.");
       }
       driver.quit();
	}

}
