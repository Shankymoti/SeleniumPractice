package basicSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.linkText("Today's Deals")).click();
		//driver.findElement(By.partialLinkText("Today's")).click();
		
		//How to capture all the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//how many links are there on WebPage
		System.out.println(links.size());
		
		//To print linkText and link
		
		for(int i=0; i<links.size(); i++) {
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}
		
		
		for(WebElement link : links) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}
	}
	

}
