package AutomationTestingProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopLoginTest {

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
		
		//Verification (check if user is logged in )
		WebElement account = driver.findElement(By.className("account"));
		String loggedUser = account.getText();
		System.out.println("Logged in as " + loggedUser);
		
		//close the browser
		driver.quit();
		
		
		
	}

}
