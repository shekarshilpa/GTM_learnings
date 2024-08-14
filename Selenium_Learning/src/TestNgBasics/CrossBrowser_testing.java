package TestNgBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_testing
{
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void login(String nameOfBrowser)
	{
		if(nameOfBrowser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(nameOfBrowser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		if(nameOfBrowser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	

}
