package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTabl {
	
	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		//Number of Rows
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rows);// For multiple table on page
		// For single table on web page System.out.println(driver.findElements(By.tagName("tr")).size());
		
		//Number of columns
		int col = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
		System.out.println(col); // for multiple table on web page
		//  for single table on web page
		//System.out.println(driver.findElements(By.tagName("th")).size());
		
		//Read data from specific row and column (5th row 1st col
		
		String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		
		System.out.println(data);
		//Read data from header
	/*	for(int r=1; r<=1; r++) {
			for(int c=1; c<=col; c++) {
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//th["+c+"]")).getText();
				System.out.println(value+"\t");
			}
		}
		
		//Read data from all rows and column
		for(int r=2; r<=rows; r++) {
			for(int c=1; c<=col; c++) {
				
				String value =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(value+"\t");
				
				
			}
		}
		*/
		// Print Book name whose author is Mukesh
		
	/*	for(int r=2; r<=rows; r++) {
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			//System.out.println(author);
			if(author.equals("Mukesh")) {
			String book =	driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			System.out.println("author is : "+author + "And Book is : "+book);
			}
		} */
		// find the total price of all books
		int totalPrice =0;
		for(int r=2; r<=rows; r++) {
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			totalPrice = totalPrice+ Integer.parseInt(price);
			//System.out.println(totalPrice);
		}
		
		System.out.println(totalPrice);
	}

}
