package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIFrames {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		//Frame1
		
		WebElement element = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(element);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Shashank");
		
		driver.switchTo().defaultContent();
		
		//Frame2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Kumar");
		
		driver.switchTo().defaultContent();
		
		//Frame3 inner frame
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(frame3);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]")).click();
		driver.switchTo().defaultContent();
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		
		driver.switchTo().frame(frame4);
		
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Singh");
		
		
		
		
	}

}
