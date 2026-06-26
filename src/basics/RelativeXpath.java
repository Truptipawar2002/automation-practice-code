package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class RelativeXpath {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(2000);
	  //    Xpath by using Attribute
	  //	driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		
      //    using the X-path Group Index
      //	driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		
	  //    Using the X-path By Text function
		    WebElement Poll = driver.findElement(By.xpath("//Strong[text()='Community poll']"));
		    System.out.println(Poll.getText());
	}

}
