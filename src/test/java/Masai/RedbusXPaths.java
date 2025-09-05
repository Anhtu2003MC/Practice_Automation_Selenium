package Masai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusXPaths {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.com/");

        // 20 different XPath locators for redbus.com
        String[] xpaths = {
            "//input[@id='src']",                          // 1. Source city input
            "//input[@id='dest']",                         // 2. Destination city input
            "//input[@id='onward_cal']",                   // 3. Date picker
            "//button[@id='search_btn']",                  // 4. Search button
            "//a[@class='redbus-logo']",                   // 5. Redbus logo
            "//a[contains(@href,'/info/redcare')]",        // 6. RedCare link
            "//div[@class='main-wrapper']",                // 7. Main wrapper div
            "//span[text()='BUS TICKETS']",               // 8. BUS TICKETS text
            "//li[@class='row clearfix']",                 // 9. Row clearfix element
            "//input[@name='email']",                      // 10. Email input
            "//i[@class='icon icon-close']",              // 11. Close icon
            "//div[@class='fl search-box clearfix']",      // 12. Search box
            "//label[@for='src']",                        // 13. Source label
            "//div[contains(@class,'bus-items')]",        // 14. Bus items container
            "//span[@class='f-bold']",                    // 15. Bold text span
            "//select[@id='rt_rt']",                      // 16. Return trip select
            "//img[@alt='redBus']",                       // 17. Redbus logo image
            "//a[@title='redBus']",                       // 18. Redbus title link
            "//div[@class='clearfix']",                   // 19. Clearfix div
            "//button[contains(@class,'search')]"         // 20. Search button alternative
        };

        // Verify each XPath
        for (int i = 0; i < xpaths.length; i++) {
            try {
                driver.findElement(By.xpath(xpaths[i]));
                System.out.println((i+1) + ". Valid XPath: " + xpaths[i]);
            } catch (Exception e) {
                System.out.println((i+1) + ". Invalid XPath: " + xpaths[i]);
            }
        }

        driver.quit();
    }
}