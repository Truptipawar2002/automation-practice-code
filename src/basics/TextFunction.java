package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFunction {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com//");
	    Thread.sleep(2000);
	    
	    // Using Xpath Bycontains By Text   
	    // driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
	    
	    // Using the Xpath by cotains by Attribute
	    driver.findElement(By.xpath("//input[contains(@class,'search-box-text')]")).sendKeys("gift");
	   
	}

}

