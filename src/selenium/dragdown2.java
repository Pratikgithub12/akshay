package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	         	//step-2
				driver.manage().window().maximize();
				
				//step-3
				driver.get("https://jqueryui.com/droppable/");
				// step 4
		WebElement frame=		driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		// step 5 iframe switch to
		driver.switchTo().frame(frame);
// find web element of drag and drop
	WebElement drag=	driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	      WebElement drop= driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	
	// action class 
	Actions ac=new Actions(driver);
    ac.dragAndDrop(drag, drop).perform();
    
	
	}

}
