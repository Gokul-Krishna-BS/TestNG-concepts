package testngmkt;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoDimensionDataProvider 
{
	@DataProvider(name="dataset1")
	public Object[][] data1()
	{
		Object[][] obj=new Object[2][2];
		obj[0][0]= "gokul";
		obj[0][1]="david";
		obj[1][0]="George";
		obj[1][1]="Firoz";		
		return obj;
	}
	@Test(dataProvider = "dataset1")
	public void names(String name1,String name2)
	{
		System.out.println(name1+" "+name2);
	}
}

