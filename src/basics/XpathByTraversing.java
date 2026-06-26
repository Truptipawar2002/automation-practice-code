package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTraversing {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);

        // Child to Parent Traversing
        WebElement poll = driver.findElement(By.xpath("//input[@id='pollanswers-1']/../.."));

        System.out.println(poll.getText());
        Thread.sleep(2000);

        // preceding-sibling (backward traversal) Traversing 
        driver.findElement(By.xpath("//label[@for='pollanswers-1']/preceding-sibling::input[1]")).click();
        Thread.sleep(2000);

        // Following Sibling (forward traversal) Traversing
        driver.findElement(By.xpath("//input[@id='pollanswers-1']/following-sibling::label[1]")).click();
        Thread.sleep(2000);

        driver.quit();
    }
}