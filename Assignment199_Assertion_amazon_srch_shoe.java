package NGTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment199_Assertion_amazon_srch_shoe {
//Assertion demo whether new page is opened once the product is clicked on the home page in amazon.in
	WebDriver driver;
	@Test 
	public void testcase1() throws InterruptedException
	{

	//login
	 driver= new EdgeDriver();
	 driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	WebElement srch=   driver.findElement(By.id("twotabsearchtextbox"));
	 srch.sendKeys("Shoe");
	 srch.sendKeys(Keys.ENTER);
	 WebElement shoe_1 =driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
	 shoe_1.click();
	 
	 
	 
	 
	 //1st assertion to compare getting 2 getwindow handles 
	 
	 
	 Set<String> both= driver.getWindowHandles();
	 int sizeof=both.size();
	 
	 Assert.assertEquals(sizeof, 2,"sorry testcase is FAIL");
	 //System.out.println(sizeof);
	 
	 
	//second assert checking whether we launch correct child tab 
	 Iterator<String> s1= both.iterator();
	 String pid= s1.next();
	 String cid= s1.next();
	 driver.switchTo().window(cid);
	 driver.manage().window().maximize();
	 
	 
	 WebElement Buynowbutton=   driver.findElement(By.id("buy-now-button"));
	 
	 Assert.assertEquals(Buynowbutton.isDisplayed(), true,"sorry testcase is fail");
	// System.out.println("Thank you");
	 
	 
	 
	 
}}
