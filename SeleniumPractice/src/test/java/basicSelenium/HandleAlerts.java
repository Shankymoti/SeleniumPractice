package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
	
	/*driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	//Alert window with ok button
	driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	
	driver.switchTo().alert().accept();
	
	
	//Alert window with ok and cancel button
	driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	
	Thread.sleep(3000);
	
	//driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	
	//Alert window with input box, capture text from alert
	
	driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	
	Thread.sleep(3000);
	
	Alert alertWindow = driver.switchTo().alert();
	System.out.println("The message displayed on alert: "+alertWindow.getText());
	
	alertWindow.sendKeys("Shashank");
	alertWindow.accept();
	
	
	*/
	
	//Authentication POPUP
	
	//pass username and password in url
	
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	
	
	
	
	
	
	
	
	
}
}
