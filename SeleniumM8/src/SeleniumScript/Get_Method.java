package SeleniumScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Get_Method {

	public static void main(String[] args) {
		
	RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
	}
}
