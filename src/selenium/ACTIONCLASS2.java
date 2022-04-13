package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACTIONCLASS2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	         	//step-2
				driver.manage().window().maximize();
				
				//step-3
				driver.get("https://jqueryui.com/slider/");
                 
				// step 4
				WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		         driver.switchTo().frame(frame);
		      WebElement slider= driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));//slider webelent
		      
		      // action class 
		      
		     Actions act=new Actions(driver);
		     // performing action on class 
		     act.clickAndHold(slider).moveByOffset(300, 0).release().build().perform(); // relesed methood to released the cursor from slider 
		     act.clickAndHold(slider).moveByOffset(-100, 0).release().build().perform(); // relesed methood to released the cursor from slider 

		
	}

}
