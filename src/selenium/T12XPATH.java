package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T12XPATH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username=driver.findElement(By.xpath("//input[@name='txtUsername']"));
		username.sendKeys("Admin");
		WebElement password =driver.findElement(By.xpath("//input[@name='txtPassword']"));
		password.sendKeys("admin123");
	       WebElement link=driver.findElement(By.xpath("//input[@name='Submit']"));
	     link.click();
	}

}
