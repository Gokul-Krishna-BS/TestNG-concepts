package testngmkt;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot_Getclass
{
	WebDriver driver;
	@Test
	public void screenshot() throws IOException
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Screenshot_Getclass s1=new Screenshot_Getclass();
		TakesScreenshot t1=(TakesScreenshot) driver;
		File source=t1.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\gokul\\eclipse-workspace\\Selenium_Maven\\Screenshots\\"
		+s1.getClass()+Math.random()+".jpeg");
		FileUtils.copyFile(source, dest);
	}
}
