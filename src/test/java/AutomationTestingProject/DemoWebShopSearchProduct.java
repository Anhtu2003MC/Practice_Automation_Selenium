package AutomationTestingProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopSearchProduct {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        //Open the DemoWeShop
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//Locate the search input box and type the product name
		
		WebElement searchBox = driver.findElement(By.id("small-searchterms"));
		searchBox.sendKeys("laptop");
		
		//Click the search button 
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		
		//Wait and verify if results are shown
		
		Thread.sleep(3000);
		
		//Check if result list is displayed
		boolean resultsDisplayed = driver.findElements(By.cssSelector(".product-item")).size() > 0;
		if(resultsDisplayed) {
			System.out.println("Search successful. Products found.");
		}else {
			System.out.println("No products found.");
		}
		//Close the browser
		driver.quit();
		
		

	}

}
