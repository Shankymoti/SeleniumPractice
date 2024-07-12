package basicSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesDemo {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://opensource-demo.orangehrmlive.com/");
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
		System.out.println("======================");
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		//First method for iteration
		Set<String> windowsIds = driver.getWindowHandles();
		
		Iterator<String> it = windowsIds.iterator();
		
		String parentWindowID =it.next();
		String childWindowID = it.next();
		
		System.out.println(parentWindowID);
		System.out.println(childWindowID);
		
		//Second method for iteration
		List<String> windowIdsList = new ArrayList<String>(windowsIds);//Converting set to List
		String parentwindowId  = windowIdsList.get(0);
		String childWindowId = windowIdsList.get(1);
		
		System.out.println(parentwindowId);
		System.out.println(childWindowId);
		
		//How to use window id's for switching
		
		driver.switchTo().window(parentwindowId);
		System.out.println("Parent window title"+driver.getTitle());
		driver.switchTo().window(childWindowId);
		System.out.println("child window title"+driver.getTitle());
		
		//we can do same thing with foreach loop
		
		
	    for(String windo : windowIdsList) {
	    	String title = driver.switchTo().window(windo).getTitle();
	    	System.out.println(title);
	    }
	    
	  // driver.close();
	    
	  //  driver.quit();
	    
	    //Suppose you want to close specific browser window
	    for(String wind: windowIdsList) {
	    	String title = driver.switchTo().window(wind).getTitle();
	    	if(title.equals("OrangeHRM"));
	    	driver.close();
	    }
	
	}
	
	

}
