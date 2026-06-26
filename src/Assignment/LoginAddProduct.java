package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAddProduct {
		public static void main(String[] args) throws InterruptedException{
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com//");
			driver.findElement(By.xpath("//a[text()='Log in']")).click();
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("truptipawar.cc@gmail.com");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Trupti@123");
			driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
		    driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		    driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		    driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
		    driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("(//input[contains(@name,'removefromcart')])[1]")).click();
		    driver.findElement(By.xpath("(//input[contains(@name,'removefromcart')])[2]")).click();
		    driver.findElement(By.xpath("(//input[contains(@name,'removefromcart')])[3]")).click();
		    driver.findElement(By.xpath("(//input[contains(@name,'removefromcart')])[4]")).click();
		    driver.findElement(By.xpath("(//input[contains(@name,'removefromcart')])[5]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		    driver.close();
	}

}
