package assignment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertshandlingdemo {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vig");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.id("alertBox")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.id("confirmBox")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.id("promptBox")).click();
		driver.switchTo().alert().accept();
		driver.quit();
		

	}
}
