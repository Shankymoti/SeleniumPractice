package handleDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("(//div[@class='dropdown'])[1]")).click();
		
		List<WebElement> productTypes = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		
		System.out.println("Number of product types"+ productTypes.size());
		
	for(WebElement ptype: productTypes) {
		if(ptype.getText().equals("Loans")){
			ptype.click();
			break;
		}
	}
	
	//Second dropdown --> Product
	
	driver.findElement(By.xpath("(//div[@class='dropdown'])[2]")).click();

	List<WebElement> product = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
	
	for(WebElement pro: product) {
		if(pro.getText().equals("New Car Loan")) {
			pro.click();
			break;
		}
	}
	
	}

}
