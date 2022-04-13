package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");

		
	 WebElement user= driver.findElement(By.name("txtUsername"));
	// user.sendKeys("admin");
	 //Thread.sleep(2000);
	    
	  WebElement link1= driver.findElement(By.linkText("Forgot your password?"));
	//  link1.sendKeys("admin12");
	  
	 // WebElement pass=  driver.findElement(By.partialLinkText("Forgot your"));

	  link1.click();
	}
	
	
	

}
