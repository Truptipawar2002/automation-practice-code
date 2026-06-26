package NavigateMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethod {
	
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		Thread.sleep(3000);
		
		WebElement sort = driver.findElement(By.id("products-orderby"));
		Select sel = new Select(sort);
		
		List<WebElement> options = sel.getOptions();
		int optionCount = options.size();
		
		 for (int i = 0; i < optionCount; i++) {

	            sort = driver.findElement(By.id("products-orderby"));
	            sel = new Select(sort);

	            sel.selectByIndex(i);

	            Thread.sleep(2000);
	        }

	        driver.quit();
	     }	
		
	}


