package testngmkt;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPRoviders_MorethanOne 
{
	@DataProvider(name="dataset")
	public Object[] numbers() 
	{
		return new Object[] {45,33,54,21};
	}
	@DataProvider(name="dataset1")
	public Object[][] places()
	{
		Object names[][]= new Object[4][1];
		names[0][0]="Delhi";
		names[1][0]="Mumbai";
		names[2][0]="Bengaluru";
		names[3][0]="Kolkatta";
		return names;
	}
	@Test(dataProvider = "dataset")
	public void run(int numbers)
	{
		System.out.println(numbers);
	}
}