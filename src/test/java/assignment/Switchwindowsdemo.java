
package assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Switchwindowsdemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Elemental Selenium")).click();
		
		//Handling window
		String mainwindow = driver.getWindowHandle();
		String childwindow = driver.getWindowHandle();
		driver.switchTo().window(mainwindow);
		
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click();
		//Take screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File img = new File("C:\\Users\\shivshnkar gupta\\Documents\\SeleniumScreenshot\\shiv.png");
		org.apache.commons.io.FileUtils.copyFile(image, img);
		
		
	}

}
