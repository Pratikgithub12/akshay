package TESTNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class ASSERTION {
	public static WebDriver driver;
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
	 String exTitle ="OrangeyjgM";
	 System.out.println(actitle);
	 Assert.assertNotEquals(actitle, exTitle);
  }
  @Test  
  public void geturl() throws InterruptedException {
	  
	 System.out.println("getUrl");
	 // soft assert we have create object and with help ref variable we call methods sa.assert all 
	// SoftAssert sa=new SoftAssert();
	
	 
	 // hard assert
	Assert.assertTrue(false);   
	// sa.assertAll();
	 System.out.println("After Assert");
	 System.out.println("Last statement");
	// sa.assertAll();    // due to this method below line statement from asert will execute . if we can write it then all thxt script will paased.
	
  }
  @Test  
  public void getHomepage() throws InterruptedException {
	  
	 System.out.println("getHomepage");
  }
 
   
}
