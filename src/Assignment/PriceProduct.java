package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceProduct {
	public static void main(String[] args) throws InterruptedException{
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com//");
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
	    
	    WebElement product1 = driver.findElement(By.xpath("//a[contains(text(),'3rd Album')]/../../div[3]/div/span"));
	    System.out.println(product1.getText());
	    
	    WebElement product2 = driver.findElement(By.xpath("//a[contains(text(),'Music 2')]/../../div[3]/div/span"));
	    System.out.println(product2.getText());
	    
	    WebElement product3 = driver.findElement(By.xpath("(//a[contains(text(),'Music 2')])[2]/../../div[3]/div/span"));
	    System.out.println(product3.getText());
	    
	    
	}
	

}
