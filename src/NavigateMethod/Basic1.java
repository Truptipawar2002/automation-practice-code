package NavigateMethod;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Basic1 {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com//");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.close();
	}

}
