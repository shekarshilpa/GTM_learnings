package crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2_Anno extends Annotation_program2
{
	@Test
	public void mobile()
	{
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("mobile" +Keys.ENTER);
	}
}
