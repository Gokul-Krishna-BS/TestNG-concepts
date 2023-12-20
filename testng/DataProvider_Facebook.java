package testngmkt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Facebook 
{
	WebDriver driver;
	@DataProvider(name="fbdata")
	public Object[][]facebook()
	{
		Object data[][]=new Object[1][4];
		data[0][0]="Gokul Krishna";
		data[0][1]="BS";
		data[0][2]="7774321190";
		data[0][3]="gokul123";
		return data;
	}
	@Test(dataProvider = "fbdata")
	public void createaccount(String fn, String ln,String mob,String pw )
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement createAccount = driver.findElement(By.linkText("Create new account"));
		createAccount.click();
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys(fn);
		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys(ln);
		WebElement mobilenum = driver.findElement(By.name("reg_email__"));
		mobilenum.sendKeys(mob);
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys(pw);
	}
}
