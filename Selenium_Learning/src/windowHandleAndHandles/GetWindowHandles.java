package windowHandleAndHandles;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWindowHandles
{

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Set<String> s =driver.getWindowHandles();
		System.out.println(s);
	}

}
