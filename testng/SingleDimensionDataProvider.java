package testngmkt;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SingleDimensionDataProvider 
{
	@DataProvider(name="data1")
	public Object[] dataset1()
	{
		return new Object[]{10,20,30,40};
	}
	@DataProvider(name="data2")
	public Object[] dataset2()
	{
		return new Object[] {"Gokul","John","George"};
		
	}
	@Test(dataProvider="data1")
	public void testcase1(int value)
	{
		System.out.println(value);
	}
	@Test(dataProvider = "data2")
	public void testcase2(String value)
	{
		System.out.println(value);
	}
}
