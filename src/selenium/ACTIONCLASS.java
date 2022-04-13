package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACTIONCLASS {

	public static void main(String[] args) throws InterruptedException {
		// ACTION CLASS USED WHEN selcted class is not proper working or we want perfromed some action with help of keyword and mouse
		 {
			
			System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		         	//step-2
					driver.manage().window().maximize();
					
					
					//step-3
					driver.get("https://vctcpune.com/selenium/practice.html");
					
                     //step4     
					
					driver.findElement(By.xpath("//*[@id='dropdown-class-example']")).click();  ////*[@id="dropdown-class-example"]
					
					// used of action class (keyword and action) 
					Actions act=new Actions(driver);
					act.sendKeys(Keys.ARROW_DOWN).perform();  // sendkeys and keys  are  action in action class
			    	Thread.sleep(3000);
					act.sendKeys(Keys.ARROW_DOWN).perform();  // performs is one of method
					Thread.sleep(3000);
					

					act.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).build().perform();//bulid is method  for multipal action retuned type action
					Thread.sleep(4000);

					
	}

	}}
