package testng1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Checkboxhandling {
WebDriver driver;

@BeforeMethod 
void setup() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
}
@Test
void testCheckboxRadiobutton() throws InterruptedException
{
	// Select singlecheckbox1
	WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
	checkbox1.click();
	
	//Select multiple checkboxes
	driver.findElement(By.id("checkBoxOption2")).click();
	driver.findElement(By.id("checkBoxOption3")).click();
	
	//Select radio button
	WebElement radio1 = driver.findElement(By.xpath("//input[@value='radio1']"));
	radio1.click();
	Thread.sleep(2000);
}
@AfterMethod 
void tearDown() {
	driver.quit();
	
		
}

}
