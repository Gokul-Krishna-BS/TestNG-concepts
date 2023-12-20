package testngmkt;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_CSS {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com");
		WebElement SearchField = driver.findElement(By.cssSelector("textarea[id=APjFqb]"));
		SearchField.sendKeys("India");
		List<WebElement> AutoSuggestion = driver.findElements(By.cssSelector("div.eIPGRd"));
		System.out.println(AutoSuggestion.size());
		AutoSuggestion.get(1).click();
		

	}

}
