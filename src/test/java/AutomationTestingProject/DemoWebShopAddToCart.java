package AutomationTestingProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopAddToCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        //Open the DemoWeShop
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//Navigate to product
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.linkText("Computing and Internet")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		
		Thread.sleep(3000);
		// verify the cart quantity increased
		WebElement cartQty = driver.findElement(By.className("cart-qty"));
		System.out.println("Cart Quantity: " + cartQty.getText());
		//Close browser
		driver.quit();
		
	}

}
