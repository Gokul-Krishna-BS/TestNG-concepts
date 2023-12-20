package testngmkt;

import org.testng.annotations.Test;

public class ExcludeConcept 
{
	@Test(groups = "Smoke")
	public void testcase1()
	{
		System.out.println("Smoke testcase 1");
	}
	@Test(groups = "Smoke")
	public void testcase2()
	{
		System.out.println("Smoke testcase 2");
	}
	@Test(groups = "Smoke")
	public void testcase3()
	{
		System.out.println("Smoke testcase 3");
	}
	@Test(groups = "Regression")
	public void testcase4()
	{
		System.out.println("Regression testcase 4");
	}
	@Test(groups = "Regression")
	public void testcase5()
	{
		System.out.println("Regression testcase 5");
	}
	@Test(groups = "Integration")
	public void testcase6()
	{
		System.out.println("Integration testcase 6");
	}
	@Test(groups = "Integration")
	public void testcase7()
	{
		System.out.println("Integration testcase 7");
	}
	@Test(groups = "Integration")
	public void testcase8()
	{
		System.out.println("Integration testcase 8");
	}
	@Test(groups = "System")
	public void testcase9()
	{
		System.out.println("System testcase 9");
	}
	@Test(groups = "System")
	public void testcase10()
	{
		System.out.println("System testcase 10");
	}
	@Test(groups = "System")
	public void testcase11()
	{
		System.out.println("System testcase 11");
	}
}
