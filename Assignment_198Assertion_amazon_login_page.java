package NGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment_198Assertion_amazon_login_page {
//Assertion demo to check title of the amazon login page
	//ChromeDriver driver;
	EdgeDriver driver;
	@Test 
	public void testcase1() throws InterruptedException
	{

	//login
	 driver= new EdgeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	WebElement hellologin=  driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	hellologin.click();
	
	 WebElement mail=   driver.findElement(By.id("ap_email"));
	 
	//WebElement mail=   driver.findElement(By.id("ap_email_login"));
	 Thread.sleep(500);
	 mail.sendKeys("85254877979");
	 
	 WebElement submit=  driver.findElement(By.xpath("//input[@id='continue']"));
	 submit.click();
	 WebElement pswd=  driver.findElement(By.xpath("//input[@id='ap_password']"));
	 pswd.sendKeys("grotech@123");
	 WebElement sub=  driver.findElement(By.xpath( "//input[@id='signInSubmit']"));
	 sub.click();
	 
	 
	 //Assert checking 
	 
	 WebElement sreachtab=  driver.findElement(By.id("twotabsearchtextbox"));//weneed to locate searchtab and we can compare searchtab titile with assert .. then we can finallize our testcase is pass or fail really
	 Assert.assertEquals(sreachtab.isDisplayed(), true,"sorry Testcase is fail");
	 System.out.println(sreachtab.isDisplayed());
}
}
