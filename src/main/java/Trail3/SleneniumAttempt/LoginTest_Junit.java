package Trail3.SleneniumAttempt;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {

	    WebDriver driver;
	    
	    @BeforeClass
	    //it requires static method****
	    public static void beforeClass() {
	    	
	    	System.out.println("before class");
	    
	    }
	    
	    @AfterClass
	    //it requires static method****
	    public static void afterClass() {
	    	
	    	System.out.println("after class");
	    
	    }
	
		
		
		@Before
		public void launchBrowser() {
			
			System.out.println("before annotation");
			
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
		@Test
		//we can use static method for @test, so remove it
		public void loginTest() {
			
			System.out.println("positive test");
			
			//identify user name and insert
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com"); 
			
			//identify password and insert value
			driver.findElement(By.id("password")).sendKeys("558566"); 
			
			//identify signin button and click
			driver.findElement(By.name("login")).click();	
		
			
			
		}
	
		//we can use static method for @test, so remove it
        public void NegloginTest() {
			
			System.out.println("negative test");
			
			//identify user name and insert
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com"); 
			
			//identify password and insert value
			driver.findElement(By.id("password")).sendKeys("558566yryt"); 
			
			//identify signin button and click
			driver.findElement(By.name("login")).click();
        }
			
		@After	
		//we can use static method for @test, so remove it
		public void tearDown() {
			
			System.out.println("after annotation");
			//close browser
			driver.close();
			driver.quit();
		}

		
}


