package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dream11.com/login");
		WebElement username=driver.findElement(By.id("pratikkadu7475@gmail.com"));  // by second attributes name we can get 
		username.sendKeys("Admin");
	//	WebElement password=driver.findElement(By.id("Pratik96"));
	//password.sendKeys("admin123");
	      WebElement login= driver.findElement(By.id("regUser"));
	   login.click();
	}

}
