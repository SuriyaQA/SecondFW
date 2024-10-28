package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String attributevalue = driver.findElement(By.cssSelector("input[id='small-searchterms']")).getAttribute("value");
		
		System.out.println(attributevalue);
	}
}
