package basicSelenium;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TableAssignment {
	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		WebElement DropDown1 = driver.findElement(By.name("fromPort"));
		Select firstDropDown = new Select(DropDown1);
		firstDropDown.selectByValue("Boston");
		WebElement DropDown2 =  driver.findElement(By.name("toPort"));
		Select secondDropDown =  new Select(DropDown2);
		secondDropDown.selectByVisibleText("London");
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		//Number of Rows
		int rows = driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		String arr[] = new String[rows];
		int r =1;
		for(int p =0; p<arr.length; p++) {
			arr[p] = driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
			System.out.println(arr[p]);
			r++;
		}
		Arrays.sort(arr);
		System.out.println("Minimum price is "+arr[0]);		
		for(int t = 1; t<=rows; t++) {
			String text = driver.findElement(By.xpath("//table[@class='table']//tr["+t+"]//td[6]")).getText();
			if(text.equals(arr[0])) {
				driver.findElement(By.xpath("//table[@class='table']//tr["+t+"]//td[1]")).click();
				break;
			}
		}
		driver.findElement(By.id("inputName")).sendKeys("shashank");
		driver.findElement(By.id("address")).sendKeys("Mahadevpura");
		driver.findElement(By.id("city")).sendKeys("Bangalore");
		driver.findElement(By.id("state")).sendKeys("Karnataka");
		driver.findElement(By.id("zipCode")).sendKeys("12345");
		WebElement cardType = driver.findElement(By.id("cardType"));
		Select cardTypeDropDown =  new Select(cardType);
		cardTypeDropDown.selectByIndex(1);
		driver.findElement(By.id("cardType")).sendKeys("123456789");
		WebElement creditCardMonth = driver.findElement(By.id("creditCardMonth"));
		creditCardMonth.clear();
		creditCardMonth.sendKeys("8");
		WebElement creditCardYear = driver.findElement(By.id("creditCardYear"));
		creditCardYear.clear();
		creditCardYear.sendKeys("November");
		driver.findElement(By.id("nameOnCard")).sendKeys("Shashank");
		driver.findElement(By.id("rememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		System.out.println(driver.findElement(By.xpath("//h1")).getText());
	}

}
