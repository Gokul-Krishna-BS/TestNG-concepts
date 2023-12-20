package testngmkt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class AmazonLoginDataProvider 
{
	WebDriver driver;
	@DataProvider(name="LoginCred")
	public Object[][] logindata()
	{
		Object credentials[][]=new Object[2][2];
		credentials[0][0]="krishnasaseendran29@gmail.com";
		credentials[0][1]="1234321";
		credentials[1][0]="gokul@email.com";
		credentials[1][1]="qwerty";
		return credentials;
	}
	@Test(dataProvider = "LoginCred")
	public void testcase1(String usn,String psw)
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement SignInButton= driver.findElement(By.id("nav-link-accountList"));
		Actions a1=new Actions(driver);                                                                                           
		a1.moveToElement(SignInButton).perform();
		WebElement SignInButtonClick= driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		SignInButtonClick.click();
		WebElement un=driver.findElement(By.xpath("(//input)[7]"));
		un.sendKeys(usn);
		WebElement ContinueButton=driver.findElement(By.xpath("(//input)[10]"));
		ContinueButton.click();
		WebElement PasswordField = driver.findElement(By.id("ap_password"));
		PasswordField.sendKeys(psw);
		WebElement SignInButton2 = driver.findElement(By.xpath("//input[@type='submit']"));
		SignInButton2.click();
	}
}
