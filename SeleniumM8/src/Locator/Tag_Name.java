package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_Name {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> element = driver.findElements(By.tagName("a"));
		
		for(WebElement link:element) {
			
			
			System.out.println(link.getAttribute("href"));
		}
	}
}
