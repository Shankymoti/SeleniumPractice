package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDisplayed_Enabled_Selected {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/register");
		WebElement searchstore = driver.findElement(By.id("small-searchterms"));
		System.out.println(searchstore.isEnabled());
		System.out.println(searchstore.isDisplayed());
		WebElement male = driver.findElement(By.id("gender-male"));
		System.out.println(male.isSelected());
		male.click();
		System.out.println(male.isSelected());
		WebElement female = driver.findElement(By.id("gender-female"));
		System.out.println(female.isSelected());
		female.click();
		System.out.println(female.isSelected());
		
	}

}
