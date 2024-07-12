package handleDropDown;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropDowns {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =  new ChromeDriver();
		//implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//maximise window
		driver.manage().window().maximize();
		driver.get("");
	}

}
