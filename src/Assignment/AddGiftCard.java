package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddGiftCard {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("$25 Virtual Gift Card")).click();
		
		 driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Trupti");
		 driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("john@gmail.com");
		 driver.findElement(By.id("giftcard_2_SenderName")).sendKeys("Anushka");
		 driver.findElement(By.id("giftcard_2_SenderEmail")).sendKeys("trupti@gmail.com");
		 driver.findElement(By.id("giftcard_2_Message")).sendKeys("Happy Birthday");
		 driver.findElement(By.id("addtocart_2_EnteredQuantity")).clear();
		 
		 driver.findElement(By.linkText("Shopping cart")).click();
         Thread.sleep(2000);
         driver.findElement(By.name("removefromcart")).click();
         driver.findElement(By.name("updatecart")).click();
         Thread.sleep(3000);
         driver.quit(); 
	}

}