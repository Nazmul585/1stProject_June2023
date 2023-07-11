package Trail3.SleneniumAttempt;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PracticeAfter4Class {

	WebDriver driver;
	@Before
	public void init(){
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testLocator() {
		
		driver.findElement(By.name("firstname")).sendKeys("Nazmul");
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-1")).click();
		//driver.findElement(By.cssSelector("input#tool-2")).click();
		//driver.findElement(By.cssSelector("input[id='tool-2']")).click();
	    //driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		//driver.findElement(By.partialLinkText("TF-API ")).click();
		//driver.findElement(By.cssSelector("a[href$='http://objectspy.com/os_api_prod/']")).click();
		driver.findElement(By.cssSelector("input[name='tool'][value='Selenium Webdriver']")).click();
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\khann\\OneDrive\\Documents\\CSE 103\\Essay 2-1.docx");
		
	}
	

}
