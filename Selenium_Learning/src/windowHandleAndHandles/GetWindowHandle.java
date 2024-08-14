package windowHandleAndHandles;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWindowHandle 
{

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String s = driver.getWindowHandle();
		System.out.println(s);
	}

}
