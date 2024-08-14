package crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotation_program2 
{
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void Precondition_launch_google(String nameOfBrowser)
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
	
	@AfterMethod
	public void post_execution_quit()
	{
		driver.quit();
		
	}
}
