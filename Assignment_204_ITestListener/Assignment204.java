package ITestListener;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Assignment204_TestListners.class)
public class Assignment204 extends Assignment204_TestListners {
//Using ITestListener, take the screenshots if the test case is passed or failed, and store them at their respective locations.
	@Test(priority=0)
	public void srch_shoe() throws InterruptedException, IOException
	{
	 driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	 WebElement srch=   driver.findElement(By.id("twotabsearchtextbox"));
	 srch.sendKeys("Shoe");
	 srch.sendKeys(Keys.ENTER);
	 
	 //screenshot
	 TakesScreenshot a1=driver; 
		Thread.sleep(2000);
		File source =a1.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("/home/sakthi/Desktop/grotech/ram.png"); 
		FileHandler.copy(source, destination); 
		

}}
