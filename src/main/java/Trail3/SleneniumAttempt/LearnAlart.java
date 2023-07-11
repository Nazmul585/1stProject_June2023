package Trail3.SleneniumAttempt;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlart {
WebDriver driver;



    @Before
	public void initDriver() {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
   
    @Test
    public void handlingAlart() {
    	
    	driver.findElement(By.xpath("//input[@name='proceed']")).click();
    	//driver.switchTo().alert().accept();
    	String AlartText = driver.switchTo().alert().getText();
    	driver.switchTo().alert().accept(); // writing it after the getText cz if i do before i can't read, it will close after open
    	System.out.println(AlartText);
    
    }
}
    
