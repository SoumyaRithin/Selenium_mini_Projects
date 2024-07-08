package TestNG_Maven.Project_TestNGMaven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//Using Maven and pom.xml file structure concept, login to facebook.com
public class testcase1 {
	@Test
	public void login_to_facebook_using_valid_credentianl()
	{
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		facebook_Login_Page fb=new facebook_Login_Page(driver);
		fb.un();
		fb.pswd();
		fb.login();
	}

}
