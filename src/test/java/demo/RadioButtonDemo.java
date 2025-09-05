package demo;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        // Locate radio buttons
        List<WebElement> radios = driver.findElements(By.name("radioButton"));
        
        // Select first radio button
        radios.get(1).click(); // Selects Radio2
        
        // Print all radio states
        for(WebElement radio : radios) {
            System.out.println(radio.getAttribute("value") + 
                            " selected? " + radio.isSelected());
        }
        Thread.sleep(5000);
        driver.quit();
	}

}
