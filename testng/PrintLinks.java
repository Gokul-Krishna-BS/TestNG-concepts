package testngmkt;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import common_class.Launch;

public class PrintLinks extends Launch
{
	@Test
	public void printlinks()
	{
		driver.get("https://www.amazon.in");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			WebElement linkurl = links.get(i);
			String url=linkurl.getAttribute("href");
			System.out.println(url);
		}
		System.out.println("Number of urls: "+links.size());
	}
}
