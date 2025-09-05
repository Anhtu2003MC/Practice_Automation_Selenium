package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/iframes");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.id("actionButton")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']"));
	     driver.switchTo().frame(frame2);
	     driver.findElement(By.id("actionButton")).click();
	     driver.switchTo().defaultContent();
	     
	     driver.quit();
	}

}
