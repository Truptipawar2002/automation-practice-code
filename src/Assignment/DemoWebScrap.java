package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class DemoWebScrap {
public static void main(String[] args) throws InterruptedException{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(3000);
		
		 WebElement register = driver.findElement(By.className("ico-register"));
    	 System.out.println("Text of Register "+register.getText());
		 Thread.sleep(3000);
		 
		 WebElement login = driver.findElement(By.className("ico-login"));
    	 System.out.println("Text of Login "+login.getText());
		 Thread.sleep(3000);

		 WebElement ShoppingCart = driver.findElement(By.className("ico-cart"));
    	 System.out.println("Text of Shopping Card "+ShoppingCart.getText());
		 Thread.sleep(3000);
		 
		 WebElement WishList = driver.findElement(By.className("ico-wishlist"));
    	 System.out.println("Text of WishList "+WishList.getText());
		 Thread.sleep(3000);
}

}
