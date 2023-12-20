package testngmkt;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerProg implements IRetryAnalyzer
{
	int count=0;
	int retrynum=3;
	@Override
	public boolean retry(ITestResult result) 
	{
		if(count<retrynum)
		{
			count++;
			return true;
		}
		return false;
	}

	
}
