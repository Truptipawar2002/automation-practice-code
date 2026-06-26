package Actions_Method;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MyntraActions {
	public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		Actions act = new Actions(driver);
		WebElement kids= driver.findElement(By.xpath("//a[text() = 'Kids']"));
		
		act.moveToElement(kids).perform();
	    Thread.sleep(2000);
	    
	    
		
		
		
		
	}

}
