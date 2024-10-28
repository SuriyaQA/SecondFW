package SeleniumScript;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_WIndow_Handles {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.instagram.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.facebook.com/");
		
		Set<String> adress = driver.getWindowHandles();
		
		for(String s:adress) {
			
			driver.switchTo().window(s);
			
			String url = driver.getCurrentUrl();
			
			if(url.contains("https://www.facebook.com/")) {
				driver.close();
			}
		}
		
	
		
	}
}
