package TestNgBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assign_google 
{
	@Test(dataProvider = "data1")
	public void googlesearch(String input) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys(input+Keys.ENTER);
	}
	
	@DataProvider(name="data1")
	public Object[][] method1()
	{
		return new Object[][] {{"modi"},{"india"},{"sdet"}};
	}

}
