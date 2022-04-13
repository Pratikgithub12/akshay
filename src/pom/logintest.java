package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class logintest {

	WebDriver driver;
	loginpage lp;
	
	@BeforeClass 
	public void init() {
		
		 System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		 driver= new ChromeDriver();
			
		 driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));			
			lp=new loginpage(driver);
	}
	
	
	@Test
	public void login() {
		
		lp.getUsernameTab().sendKeys("Admin");
		lp.getPasswordTab().sendKeys("admin123");
		lp.getButton().click();
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.close();
	}

		 
}
