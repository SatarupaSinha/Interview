import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex_4 {
	WebDriver driver;
	@Test(priority=1)
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(groups= {"regression"},priority=3)
	public void Login()
	{
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("login")).click();
	}
	
	@Test(priority=3)
	public void TearDown()
	{
		driver.quit();
	}
	
}
