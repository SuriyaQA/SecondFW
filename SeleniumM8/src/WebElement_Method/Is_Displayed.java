package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement element = driver.findElement(By.cssSelector("input[id='small-searchterms']"));
		
		boolean b = element.isDisplayed();
		
		if(b) {
			System.out.println("Element is present");
			element.sendKeys("computer");
		}else {
			System.out.println("Element is not present");
		}
	}
}
