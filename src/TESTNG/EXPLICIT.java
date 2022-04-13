package TESTNG;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EXPLICIT {
	
	
	private static final Function ExceptedConditions = null;
	public static WebDriver driver;
	 @BeforeClass
	  public void init() {
		  
		 System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");

		 
		 driver= new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
	  }

	 @Test 
	  public void testCase1() throws InterruptedException {
		  
		driver.findElement(By.id("alert")).click();
		
	WebDriverWait wait=new WebDriverWait(driver,20);
	
	wait.until(ExpectedConditions.alertIsPresent());
		
	driver.switchTo().alert().accept();
	
driver.findElement(By.id("display-other-button")).click();
	WebElement hidden=driver.findElement(By.id("hidden"));
	
	wait.until(ExpectedConditions.visibilityOf(hidden));
	
	hidden.click();
		  
//	driver.findElement(By.id("enable-button")).click();
	
//	wait.until(ExpectedConditions.visibilityOf("disable"));
	
	 }  
	  
	 
	  
	  @AfterClass
	  public void t() {
		  
		  driver.close();
  }

}