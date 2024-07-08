package NGTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment_192_DataProvider_Ex {
	
	
	
	@DataProvider(name="data1")
	public Object[][] method1()
	{
		return new Object[][] {{"ram"},{"som"},{"dam"},{"mom"}};
		
	}
	@DataProvider(name="data2")
	public Object[][] method2()
	{
		return new Object[][] {{100},{345},{6788},{4566}};
		
	}
	/*@Test(dataProvider ="data1")

	public void testcase1(String name)
	{
		System.out.println(name.concat(" happy"));
	}*/
	
	@Test(dataProvider ="data2")

	public void testcase1(int rollno)
	{
		System.out.println(rollno+100);
	}

}
