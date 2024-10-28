package SeleniumScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Window_Handle {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String adress = driver.getWindowHandle();
		
		System.out.println(adress);
		
		
	}
}
