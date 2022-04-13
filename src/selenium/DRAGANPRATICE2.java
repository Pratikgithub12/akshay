package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DRAGANPRATICE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	         	//step-2
				driver.manage().window().maximize();
				
				//step-3
				driver.get("https://jqueryui.com/draggable/");
			WebElement frame=	driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));  //// //*[@id="content"]/iframe
			// switch to frame
			driver.switchTo().frame(frame);
			// object which drage
	WebElement drag=		driver.findElement(By.xpath("//*[@id=\"draggable\"]")); ///
	// action class object 
	Actions ac=new Actions(driver);
	ac.dragAndDropBy(drag,400, 0).perform();
				
				
	}

}
