package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathmintra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		// absolute path 
	//	driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/input")).sendKeys("T-shirts for kids");
	//	driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/a")).click();
		// realative path 
	//	driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("T-shirts for kids");
	//	driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/a/span")).click();
	//	driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img")).click();
	//	Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("T-shirts for kids");
		
		driver.findElement(By.xpath("//span[@data-reactid='892']")).click();
		
		driver.close();
		
	}

}
