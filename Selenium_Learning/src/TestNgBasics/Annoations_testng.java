package TestNgBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annoations_testng 
{
	@Test
	public void test()
	{
		System.out.println("i am test");
	}
	@Test
	public void test1()
	{
		System.out.println("i am testng");

	}
	
	@BeforeSuite
	public void bs()
	{
		System.out.println("i am bs");

	}
	@AfterSuite
	public void as()
	{
		System.out.println("i am as");

	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("i am bt");

	}
	
	@AfterTest
	public void at()
	{
		System.out.println("i am at");

	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("i am bc");

	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("i am ac");

	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("i am bm");

	}
	@AfterMethod
	public void am()
	{
		System.out.println("i am am");
	}
	
	
}
