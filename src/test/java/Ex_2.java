import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex_2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("link")).click();
		driver.navigate().back();
		driver.findElement(By.name("firstName")).sendKeys("Selenium");
		driver.findElement(By.xpath("//button[@title='Click me!!']")).click();
//		WebElement gender_btn = driver.findElement(By.xpath("//input[@value='female']"));
//		if(gender_btn.isSelected()== false)
//		{
//			gender_btn.click();
//		}
		List<WebElement> gender_btn = driver.findElements(By.xpath("//input[@name='gender']"));
		int gender_btn_size = gender_btn.size();
		for(int i=0;i<gender_btn_size;i++)
			gender_btn.get(i).click();
	
	Select drp_Down = new Select(driver.findElement(By.id("testingDropdown")));
	drp_Down.selectByIndex(1);
	Thread.sleep(2000);
	drp_Down.selectByVisibleText("Manual Testing");
	Thread.sleep(4000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("scrollBy(0,5000)");
	}
}
