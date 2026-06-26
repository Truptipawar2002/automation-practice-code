package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class FindElements1 {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/digital-downloads");
	Thread.sleep(3000);
	
	List<WebElement> addtocart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
	for(WebElement add : addtocart) {
		add.click();
		Thread.sleep(2000);
	}
	driver.findElement(By.linkText("Shopping cart")).click();
	List<WebElement> Remove = driver.findElements(By.xpath("//input[@name='removefromcart']"));
	for(WebElement Remove2 : Remove) {
		Remove2.click();
		Thread.sleep(2000);
	}
	driver.findElement(By.xpath("//input[@name='updatecart']")).click();

 }

}
