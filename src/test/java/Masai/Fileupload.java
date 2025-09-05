package Masai;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();
        driver.findElement(By.id("filesToUpload")).sendKeys("C:\\Users\\shivshnkar gupta\\Documents\\photos\\fullpage.png");
        
        if(driver.findElement(By.xpath("//ul[@id= 'filelist']//li")).getText().equals("fullpage.png"))
        {
        	System.out.println("File uploaded successfully");
        }
        else {
        	System.out.println("File not uploaded");
        }
	}

}
