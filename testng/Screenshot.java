package testngmkt;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot
{
	WebDriver driver;
	@Test
	public void screenShot() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\gokul\\OneDrive\\Desktop\\MKT\\SeleniumScreenshots-Takenbycode\\screenshot.jpeg");
		FileUtils.copyFile(source, dest);
	}
}
