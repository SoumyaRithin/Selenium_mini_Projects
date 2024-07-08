package NGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment_197_Dataprovider_amazonlogin {
	
	@DataProvider(name="login")
	public Object[][] method1()
	{
		Object d1[][]=new Object[5][2];
		
		
		d1[0][0]="soumya@gmail.com";
		d1[0][1]="heddnn678v12";
		
		d1[1][0]="remya@gmail.com";
		d1[1][1]="hedd56nnv12";
		
		d1[2][0]="dhaya@gmail.com";
		d1[2][1]="hedd3nnv12";
		
		d1[3][0]="thara@gmail.com";
		d1[3][1]="heddnnv12";
		
		d1[4][0]="rithin@gmail.com";
		d1[4][1]="hed45dnnv12";
		return d1;
		
	}
	
	
	
	@Test(dataProvider="login")
	public void testcase1(String username,String pswd)
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		login.click();
		

		WebElement loginpage = driver.findElement(By.xpath("//input[@id='ap_email']"));
		loginpage.sendKeys(username);
		WebElement submit = driver.findElement(By.xpath("//input[@id='continue']"));
		submit.click();	
		WebElement paswd = driver.findElement(By.xpath("//input[@id='ap_password']"));
		paswd.sendKeys(pswd);
		paswd.sendKeys(Keys.ENTER);
	}
	}
	


