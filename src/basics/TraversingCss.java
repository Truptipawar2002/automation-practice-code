package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraversingCss {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(2000);
	    driver.findElement(By.cssSelector("ul[class='poll-options']>li>label")).click();
	    
	    Thread.sleep(3000);
	    
	}

}
