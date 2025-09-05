package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        // Locate all checkboxes
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        
        // Operate on checkboxes
        for(WebElement checkbox : checkboxes) {
            if(!checkbox.isSelected()) {
                checkbox.click(); // Select if not selected
            }
            System.out.println("Checkbox " + checkbox.getAttribute("value") + 
                             " selected? " + checkbox.isSelected());
        }
        Thread.sleep(5000);
        driver.quit();
	}

}
