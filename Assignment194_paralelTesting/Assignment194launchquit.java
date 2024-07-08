package paraleltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Assignment194launchquit {
	WebDriver driver;
	
	
	@BeforeMethod
	@Parameters("browser")
	public void lunch(String allbrowser)
	{
		if(allbrowser.equals("chrome"))
		{
			 driver =new ChromeDriver();	
		}
		if(allbrowser.equals("firefox"))
		{
			 driver =new FirefoxDriver();	
		}
		if(allbrowser.equals("edge"))
		{
			 driver =new EdgeDriver();	
		}
		//driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(4500);
		driver.quit();
	}
}
