package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class DwsPage7Product {
	public static void main(String[] args) throws InterruptedException{
ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com//");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Computers')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Electronics')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Apparel')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Jewelry')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Gift Cards\r\n')]")).click();
	    driver.close();
	}

}
