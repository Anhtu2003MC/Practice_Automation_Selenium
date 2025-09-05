package Automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://books.toscrape.com/");
        String expectedTitle = "All products | Books to Scrape - Sandbox";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test Passed: Title is correct.");
        } else {
            System.out.println("Test Failed: Title is incorrect.");
        }

        driver.quit();


	}

}
