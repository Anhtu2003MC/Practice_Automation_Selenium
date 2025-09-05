package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PracticePageTests extends BaseTest {
    @Test(priority = 1, groups = {"smoke"})
    public void testRadioButton() {
        WebElement radio2 = driver.findElement(By.cssSelector("input[value='radio2']"));
        radio2.click();
        System.out.println("Radio Button 2 clicked.");
        
    }
    @Test(priority = 2, dependsOnMethods = {"testRadioButton"}, groups = {"regression"})
    public void testSuggestionBox() {
        WebElement suggestion = driver.findElement(By.id("autocomplete"));
        suggestion.sendKeys("Ind");
        System.out.println("Suggestion box typed.");
    }
    @Test(priority = 3, groups = {"smoke"})
    public void testCheckbox() {
        WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
        checkbox.click();
        System.out.println("Checkbox Option 1 selected.");
    }
    @Test(priority = 4, groups = {"regression"})
    public void testDropdown() {
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        dropdown.sendKeys("Option2");
        System.out.println("Dropdown Option2 selected.");
    }
    
}
