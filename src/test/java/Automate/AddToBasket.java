package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://books.toscrape.com/");

        // Click the first book
        driver.findElement(By.cssSelector(".product_pod h3 a")).click();

        // Click 'Add to basket'
        driver.findElement(By.cssSelector("button.btn-add-to-basket")).click();

        // Check confirmation
        String message = driver.findElement(By.cssSelector(".alertinner")).getText();

        if (message.contains("has been added to your basket")) {
            System.out.println("Test Passed: Book added to basket.");
        } else {
            System.out.println("Test Failed: Book not added.");
        }

        driver.quit();
	}

}
