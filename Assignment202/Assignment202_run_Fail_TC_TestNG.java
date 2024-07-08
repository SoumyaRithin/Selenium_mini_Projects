package NGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment202_run_Fail_TC_TestNG {

	
	
	@Test
	
		public void testcase1()
		{
		ChromeDriver driver= new ChromeDriver();//launch browser
		driver.get("https://www.google.com/");
		//WebElement a1=driver.findElement(By.cssSelector("textarea#APjFqb"));
		WebElement a1=driver.findElement(By.cssSelector("manish"));
		a1.sendKeys("India");
		a1.sendKeys(Keys.ENTER);
	
		
		
		}
	
	
}
