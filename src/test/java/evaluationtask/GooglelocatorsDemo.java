package evaluationtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglelocatorsDemo {
	public static void main(String[] args) throws InterruptedException {
      // launch the browser
		WebDriver driver = new ChromeDriver();
		// open the google home page
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();	
		//Wait for page to load 
		Thread.sleep(2000);
		//using Name locator		
		WebElement searchBoxByName = driver.findElement(By.name("q"));
		searchBoxByName.sendKeys("Selenium using name");
		searchBoxByName.submit();
		Thread.sleep(3000);
		//go back to homepage		
		driver.navigate().back();
		Thread.sleep(2000);
		// Using CSS selector
		WebElement searchBoxByCSS = driver.findElement(By.cssSelector("textarea[name='q']"));
		searchBoxByCSS.sendKeys("Selenium Using cssSelector");
		 searchBoxByCSS.submit();
		 Thread.sleep(3000); 
		 driver.navigate().back();
		 Thread.sleep(2000);	 
		// Using Xpath  
		 WebElement searchBoxByXpath = driver.findElement(By.xpath("//textarea[@name='q']"));
		 searchBoxByXpath.sendKeys("Selenium using xpath");
		 searchBoxByXpath.submit();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(2000);
		 //using id
		 WebElement searchBoxByID = driver.findElement(By.id("APjFqb"));
		 searchBoxByID.sendKeys("Selenium using id");
		 searchBoxByID.submit();
		 Thread.sleep(3000);	 
		 driver.navigate().back();
		 Thread.sleep(2000);
		 //using the className
		 WebElement searchBoxByclass = driver.findElement(By.className("gLFyf"));
		 searchBoxByclass.sendKeys("Selenium using className");
		 searchBoxByclass.submit();
		 Thread.sleep(3000);	 
		 //Close the browser
		 driver.quit();
		
		
	}

}
