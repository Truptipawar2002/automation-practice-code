package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWeb {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com//");
		driver.findElement(By.id("pollanswers-1")).click();
		//driver.findElement(By.id("pollanswers-1")).clear();
		driver.findElement(By.id("pollanswers-2")).click();
		driver.findElement(By.id("pollanswers-3")).click();
		driver.findElement(By.id("pollanswers-4")).click();
		Thread.sleep(3000);
		// driver.close();
	   }

}
