package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	         	//step-2
				driver.manage().window().maximize();
				driver.get("https://demoqa.com/buttons");
				// step 4
		WebElement button=		driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));
		// action class
		Actions act= new Actions(driver);
		act.doubleClick(button).perform();
WebElement message=	driver.findElement(By.xpath("//*[@id=\"doubleClickMessage\"]"));
	System.out.println(message.getText());
	
	// right click
	
	WebElement right =driver.findElement(By.xpath(" //*[@id=\"rightClickBtn\"]"));
	act.contextClick(right).perform();
	WebElement message1=driver.findElement(By.xpath("//*[@id=\"rightClickMessage\"]"));
	System.out.println(message1.getText());	
	
	// to click
	WebElement click =driver.findElement(By.xpath("//*[text()='Click Me']")); // 
	act.click(click).perform();
	driver.quit();

	
				
	}

}
