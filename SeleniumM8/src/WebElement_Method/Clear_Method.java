package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Method {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		WebElement searchField = driver.findElement(By.cssSelector("input[id='small-searchterms']"));

		searchField.sendKeys("computer");

		Thread.sleep(2000);
		searchField.clear();
		Thread.sleep(2000);
		searchField.sendKeys("electronics");
	}
}
