package Actions_Method;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class Drag_Drop {
	public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Dynamic.html");
		
		Actions act = new Actions(driver);
		int count =0;
		for (int i = 0; i < 3; i++) {
		    WebElement drag = driver.findElement(By.id("angular"));
		    Thread.sleep(500);
		    WebElement drag2 = driver.findElement(By.id("mongo"));
		    Thread.sleep(500);
		    WebElement drag3 = driver.findElement(By.id("node"));
		    Thread.sleep(500);
		    WebElement drop = driver.findElement(By.id("droparea"));

		    act.dragAndDrop(drag, drop).perform();
		    count++;
		    act.dragAndDrop(drag2, drop).perform();
		    count++;
		    act.dragAndDrop(drag3, drop).perform();
		    count++;
		}
		
		System.out.println("Total Drag & Drop = " + count);
	}

}
