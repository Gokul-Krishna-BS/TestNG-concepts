package testngmkt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserLaunchEqualsIgnoreCase
{
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void launchbrowser(String name)
	{
		if(name.equalsIgnoreCase("Chrome"))
			new ChromeDriver();
		if(name.equalsIgnoreCase("Edge"))
			new EdgeDriver();
		if(name.equalsIgnoreCase("Firefox"))
			new FirefoxDriver();
	}
}
