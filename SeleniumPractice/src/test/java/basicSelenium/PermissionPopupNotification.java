package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopupNotification {
	
	public static void main(String[] args) {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
	}

}
