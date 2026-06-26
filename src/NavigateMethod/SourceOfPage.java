package NavigateMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class SourceOfPage {
	public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com//");
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
	}

}
