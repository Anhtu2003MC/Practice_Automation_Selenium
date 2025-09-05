package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollWebpageDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();

	WebElement searchBox = driver.findElement(By.id("gh-ac"));
		searchBox.sendKeys("Shoes");
//
//		WebElement searchBtn = driver.findElement(By.id("gh-btn"));
//		searchBtn.click();

//		// Explicit wait for results
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul.srp-results")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); // Scroll to bottom
		
		Thread.sleep(5000); // Small pause
		
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)"); // Scroll back to top

		searchBox = driver.findElement(By.id("gh-ac"));
	searchBox.clear();

	}

}
