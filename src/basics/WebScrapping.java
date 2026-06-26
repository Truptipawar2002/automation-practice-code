package basics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebScrapping {
	public static void main(String[] args) throws InterruptedException{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(3000);
		
//	   WebElement register = driver.findElement(By.className("ico-register"));
//	   System.out.println("Text of Register "+register.getText());
//	   Thread.sleep(3000);
	   
//	   WebElement login = driver.findElement(By.className("ico-login"));
//	   System.out.println("Text for Login "+login.getText());
//	   Thread.sleep(3000);
		
		WebElement poll = driver.findElement(By.cssSelector(".block.block-poll>div>strong"));
		System.out.println("Text of Poll "+poll.getText());
		driver.close();
	}

}
