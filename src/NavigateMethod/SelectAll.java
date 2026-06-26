package NavigateMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAll {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pawar/Downloads/demo%20(1).html");
		Thread.sleep(3000);
		
		WebElement Single = driver.findElement(By.id("standars-cars"));
		 Select sel = new Select(Single);
		
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='standard_cars']/option"));
		int optionCount = options.size();
		
		for(int i =0 ; i<optionCount; i++ ) {
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		driver.close();
	}

}
