package iRetry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Assignment203_iretry_Logic implements IRetryAnalyzer
{
	int intial_count=0;
	int retry_count=3;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(intial_count<retry_count)
		{
			intial_count++;
			return true;
		}
		return false;
	}

}
