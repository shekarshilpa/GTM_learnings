package TestNgBasics;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_annotation 
{
	@DataProvider(name="data1")
	public Object [][] methodName()
	{
		return new Object[][]
				{
			{"shilpa"},
			{"roopa"},
			{"sriharika"}
			
		};
	}
	@Test(dataProvider="data1")
	public void testcase1(String a)
	{
		Reporter.log(a);
	}

}
