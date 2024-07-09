package current_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScripExecutor_Assignment208 {
	@Test
	public void testcase1() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//selenium implicit wait
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement aboutus= driver.findElement(By.linkText("About Us"));
	Point p1=	aboutus.getLocation();
	int X=p1.getX();
	int Y=p1.getY();
	System.out.println(X);
	System.out.println(Y);
	JavascriptExecutor  e1 = driver;
	//e1.executeScript("window.scrollBy(0,4000)");
	//Thread.sleep(400);
	//e1.executeScript("window.scrollBy(0,-4000)");
	
	e1.executeScript("window.scrollBy(0,"+Y+")");// it will scroll down ,upto end 
	Thread.sleep(400);
	e1.executeScript("window.scrollBy(0,-"+Y+")");// it will scroll up ,upto front 

	}

}
