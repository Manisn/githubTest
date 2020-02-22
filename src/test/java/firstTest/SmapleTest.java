package firstTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SmapleTest {
	@Test
	public void loginTest() throws IOException, InterruptedException{
	WebDriver wd = new FirefoxDriver();
	wd.get("https://www.google.co.in/");
	WebElement input = wd.findElement(By.name("q"));
	input.sendKeys("chennai");
	input.submit();
	File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\Users\\ELCOT\\workspace\\GitHubTest1\\ScreenShot"));
	Thread.sleep(5000);
	wd.quit();

}
	}
