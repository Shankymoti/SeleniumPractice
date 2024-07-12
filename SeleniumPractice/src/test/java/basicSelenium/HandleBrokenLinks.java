package basicSelenium;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleBrokenLinks {
public static void main(String[] args) throws MalformedURLException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	driver.get("http://www.deadlinkcity.com/");
	
	List<WebElement> links =  driver.findElements(By.tagName("a"));
	
	
	int brokenLink = 0;
	for(WebElement element: links) {
		String url =  element.getAttribute("href");
		
		if(url == null || url.isEmpty()) {
			System.out.println("URL is empty");
			continue;
		}
		
		//To convert String to URL
		URL link = new URL(url);
		try {
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			httpConn.connect();
			
			if(httpConn.getResponseCode()>=400) {
				brokenLink++;
				System.out.println(httpConn.getResponseCode()+url+" is "+" Broken Link ");
			}
			else {
				System.out.println(httpConn.getResponseCode()+url+" is "+" Valid link");
				
			}
		}catch(Exception e) {
			
		}
		
		
	}
	
	
	
}
}