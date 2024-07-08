package iRetry;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Assignment203RerunTCMultipletimesUsing_IretryAnalyzer {
//How to Re-run the TestCases for Multiple times Demostrate a Program Using IretryAnalyzer(I).
	
	
	@Test(retryAnalyzer=iRetry.Assignment203_iretry_Logic.class)
	public void testcase1() throws InterruptedException
	{

	//login
		EdgeDriver driver= new EdgeDriver();
	 driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	WebElement srch=   driver.findElement(By.id("twotabsearchtextbox"));
	 srch.sendKeys("Shoe");
	 srch.sendKeys(Keys.ENTER);
	 WebElement shoe_1 =driver.findElement(By.xpath("//@class='a-link-normal s-no-outline'][1]"));
	 // WebElement shoe_1 =driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
	 shoe_1.click();
}}
