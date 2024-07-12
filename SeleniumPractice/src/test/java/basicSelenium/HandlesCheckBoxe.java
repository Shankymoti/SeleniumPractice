package basicSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlesCheckBoxe {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	//select specific checkbox 
	
	driver.findElement(By.id("monday")).click();
	
	//select all checkbox
	List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
	System.out.println(checkboxes.size());
	for(WebElement box: checkboxes) {
		box.click();
	}
	
	// by using for loop
	for(int i=0; i<checkboxes.size(); i++) {
		checkboxes.get(i).click();
	}
	
	//Selecting multiple checkboxes by choice
	for(WebElement box : checkboxes) {
		
		String checkboxName = box.getAttribute("id");
		
		if(checkboxName.equals("monday")||checkboxName.equals("sunday") || checkboxName.equals("tuesday")) {
			box.click();
		}
	}
	
	//Selecting last 2 checkboxs
	//Total no. of check boxes - no. of checkbox you want to select = starting index
	int totalCheckBox = checkboxes.size();
	for(int i= totalCheckBox-2; i<totalCheckBox; i++) {
		checkboxes.get(i).click();
	}
	
	
	//Select first 2 checkBoxes
	for(int i=0; i<totalCheckBox; i++) {
		if(i<2) {
			checkboxes.get(i).click();
		}
	}
}
}
