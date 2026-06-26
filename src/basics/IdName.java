package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdName {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com//");
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
		Thread.sleep(3000);
		driver.findElement(By.id("small-searchTerms")).clear();
		
		
	}

}


