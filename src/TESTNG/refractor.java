package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class refractor {
  
  WebDriver driver;
  @Parameters("browser")
	@BeforeClass
	public void init(String arg){
		
		if(arg.equals("chrome")){

			System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");

	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	}
		else if(arg.equals("firefox")) {
			
			System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");

			driver=new ChromeDriver();
					
					
					driver.manage().window().maximize();
					
					driver.get("https://opensource-demo.orangehrmlive.com/");
					
		}}}

