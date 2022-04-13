package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TESTNG.TESTnglistners.class)   // class files comes to a a run time
public class Listnerss {
 WebDriver driver;
 @BeforeClass
  public void init() {
	 
	 System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");

	 
	 driver= new ChromeDriver();
	
	 driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
 }
	  @Test 
	  public void getTitle() {
		  
		String actual=  driver.getTitle();
		String expectedTitle="OrangeHRM";
		  System.out.println("actual");
		  Assert.assertEquals(actual,expectedTitle);
	  
	  }
	  @Test(dependsOnMethods="getTitle")
	   public void getindex() {
		  System.out.println("getindex");
	  }
	  
	  @Test 
	  public void login() {
		  System.out.println("login");
		  
		  
	 
	 
	 
  }
}
