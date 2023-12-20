package testngmkt;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeInfiniteScrolldown {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.youtube.com");
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		for(int i=0;i>=0;i++)
		jse.executeScript("window.scrollBy(0,1000);");
	}

}
