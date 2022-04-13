package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		// step 4
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		
		// STEP7
		 driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("goa");
	
		
		//step alert 5
		driver.findElement(By.xpath("//*[@id=\"alertbtn\"]")).click();
		 
		Thread.sleep(2000);
		
		
		 Alert alertWindow=   driver.switchTo().alert();
		 
		// alertWindow.accept();
		 
		//	Thread.sleep(2000);

		 
		String message= alertWindow.getText();
		 
		if (message.contains("goa")){
			System.out.println("text match");
			 alertWindow.accept();
		}
		else {
		
			System.out.println("text dont match");
			 alertWindow.accept();

		}
		 
		
		// LET CHECK THAT OPERATION PERFORMED ALERT OR NOT  STEP 6
		 
		WebElement drop= driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));

		drop . click();
		
		Thread.sleep(6000);

		
	}

}

