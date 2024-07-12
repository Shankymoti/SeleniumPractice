package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplictWait {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait mywait =  new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		WebElement element = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h3[text()='Selenium'])[1]")));
		element.click();
				
	}

}
