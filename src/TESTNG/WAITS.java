package TESTNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WAITS {
	
	
	public static WebDriver driver;
	 @BeforeClass
	  public void init() {
		  
		 System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");

		 
		 driver= new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
	  }

	 @Test 
	  public void login() throws InterruptedException {
		  
		  WebElement username=driver.findElement(By.xpath("//*[@id='txtUsername']"));
		  username.sendKeys("Admin");
		  
		  
		  WebElement password=driver.findElement(By.id("txtPassword"));
		  password.sendKeys("admin123");
		
		  
		  driver.findElement(By.id("btnLogin")).click();
		  
			
			
	  }
	  
	  @Test (dependsOnMethods="login")
	  public void logout() throws InterruptedException {
		  
		  WebElement menu=driver.findElement(By.xpath("//*[ @id='branding']//a[@id='welcome']"));
		  menu.click();
		 
		  
		  WebElement logoutLink=driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]//a[text()='Logout']"));
		  logoutLink.click();
		  
		 
			
	  }
	  
	  @AfterClass
	  public void tearDown() {
		  
		  driver.close();
	  }

  
 
  }

