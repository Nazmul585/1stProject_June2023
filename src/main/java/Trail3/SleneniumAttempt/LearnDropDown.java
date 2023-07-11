package Trail3.SleneniumAttempt;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	WebDriver driver;
	
	
	By UserName_Input = By.xpath("//input[@id='username']");
	By Password_Input = By.xpath("//input[@id='password']");
	By SignIn_Button =  By.xpath("//button[@name='login']");
    By DASHBOARD_HEADER_ELEMENT = By.xpath("//h2[contains(text(),'Dashboard')]");
    By CUSTOMER = By.xpath("//span[contains(text(),'Customers')]");
	By Add_CUSTOMER = By.xpath("//a[contains(text(),'Add Customer')]");
	By Full_Name = By.xpath("//input[@id='account']");
	//By Company = By.xpath("//select[@id='cid']");(No need cause we have select class)

	

	@Before
	public void initDriver() {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void LoginTest() {
	
//		Make everyone global varible
//		By UserName_Input = By.xpath("//input[@id='username']");
//		By Password_Input = By.xpath("//input[@id='password']");
//		By SignIn_Button =  By.xpath("//button[@name='login']");
//	    By DASHBOARD_HEADER_ELEMENT = By.xpath("//h2[contains(text(),'Dashboard')]");
	
		driver.findElement(UserName_Input).sendKeys("demo@techfios.com");
		driver.findElement(Password_Input).sendKeys("abc123");
		driver.findElement(SignIn_Button).click();
		
		
		
//using page headline text
//Assert.assertEquals("Page not found", "Dashboard", DASHBOARD_HEADER_ELEMENT.getText());
		
//Now Trying with the Title
		Assert.assertEquals("Page not found!", "Dashboard- iBilling", driver.getTitle());
		
	}
    @Test
	public void addCustomers() {


		
		LoginTest();
		driver.findElement(CUSTOMER).click();
		driver.findElement(Add_CUSTOMER).click();
		
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='cid']"))); // we can make the driver.find as webelement and put it like select(webelement variable);
		sel.selectByVisibleText("Techfios");

	}

}
