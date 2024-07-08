package TestNG_Maven.Project_TestNGMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//Using Maven and pom.xml file structure concept, login to facebook.com
public class facebook_Login_Page {
	//step1: locate each element using  findBy annotation 
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(name="pass")
	WebElement password;
	
	
	@FindBy(xpath="//button[@name='login']")
	WebElement loginbutton;
	
//step 2; create a separate methods for each component to perform its action

	
	
	
	public void un()
	{
		username.sendKeys("soumya@gmail.com");
	}
	
	public void pswd()
	{
		password.sendKeys("1234");
	}
	public void login()
	{
		loginbutton.click();
	}
	
	//Step3. Initilizing each elements using PageFactory class inside the constructor
	//constructor can Initilizing elements
	
	public facebook_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);//this is local variable value intionalze to global
	}
	
	
}
