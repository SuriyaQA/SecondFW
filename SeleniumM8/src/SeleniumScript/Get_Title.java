package SeleniumScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String title1= driver.getTitle();
		
		System.out.println(title1);//demowebshop
		
		if(title1.contains("Demo Web Shop")) {
			System.out.println("Test Case1 Pass");
		}
		else {
			System.out.println("Test Case1 Fail");
		}
		
		driver.get("https://www.instagram.com/");
		
		String title2 = driver.getTitle();
		
		System.out.println(title2);//Instagram
		
		if(title2.contains("Instagram")) {
			System.out.println("Test Case2 Pass");
		}
		else {
			System.out.println("Test Case2 Fail");
		}
	}
}
