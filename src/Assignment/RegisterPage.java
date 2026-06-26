package Assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com//");
		WebElement register = driver.findElement(By.className("ico-register"));
		register.click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Trupti");
		driver.findElement(By.id("LastName")).sendKeys("Pawar");
		driver.findElement(By.id("Email")).sendKeys("tpu@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Pass@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Pass@123");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
