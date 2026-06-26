package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MultipleSelect {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pawar/Downloads/demo%20(1).html");
		Thread.sleep(3000);
		WebElement multiple = driver.findElement(By.id("multiple_cars"));
		Select sel = new Select(multiple);
		// select bases
//		sel.selectByVisibleText("BMW");
//		sel.selectByValue("for");
//		sel.selectByIndex(4);
		Thread.sleep(2000);
		
		// Deselect Base
//		sel.deselectByVisibleText("BMW");
//		sel.deselectByValue("for");
//		sel.deselectByIndex(4);
		
		// DeselectAll Base
//		sel.deselectAll();
		
		sel.selectByIndex(1);
		if(sel.isMultiple()) {
			sel.deselectByIndex(1);
			
		} else {
			System.out.println("deselct can't be Performaed because it is single select dropdown menu");
		}
		
		
	}

}
