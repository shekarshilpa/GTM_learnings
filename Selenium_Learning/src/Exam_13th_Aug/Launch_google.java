package Exam_13th_Aug;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Launch_google 
{
	@Test
	public void TestCase() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("Grotechminds" +Keys.ENTER);
		WebElement hamburger_menu = driver.findElement(By.xpath("//div[@id='gbwa']")); 
		hamburger_menu.click();
		Thread.sleep(3000);
		WebElement youtube = driver.findElement(By.xpath("(//div[@class='LVal7b '])[1]/ul/li[4]"));
		youtube.click();
		Thread.sleep(3000);
		WebElement youtube_search = driver.findElement(By.xpath("//input[@id='search']"));
		youtube_search.sendKeys("grotechminds" +Keys.ENTER);
		Thread.sleep(3000);
		WebElement subscribe = driver.findElement(By.xpath("//*[@id='subscribe-button-shape']"));
		subscribe.click();
		//WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		//w1.until(ExpectedConditions.visibilityOfElementLocated(null))
	}

}
