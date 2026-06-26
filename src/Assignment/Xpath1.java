package Assignment;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com//");
    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]")).click();
    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/input")).click();
    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div[2]/input")).sendKeys("Trupti");
    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div[3]/input")).sendKeys("Pawar");
    Random random = new Random();
    int num = random.nextInt(10000);
    String email = "trupti" + num + "@gmail.com";
    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div[4]/input")).sendKeys(email);
    
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div[1]/div[2]/div[3]/div[2]/div[1]/input")).sendKeys("Trupti@123");
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div[1]/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("Trupti@123");
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div[1]/div[2]/div[4]/input")).click();
	}

}
