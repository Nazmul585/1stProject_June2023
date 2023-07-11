package Trail3.SleneniumAttempt;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	WebDriver driver;
	@Before
	public void initDriver() {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Test
	public void WindowHadles() throws InterruptedException {
		
		
		String handle1=driver.getWindowHandle();
		
		
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("Xpath");
		driver.findElement(By.xpath("//button[@id='ybar-search']")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"web\"]/ol/li[1]/div/div[1]/h3/a")).click();
		
		Set <String> handles = driver.getWindowHandles();
		System.out.println(handles); //print on one line
		
		for(String i : handles) {
			System.out.println(i);
			driver.switchTo().window(i); //it hold the last window and will print the title of last page.
		}
		
		System.out.println(driver.getTitle());
		
		
		
	}
}
