package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement radioButton = driver.findElement(By.cssSelector("input[id='pollanswers-1']"));
		
		boolean before = radioButton.isSelected();
		
		radioButton.click();
		
		boolean after = radioButton.isSelected();
		
		System.out.println("Before Action : "+ before );
		
		System.out.println("After Action :" + after);
	}
}
