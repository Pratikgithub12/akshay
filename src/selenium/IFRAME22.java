package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAME22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	         	//step-2
				driver.manage().window().maximize();
				
				//step-3
				driver.get("https://vctcpune.com/selenium/practice.html");
				
		// step 5
	WebElement frame=driver.findElement(By.xpath("//*[@id=\"courses-iframe\"]"));
				
	 driver.switchTo().frame(frame);
	
	driver.findElement(By.xpath("//*[@id=\"ht-ctc-chat \"]/div")).click();
	
	
	}

}
