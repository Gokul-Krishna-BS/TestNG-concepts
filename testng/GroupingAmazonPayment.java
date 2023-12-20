package testngmkt;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import common_class.Launch;

public class GroupingAmazonPayment extends Launch
{
	@Test(groups = "System Test",enabled = false)
	public void creditDebitCards()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in");
		WebElement Dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s1= new Select(Dropdown);
		s1.selectByVisibleText("Electronics");
		WebElement Searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		Searchbox.sendKeys("Mobiles");
		List<WebElement> AutoSuggestion = driver.findElements(By.xpath("(//div[@class='two-pane-results-container']/div/div)"));
		int count=AutoSuggestion.size();
		for(int i=0;i<count;i++)
			if(AutoSuggestion.get(i).getText().contentEquals("mobiles"))
				{
					AutoSuggestion.get(i).click();
					break;
				}
		List<WebElement> productList = driver.findElements(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/a/span)"));
		int pcount=productList.size();
		Reporter.log("Products listed: "+pcount);
		productList.get(16).click();
		Set<String> parentChildids = driver.getWindowHandles();
		Iterator<String> pids = parentChildids.iterator();
		String parentid = pids.next();
		String childid = pids.next();
		driver.switchTo().window(childid);
		WebElement byNowButton = driver.findElement(By.id("buy-now-button"));
		byNowButton.click();
		WebElement username = driver.findElement(By.id("ap_email"));
		username.sendKeys("krishnasaseendran29@gmail.com");
		driver.findElement(By.id("continue")).click();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("23456");
		driver.findElement(By.id("signInSubmit")).click();		
	}
	@Test
	public void cod()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in");
		WebElement Dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s1= new Select(Dropdown);
		s1.selectByVisibleText("Car & Motorbike");
		WebElement Searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		Searchbox.sendKeys("roya");
		List<WebElement> AutoSuggestion = driver.findElements(By.xpath("(//div[@class='two-pane-results-container']/div/div)"));
		int count=AutoSuggestion.size();
		for(int i=0;i<count;i++)
			if(AutoSuggestion.get(i).getText().contentEquals("royal enfield chain lubricant"))
				{
					AutoSuggestion.get(i).click();
					break;
				}
		List<WebElement> productList = driver.findElements(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/a/span)"));
		int pcount=productList.size();
		Reporter.log("Products listed: "+pcount);
		productList.get(16).click();
		Set<String> parentChildids = driver.getWindowHandles();
		Iterator<String> pids = parentChildids.iterator();
		String parentid = pids.next();
		String childid = pids.next();
		driver.switchTo().window(childid);
		WebElement byNowButton = driver.findElement(By.id("buy-now-button"));
		byNowButton.click();
		WebElement username = driver.findElement(By.id("ap_email"));
		username.sendKeys("krishnasaseendran29@gmail.com");
		driver.findElement(By.id("continue")).click();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("23456");
		driver.findElement(By.id("signInSubmit")).click();	
	}
	
}
