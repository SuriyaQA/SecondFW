package SeleniumScript;

import org.openqa.selenium.WebDriver;
	
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Pratice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(1000);
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(1000);
		driver.navigate().back();//demowebshop
		Thread.sleep(1000);
		driver.navigate().forward();//instagram
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		
	}
}
