package crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1_Anno extends Annotation_program2
{
	@Test
	public void shoe()
	{
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("Shoes" +Keys.ENTER);
	}

}
