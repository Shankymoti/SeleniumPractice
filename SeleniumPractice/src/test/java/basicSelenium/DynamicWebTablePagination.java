package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTablePagination {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		WebElement username =  driver.findElement(By.id("input-username"));
		
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.clear();
		
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[text()=' Sales']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		Thread.sleep(25000);
		
		//Find Totol No. of Pages in table
		
	/*	String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		
		System.out.println(text);
		//Showing 1 to 10 of 372 (38 Pages)
		int total_Pages = Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		System.out.println("total No. of Pages"+total_Pages);
	*/	
		//Find how many rows exist on each page
		for(int p=1; p<10; p++) {
			//JavascriptExecutor js = (JavascriptExecutor) driver;
		//	js.executeScript("window.scrollTo(0,document.body.scrollHeight");
			WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
			System.out.println("Active Page: "+ active_page.getText());
			//active_page.click();
			int rows  = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
			//Thread.sleep(5000);
			System.out.println("No.of rows: "+ rows);
			for(int r =1; r<=rows; r++) {
			String orderId =  driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
			String customer = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
			String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
			if(status.equals("Pending")) {
				System.out.println(orderId + " "+ customer + " "+ status + " ");
			}
			}
			String pageno = Integer.toString((p+1));
			System.out.println(pageno);
			driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageno+"']")).click();
			System.out.println(pageno);
			Thread.sleep(5000);
			
		}
	}
	

}
