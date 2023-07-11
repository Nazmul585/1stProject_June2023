package Trail3.SleneniumAttempt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	static WebDriver driver;
	public static void main(String[] args) {
		
		launchBrowser();
		loginTest();
		tearDown();
	    
	}
		
		
	
		
		
		public static void launchBrowser() {
			
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
			
			//clear Cookies
			driver.manage().deleteAllCookies();
			
			//got to URL
			driver.get("https://techfios.com/billing/?ng=admin/");
			
			//maximize window
			driver.manage().window().maximize();
			
			//implicitly wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		
		public static void loginTest() {
			
			//identify user name and insert
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com"); 
			
			//identify password and insert value
			driver.findElement(By.id("password")).sendKeys("558566"); 
			
			//identify signin button and click
			driver.findElement(By.name("login")).click();
			
			
		}
		
		public static void tearDown() {
			//close browser
			driver.close();
		}

		
	
}
