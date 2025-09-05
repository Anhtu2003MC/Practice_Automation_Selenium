package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickCategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://books.toscrape.com/");

        // Click on "Science" category instead of nonexistent "Non-fiction"
        driver.findElement(By.linkText("Science")).click();

        String heading = driver.findElement(By.cssSelector(".page-header.action h1")).getText();

        if (heading.equals("Science")) {
            System.out.println("Test Passed: Navigated to Science category.");
        } else {
            System.out.println("Test Failed: Incorrect category.");
        }

        driver.quit();
	}

}
