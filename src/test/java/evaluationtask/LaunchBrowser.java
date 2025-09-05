package evaluationtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver is Selenium's interface to communicate with browser
		//ChromeDriver is the specific browser driver for Chrome
		WebDriver driver = new ChromeDriver();
		// opens the specific URL and launch the browser window
		driver.get("https://automationteststore.com/index.php?rt=account/login");
		//maximize the browser window
		driver.manage().window().maximize();
		
		// Wait for 3 seconds to observe
		Thread.sleep(3000);
		// Close the browser and ends session
		driver.quit();

	}

}
