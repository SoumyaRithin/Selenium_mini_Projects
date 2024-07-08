package manish;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment205_timeOuts_AND_SKIP_TC_usingdependsOnMethods {
//Program  on timeOuts parameter And SKIP a testcase using dependsOnMethods 
	@Test(timeOut=10000)
	public void Login()
	{
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//Assert.assertFalse(true);
		
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods="Login")
	public void logout()
	{
		//Assert.assertFalse(true);
		System.out.println("Thank You...!!!!");
	}
	
	
}
