import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ex_3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		WebElement target = driver.findElement(By.xpath("//div[@id='targetDiv']"));
		WebElement source = driver.findElement(By.xpath("//img[@id='sourceImage']"));
		Actions action = new Actions(driver);
		//action.dragAndDrop(source, target).build().perform();
		//action.moveToElement(target).build().perform();
		WebElement double_btn = driver.findElement(By.id("dblClkBtn"));
		action.doubleClick(double_btn).build().perform();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

	}

}
