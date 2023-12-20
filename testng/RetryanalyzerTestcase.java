package testngmkt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RetryanalyzerTestcase
{
	@Test(retryAnalyzer = testngmkt.RetryAnalyzerProg.class,timeOut = 300)
	public void testcase1()
	{
		WebDriver driver=new ChromeDriver();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
}
