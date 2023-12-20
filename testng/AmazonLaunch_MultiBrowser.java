package testngmkt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AmazonLaunch_MultiBrowser 
{
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void amazonlaunch(String ChooseBrowser)
	{
		if(ChooseBrowser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		if(ChooseBrowser.equalsIgnoreCase("Edge"))	
			driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
			
	}
}
