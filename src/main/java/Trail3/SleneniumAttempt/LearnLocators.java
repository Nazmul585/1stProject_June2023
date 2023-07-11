package Trail3.SleneniumAttempt;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void testLocator() {
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.id("sex-0")).click();

		// Upload files
		// if the tag name is anything else rather than INPUT than we use a class called
		// ROBOT
	//	driver.findElement(By.id("photo")).sendKeys("C:\\Users\\khann\\OneDrive\\Documents\\Chapter 1\\Chapter 1, challenge 1.docx");

		// LINK TEXT
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();

		// partial link text(get something unique)
		//driver.findElement(By.partialLinkText("TF-API")).click();

		// CSS selector
	//	driver.findElement(By.cssSelector("input#exp-4")).click();
		// driver.findElement(By.cssSelector("input#tool-2")).click();
		// driver.findElement(By.cssSelector("input[id='tool-2']")).click();

		// CSS locator for no attribute of Id and define elements by other attributes
		//driver.findElement(By.cssSelector("input[name='tool'][value='Selenium Webdriver']")).click();

		// CSS For link
	//	driver.findElement(By.cssSelector("a[href$='http://www.objectspy.space']")).click();

		// X-PATH OR ABSOLUTE, we don't use it/ only for interview purpose
		//driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[1]/a/strong")).click();

		// X-path or Relative(Important)
	//	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("12345");
		//driver.findElement(By.xpath("//input[@name='exp' and @value='3']")).click();

		// X-path for links
		//driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
		//driver.findElement(By.xpath("//strong[contains(text(),'Link Test : New Page')]")).click();
		
	

	}
}
