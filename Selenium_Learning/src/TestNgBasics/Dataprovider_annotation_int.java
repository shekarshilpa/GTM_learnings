package TestNgBasics;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_annotation_int 
{
	@DataProvider(name="data1")
	public Object[][] method2()
	{
		return new Object[][] {{15},{16},{17}};
		
	}
	@Test(dataProvider="data1")
	public void testcase_new(int num)
	{
		{
			Reporter.log("the answer is" +num);
		}
	}

}
