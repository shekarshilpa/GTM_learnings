package TestNgBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_alternatives 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		if(1==1)
		{
			driver = new FirefoxDriver();
		}
		
		if(2==2)
		{
			driver = new ChromeDriver();

		}
	}
}
