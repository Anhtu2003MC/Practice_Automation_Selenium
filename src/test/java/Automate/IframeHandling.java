package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();  
        // Step 1: Navigate to the iframes page
        driver.get("https://v1.training-support.net/selenium/iframes");
        System.out.println("Page title: " + driver.getTitle());      
     // Step 2: Switch to first iframe (index 0)
        driver.switchTo().frame(0);
        System.out.println("Switched to first iframe");   
     // Step 3: Find and click the button in first iframe
        WebElement firstFrameButton = driver.findElement(By.cssSelector("button"));
        System.out.println("First iframe button text: " + firstFrameButton.getText());
        firstFrameButton.click();
        System.out.println("Clicked first iframe button");
        System.out.println("Button text after click: " + firstFrameButton.getText());   
     // Step 4: Switch back to main content
        driver.switchTo().defaultContent();
        System.out.println("Switched back to main content");
        // Step 5: Switch to second iframe (index 1)
        driver.switchTo().frame(1);
        System.out.println("Switched to second iframe");
        
     // Step 6: Find and click the button in second iframe
        WebElement secondFrameButton = driver.findElement(By.cssSelector("button"));
        System.out.println("Second iframe button text: " + secondFrameButton.getText());
        secondFrameButton.click();
        System.out.println("Clicked second iframe button");
        System.out.println("Button text after click: " + secondFrameButton.getText());   
     // Step 7: Switch back to main content
        driver.switchTo().defaultContent();
        System.out.println("Switched back to main content");     
        // Step 8: Click back button (hypothetical - not present on actual page)
        // driver.findElement(By.id("back-button")).click();
        
        Thread.sleep(2000); // For demonstration only
        driver.quit();
        
	}

}

