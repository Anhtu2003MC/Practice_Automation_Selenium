package testng1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRMLogin {
  WebDriver driver;
  @BeforeMethod
	void launchbrowser() throws InterruptedException
	{
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(4000);
		
	}
  @Test (priority = 1)
	void validatelogo() throws InterruptedException
	{
		WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		System.out.println("Logo is present:" + logo.isDisplayed());
		Thread.sleep(4000);
	}
	@Test (priority = 2)
	void login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(4000);
	}
	
	@AfterMethod 
     void teardown()
     {
    	 driver.close();
     }
}
