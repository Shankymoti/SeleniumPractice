package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleInnerIframe {
	
	public static void main(String[] args) {
	
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		driver.switchTo().frame("iframeResult");
		
		driver.switchTo().frame(0);
		System.out.println("Text inside inner frame"+driver.findElement(By.xpath("//h1")).getText());

		
		

		
	}

}
