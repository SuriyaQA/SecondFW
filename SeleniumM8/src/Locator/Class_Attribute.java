package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Attribute {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		/*
		 *driver.findElement(By.className("search-box-text ui-autocomplete-input")).sendKeys("selenium");
		 * if class atribute value contains space means it will through invalid selector exception 
		 */
		
		driver.findElement(By.className("search-box-text")).sendKeys("laptop");
		
		driver.findElement(By.className("search-box-button")).click();
		
	}
}
