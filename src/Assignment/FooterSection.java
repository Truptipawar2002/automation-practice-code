package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class FooterSection {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demowebshop.tricentis.com/news/rss/1";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		Thread.sleep(3000);
		
		List<WebElement> link = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		Thread.sleep(2000);
		
//		for(WebElement fetch : link) {
//		    String url = fetch.getAttribute("href");
//		    driver.get(url);
//		    Thread.sleep(2000);
//		    driver.navigate().back();
//		}
//           driver.quit();
		
		
		for(WebElement fetch : link) {
		    fetch.click();
		    String actual_url = driver.getCurrentUrl();
		    if(url.equals(actual_url)) {
		    	driver.navigate().back();
		    	Thread.sleep(2000);
		    }
		   
		}
	}

}
