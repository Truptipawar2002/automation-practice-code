package Actions_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException{
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	
	Actions act = new Actions(driver);
	WebElement signUp = driver.findElement(By.xpath("//span[text() = 'Create new account']"));

	act.moveToElement(signUp).click().perform();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='_R_1cl2p4jikacppb6amH1_']")).sendKeys("Trupti");

    // Surname
  //  driver.findElement(By.name("lastname")).sendKeys("Pawar");
    
    Thread.sleep(2000);
	
	}
}
