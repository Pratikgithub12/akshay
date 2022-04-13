package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestngClass1 {
	WebDriver driver;
	
  @BeforeClass
  public void init() {
	  
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");

	 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	  
  }
  
  @Test 
  public void login() throws InterruptedException {
	  
	  WebElement username=driver.findElement(By.xpath("//*[@id='txtUsername']"));
	  username.sendKeys("Admin");
	  Thread.sleep(2000);
	  
	  WebElement password=driver.findElement(By.id("txtPassword"));
	  password.sendKeys("admin123");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("btnLogin")).click();
	  Thread.sleep(2000);
		
		
  }
  
  @Test (dependsOnMethods="login")
  public void logout() throws InterruptedException {
	  
	  WebElement menu=driver.findElement(By.xpath("//*[ @id='branding']//a[@id='welcome']"));
	  menu.click();
	  Thread.sleep(2000);
	  
	  WebElement logoutLink=driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]//a[text()='Logout']"));
	  logoutLink.click();
	  Thread.sleep(2000);
	 
		
  }
  
  @AfterClass
  public void tearDown() {
	  
	  driver.close();
  }
}

  
 

