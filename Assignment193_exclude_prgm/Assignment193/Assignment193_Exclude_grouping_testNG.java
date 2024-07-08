package NGTest;

import org.testng.annotations.Test;

public class Assignment193_Exclude_grouping_testNG {

		@Test(groups= {"smoke"})
		public void Testcase1()
		{
		System.out.println("smoke");
		}
		@Test(groups= {"system","smoke"})
		public void Testcase2()
		{
			System.out.println("smoke, system");
		}
		@Test(groups= {"smoke"})
		public void Testcase3()
		{
		 System.out.println("smoke");
		}
		@Test(groups= {"system"})
		public void Testcase4()
		{
		 System.out.println("system");	
		}
		@Test(groups= {"smoke"})
		public void Testcase5()
		{
		 System.out.println("smoke");
		}

	

}
