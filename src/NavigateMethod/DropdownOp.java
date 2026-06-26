package NavigateMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOp {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pawar/Downloads/demo%20(1).html");
		Thread.sleep(3000);
		WebElement Single = driver.findElement(By.id("standard_cars"));
		 Select sel = new Select(Single);
		
//		List<WebElement> options = sel.getOptions();
//		int count = 0;
//		for(WebElement op : options) {
//			sel.selectByIndex(count++);
//			Thread.sleep(2000);
//		}
		 
		 List<WebElement> options = sel.getOptions();
		 for(WebElement fetch : options) {
			    String op = fetch.getText();
			    sel.selectByVisibleText(op);
			    Thread.sleep(2000);
			}
		

	}

}
