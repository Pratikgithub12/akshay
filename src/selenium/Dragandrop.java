package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragandrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	         	//step-2
				driver.manage().window().maximize();
				
				//step-3
				driver.get("https://jqueryui.com/draggable/"); //https://jqueryui.com/draggable/
                 // step4
	WebElement frame  =driver.findElement(By.xpath("//*[@class='demo-frame']"));
				
	driver.switchTo().frame(frame);
	
	// step5
	   WebElement drop= driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	   
	   // step 6 use action cl 
	   Actions as=new Actions(driver);
	   as.dragAndDropBy(drop, 150,100). perform();
	//   driver.close();
		
		
		
		
	}

}
