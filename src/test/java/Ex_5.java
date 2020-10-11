import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Ex_5 {
	WebDriver driver;
	@BeforeClass
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(groups= {"sanity"})
	public void Login()
	{
		String name = driver.getTitle();
		Assert.assertEquals("Facebook - login or signUp", "Facebook - login or signUp");
	}
	
	@AfterClass
	public void TearDown()
	{
		driver.quit();
	}

}
