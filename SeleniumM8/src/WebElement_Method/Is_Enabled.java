package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enabled {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		
		boolean b = driver.findElement(By.cssSelector("input[class='form-control']")).isEnabled();
		
		if(b) {
			System.out.println("Element is enabled");
		}else {
			System.out.println("Element is disabled");
		}
	}
}
