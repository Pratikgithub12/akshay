package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAME {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	         	//step-2
				driver.manage().window().maximize();
				
				//step-3
				driver.get("https://jqueryui.com/datepicker/");
				
		    
		// step4 find out a frame
		int s=driver.findElements(By.tagName("iframe")).size();

		

		
		System.out.println("total frame html is"+s);
		
	    //step-5 before 
	//	driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		
		WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));   //
			
		driver.switchTo().frame(frame);
		  //step-5 click on frame web element
			driver.findElement(By.xpath("//*[@id='datepicker']")).click();
			Thread.sleep(8000);
			driver.close();
			
	}

}

