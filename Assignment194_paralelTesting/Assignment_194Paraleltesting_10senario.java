package paraleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class Assignment_194Paraleltesting_10senario extends Assignment194launchquit{
	
	/*
 Demonstrate parallel testing for amazon.in having 10 scenarios using minimum 3 browsers.(goto 'notes' tab for more info line:636)
	10 scsnerios to automate using Parallel Testing	
*/
	@Test
	public void testcase1() throws InterruptedException
	{ //1. Search shoe->click on 1st shoe
		 WebElement srch=   driver.findElement(By.id("twotabsearchtextbox"));
		 srch.sendKeys("Shoe");
		 srch.sendKeys(Keys.ENTER);
		 Thread.sleep(1500);
		 WebElement shoe_1 =driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
	     shoe_1.click();
	     Thread.sleep(1500);
	}
	
	@Test
	public void testcase2() throws InterruptedException
	{ //2. search mobile->click on the 1st mobile
		WebElement srch=   driver.findElement(By.id("twotabsearchtextbox"));
		 srch.sendKeys("mobile");	
		 srch.sendKeys(Keys.ENTER);
		 WebElement mob_1 =driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		 mob_1.click();
		 Thread.sleep(1500);
	}
	
	
	
	@Test
	public void testcase3() throws InterruptedException
	{ //3. search mouse -> sort Get It in 2 Days->click on 1st product
	
		WebElement srch=   driver.findElement(By.id("twotabsearchtextbox"));
		 srch.sendKeys("mouse");	
		 srch.sendKeys(Keys.ENTER);
		 Thread.sleep(1500);
		 WebElement getitin2days =driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[3]"));
		 getitin2days.click();
		 Thread.sleep(1500);
	
	}
	
	
	
	
	
	
	@Test
	public void testcase4() throws InterruptedException
	{ //4. search mobile cover->Include Out of Stock checkbox
		WebElement srch=   driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("mobile cover");	
		 srch.sendKeys(Keys.ENTER);
		 Thread.sleep(1500);
		 WebElement includeoutofstock =driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[143]"));
		 Thread.sleep(1500);
		 includeoutofstock.click();
		
		
	}
	
	
	
	
	
	@Test
	public void testcase5() throws InterruptedException
	{ //5. search camera->click on 15th camera	
		
		WebElement srch=   driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("camera");	
		 srch.sendKeys(Keys.ENTER);
		 WebElement fifteenthcamera =driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[15]"));
		 fifteenthcamera.click();
		 Thread.sleep(1500);
		
	}
	
	
	
	
	@Test
	public void testcase6() throws InterruptedException
	{ //6. after launch->click on electronics major tab->select brand as redmi
		Thread.sleep(1500);
		WebElement electronics=   driver.findElement(By.xpath("(//a[@class='nav-a  '])[10]"));	
		Thread.sleep(1500);
		electronics.sendKeys(Keys.ENTER);
		//electronics.click();
		Thread.sleep(1500);
		WebElement redmi =driver.findElement(By.xpath("(//a[@class='a-link-normal'])[7]"));
		Thread.sleep(1500);
		redmi.sendKeys(Keys.ENTER);
		//redmi.click();
		
		
		
	}
	
	
	
	
	@Test
	public void testcase7() throws InterruptedException
	{ //7. launch home page->dropdown->amazon fresh->serach for mango
		
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(e1);
		s1.selectByVisibleText("Amazon Fresh");
		Thread.sleep(1500);
		WebElement srch=   driver.findElement(By.id("twotabsearchtextbox"));
		 srch.sendKeys("mango");
		 srch.sendKeys(Keys.ENTER);
		 Thread.sleep(1500);
		
	}
	
	
	
	
	@Test
	public void testcase8() throws InterruptedException
	{ //8. launch home page->dropdown books->serach for "power of mind"->click on the 1st product
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(e1);
		s1.selectByVisibleText("Books");
		WebElement srch=   driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("power of mind");
		srch.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		WebElement bookone=   driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		bookone.click();
		Thread.sleep(1500);
	}
	
	
	
	
	@Test
	public void testcase9() throws InterruptedException
	{ //9.Launch home page->click on todays deals->deals of the day->click on the 1st product
		
		WebElement todaysdeal=   driver.findElement(By.xpath("(//a[@class='nav-a  '])[6]"));	
		
		todaysdeal.click();
		Thread.sleep(1500);
		WebElement firstproduct =driver.findElement(By.xpath("(//a[@class='a-color-base a-link-normal ProductCard-module__cardContainingLink_OkTYz2ZO_0za69shksJ7 a-text-normal'])[1]"));
		firstproduct.click();
		
	}
	
	
	
	
	@Test
	public void testcase10() throws InterruptedException
	{ //10. serach shoe->go back go home page
		WebElement srch=   driver.findElement(By.id("twotabsearchtextbox"));
		 srch.sendKeys("Shoe");
		 srch.sendKeys(Keys.ENTER);
		 Thread.sleep(500);
		 driver.navigate().back();
	}
	
	
	
}
