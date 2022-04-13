package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		WebElement username=driver.findElement(By.id("txtUsername"));  // tag are not uniqe so we goes with id attributes
		username.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement password=driver.findElement(By.name("txtPassword"));
	    password.sendKeys("admin123");
	    Thread.sleep(2000);

	      WebElement login=   driver.findElement(By.id("btnLogin"));
	   login.click();
	   driver.close();
	}

}
