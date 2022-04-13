package selenium;

import java.awt.Button;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Windowhandling {

	private static WebElement button;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentHandle= driver.getWindowHandle();
		System.out.println("parent window-"+parentHandle);
		
		
		
		
	// step 5
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> handles = driver.getWindowHandles();
		for (String handle:handles) {
			System.out.println(handle);
		}
		Thread.sleep(5000);
		
	driver.quit();
			
			
		}
		
	}


