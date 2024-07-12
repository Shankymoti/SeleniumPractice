package handleDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.zoho.com/commerce/free-demo.html");
		WebElement dropDownElement = driver.findElement(By.id("zcf_address_country"));
		Select dropCountry = new Select(dropDownElement);
		//By using methods
		//dropCountry.selectByVisibleText("China");
		//dropCountry.selectByValue("Mexico");
		//here index starts with zero
		//dropCountry.selectByIndex(12);
		
		//Selecting option from dropdown without using methods
		
		List<WebElement> allOptions = dropCountry.getOptions();
		for(WebElement option : allOptions) {
			if(option.getText().equals("China")) {
				option.click();
				break;
			}
		}
		// to print all options 
		/*System.out.println("No. of options in dropdown"+ allOptions.size());
		for(int i=0; i<allOptions.size(); i++) {
			//get() is used to fetch data from list collection
			System.out.println(allOptions.get(i).getText());
		}*/
		//or
		for(WebElement options : allOptions) {
			System.out.println(options.getText());
		}
		//driver.close();
		
	}
}
