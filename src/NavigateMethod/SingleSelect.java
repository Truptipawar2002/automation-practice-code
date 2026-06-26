package NavigateMethod;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pawar/Downloads/demo%20(1).html");
		Thread.sleep(3000);
		
		
		WebElement Single = driver.findElement(By.id("standars-cars"));
		 Select sel = new Select(Single);
		// System.out.println("");
		 
		sel.selectByIndex(1);
		if(sel.isMultiple()) {
			sel.deselectByIndex(1);
			
		} else {
			System.out.println("deselct can't be Performaed because it is single select dropdown menu");
		}
		
	}

}
