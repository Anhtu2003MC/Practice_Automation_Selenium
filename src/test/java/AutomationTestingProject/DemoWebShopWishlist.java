package AutomationTestingProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopWishlist {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        //Open the DemoWeShop
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		//Go to books category and open a product
				driver.findElement(By.linkText("Books")).click();
				driver.findElement(By.linkText("Health Book")).click();
				//Click on "Add to Wishlist" button
				
				driver.findElement(By.id("add-to-wishlist-button-22")).click();
				
				Thread.sleep(3000);
                
				//Open Wishlist page
				
				driver.findElement(By.className("ico-wishlist")).click();
				
				//Verify product is listed in wishlist in wishlist
				boolean isHealthBookPresent = driver.getPageSource().contains("Health Book");
				
				if(isHealthBookPresent) {
					System.out.println("Health Book is successfully added to Wishlist.");
				}else {
					System.out.println("Health Book is  not in the Wishlist.");
				}
				//Close browser
				
				driver.quit();
				
	}

}
