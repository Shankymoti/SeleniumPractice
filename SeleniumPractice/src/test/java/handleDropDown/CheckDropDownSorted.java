package handleDropDown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropDownSorted {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://twoplugs.com/");
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		WebElement dropElement = driver.findElement(By.name("category_id"));
		Select dropSelect = new Select(dropElement);
		List<WebElement> options = dropSelect.getOptions();
		
		
		ArrayList<String> originalList = new ArrayList<String>();
		ArrayList<String> tempList = new ArrayList<String>();
		
		
		for(WebElement option: options) {
			originalList.add(option.getText());
			tempList.add(option.getText());
		}
		
		System.out.println("Original List"+originalList);
		System.out.println("Temporary List"+tempList);
		
		Collections.sort(tempList);
		System.out.println("Original List"+originalList);
		System.out.println("Temporary List"+tempList);
		
		
		if(originalList.equals(tempList)) {
			System.out.println("DropDown sorted....");
			
		}
		else {
			System.out.println("DropDown Unsorted...");
			
		}
		driver.close();
		
		
		
		
		
		
	}

}
