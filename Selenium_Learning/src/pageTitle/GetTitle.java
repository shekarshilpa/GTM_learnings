package pageTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());;
	}

}
