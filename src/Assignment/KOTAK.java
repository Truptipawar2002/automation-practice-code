package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class KOTAK {
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		
	    //maximize the Browser
	    driver.manage().window().maximize();
	    
		//Enter into Page
		driver.get("https://www.kotak.bank.in/");
		
		// want to hold 3 seconds
		Thread.sleep(3000);
		
		//close the browser
		driver.close();         
	}
	                   

}
