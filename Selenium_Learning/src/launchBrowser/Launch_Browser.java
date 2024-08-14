package launchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Browser {

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.close();
		driver.quit();
		
		
	}

}
