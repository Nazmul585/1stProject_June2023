package Trail3.SleneniumAttempt;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTestWebElementClass5 {

WebDriver driver;
	
	@Before
	public void init() {

		System.out.println("before anotation");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public void loginTest1() {
		
		//store web element
		//type name = value
		//Element List/lib
		WebElement USER_NAME_ELEMENT = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		WebElement PASSWORD_ELEMENT = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement SIGNIN_BUTTON_ELEMENT = driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
		
		
		
		
		//saving elements on BY class
	//	By USER_NAME_FIELD = By.xpath("//*[@id=\"username\"]");
	//	By PASSWORD_FIELD = By.xpath("//*[@id=\"password\"]");
	//	By SIGNIN_BUTTON_FIELD = By.xpath("/html/body/div/div/div/form/div[3]/button");
	//	By DASHBOARD_HEADER_FIELD = By.xpath("//h2[contains(text(), 'Dashboard')]");
		
		USER_NAME_ELEMENT.clear();
//		USER_NAME_ELEMENT.sendKeys("demo@techfios.com");
		USER_NAME_ELEMENT.sendKeys("demo@techfios.com");
		PASSWORD_ELEMENT.sendKeys("558566gg");
		SIGNIN_BUTTON_ELEMENT.click();
		
	//	WebElement DASHBOARD_HEADER_ELEMENT = driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));
		
		boolean pageTitleDisplayStatus;
		try {
			WebElement DASHBOARD_HEADER_ELEMENT = driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));
			pageTitleDisplayStatus = true;
		}catch(Exception e) {
			pageTitleDisplayStatus = false;
		}
		
		


	//Assert.assertTrue("DashBoard page not found!", DASHBOARD_HEADER_ELEMENT.isDisplayed());
		Assert.assertTrue("DashBoard page not found!",pageTitleDisplayStatus);
	
	}
}

