package basics;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomName {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/");

        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Trupti");
        driver.findElement(By.id("LastName")).sendKeys("Pawar");

        // Generate Random Email
        Random random = new Random();
        int num = random.nextInt(10000);

        String email = "trupti" + num + "@gmail.com";

        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys("Trupti@123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Trupti@123");
        driver.findElement(By.id("register-button")).click();
        Thread.sleep(3000);
        System.out.println("Registered Email: " + email);
        
    }
}