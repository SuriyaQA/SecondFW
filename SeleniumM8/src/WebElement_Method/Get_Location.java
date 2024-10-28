package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location {

	public static void main(String[] args) {

		WebDriver driver  = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Point axis = driver.findElement(By.cssSelector("input[id='email']")).getLocation();

		int x_axis = axis.getX();
		int y_axis = axis.getY();
		
		System.out.println("Username Text Field ");
		System.out.println(x_axis);
		
		System.out.println(y_axis);
		
		
		Point axis1 = driver.findElement(By.cssSelector("div[id='passContainer']")).getLocation();
		
		System.out.println("Password text field");
		int x1_axis = axis1.getX();
		int y1_axis = axis1.getY();
		
		System.out.println(x1_axis);
		System.out.println(y1_axis);
		driver.quit();
	}
}
