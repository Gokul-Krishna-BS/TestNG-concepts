package testngmkt;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderNameCheck 
{
	@DataProvider(name="names")
	public Object[][] namecheck()
	{
		return new Object[][] {{"Gokul"},{"John"},{"David"},{"Philip"},{"George"},{"Hari"},
			{"Riya"},{"Priyanka"},{"Haripriya"},{"Krishna"}};
	}
	@Test(dataProvider = "names")
	public void testcase1(String namecheck)
	{
		if(namecheck.equalsIgnoreCase("David"))
		{
			System.out.println("David is present in dataprovider");
			Reporter.log("David is present");
		}
		else
			System.out.println("David is not present");
			
	}		
		
}
