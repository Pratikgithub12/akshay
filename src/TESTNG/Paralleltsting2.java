package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Paralleltsting2 {
	WebDriver driver;
	 @BeforeClass
	  public void init() {
		  
			System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");

		 
		 driver= new ChromeDriver();
		
		 driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
		  
	  }
 @Test  
 public void getTitle() throws InterruptedException {
	  
	 String actitle =driver.getTitle();
	 String exTitle ="OrangeHRM";
	 System.out.println(actitle);
	 Assert.assertEquals(actitle, exTitle);
	  
	  
	  
	  
  }
}
