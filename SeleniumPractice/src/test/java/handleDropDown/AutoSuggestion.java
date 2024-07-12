package handleDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		/*driver.get("https://www.bing.com/");
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='sa_tm_text']"));
		
		
		for(WebElement lis : list) {
			if(lis.getText().equals("selenium")) {
				lis.click();
				break;
			}
		}*/
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java tutorial");
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct PZPZlf']//div[@class='wM6W7d']/span"));
		
		System.out.println(list.size());
		for(WebElement listitem : list) {
			if(listitem.getText().contains("beginners")) {
				listitem.click();
				break;
			}
		}
		
		
	}
}
