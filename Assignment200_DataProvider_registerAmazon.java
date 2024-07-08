package NGTest;

import java.io.FileInputStream;

//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment200_DataProvider_registerAmazon {
	@DataProvider(name="register_details")
	public Object[][] method1()
	{
		Object d1[][]=new Object[5][4];
		d1[0][0]="soumya";
		d1[0][1]="85298467315";
		d1[0][2]="som@321";
		d1[0][3]="som@321";
		
		d1[1][0]="remya";
		d1[1][1]="85298467316";
		d1[1][2]="rem@321";
		d1[1][3]="rem@321";
		
		d1[2][0]="dhanya";
		d1[2][1]="85298467317";
		d1[2][2]="dhanz@321";
		d1[2][3]="dhanz@321";
		
		d1[3][0]="thara";
		d1[3][1]="85298467318";
		d1[3][2]="thara@321";
		d1[3][3]="thara@321";
		
		d1[4][0]="ammu";
		d1[4][1]="85298467319";
		d1[4][2]="ammu@321";
		d1[4][3]="ammu@321";
		return d1;
		
		
			
	}
	
	
	
	
	@Test(dataProvider="register_details")
	public void testcase1(String name,String number,String pswd,String cpswd) throws InterruptedException
	{
		
		FirefoxDriver driver =new FirefoxDriver();
	
	//ChromeDriver driver =new ChromeDriver();//launch browser
	 driver.get("https://www.amazon.com/");
Thread.sleep(3000);

	WebElement hover= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	 Actions a1=new Actions(driver);
	 a1.moveToElement(hover).perform();
	 Thread.sleep(3000);
	 WebElement signup=driver.findElement(By.linkText("Start here."));
	 signup.click();
	 	
	driver.findElement(By.id("ap_customer_name")).sendKeys(name);
	 
	driver.findElement(By.name("email")).sendKeys(number);
	driver.findElement(By.name("password")).sendKeys(pswd);
	driver.findElement(By.name("passwordCheck")).sendKeys(cpswd);
	 driver.findElement(By.id("continue")).click();
	 
	 
}
}
