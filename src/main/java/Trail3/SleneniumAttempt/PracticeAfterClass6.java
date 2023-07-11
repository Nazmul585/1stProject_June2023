package Trail3.SleneniumAttempt;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAfterClass6 {

	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("Webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");

	}

	@Test
	public void LoginTest() {

		// driver.findElement(By.cssSelector("input#lastname")).sendKeys("Nazmul");
		// driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Nazmul");
		// driver.findElement(By.cssSelector("input[id='exp-3']")).click();
		// driver.findElement(By.cssSelector("a[href='http://objectspy.com/os_api_prod/']")).click();
		// driver.findElement(By.cssSelector("input[name='firstname'][type='text']")).sendKeys("Abrar");
		
		
//        driver.findElement(By.xpath("//input[@id='profession-0']")).click();
//		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Selenium Webdriver']")).click();
//		driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
		
		WebElement UserName_Input = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement Password_Input = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement SignIn_Button = driver.findElement(By.xpath("//button[@name='login']"));
	
		
		UserName_Input.sendKeys("demo@techfios.com");
		Password_Input.sendKeys("55856hh6");
		SignIn_Button.click();
		
		boolean PageTitleDisplay_Status;
		try {
			WebElement DashBoard_Find = driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));
			PageTitleDisplay_Status = true;
		}catch(Exception e){
			
			PageTitleDisplay_Status = false;
		}
		

		Assert.assertTrue("DashBoard page not found!",PageTitleDisplay_Status);
	}

}
