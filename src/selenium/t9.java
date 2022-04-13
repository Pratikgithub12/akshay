package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username=driver.findElement(By.name("txtUsername"));  // by second attributes name we can get 
		username.sendKeys("Admin");
		WebElement password=driver.findElement(By.name("txtPassword"));
	password.sendKeys("admin123");
	      WebElement login=   driver.findElement(By.name("Submit"));
	   login.click();

	}

}
