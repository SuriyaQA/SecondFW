package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Rect {

	public static void main(String[] args) {

		WebDriver driver  = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Rectangle element = driver.findElement(By.cssSelector("input[id='email']")).getRect();

		System.out.println(element.getHeight());

		System.out.println(element.getWidth());

		System.out.println(element.getX());

		System.out.println(element.getY());


	}
}
