package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbifrmae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	         	//step-2
				driver.manage().window().maximize();
				
				//step-3
				driver.get("https://jqueryui.com/datepicker/");
				
		
	
		// step 4 
	//	int s=driver.findElements(By.tagName("iframe")).size();    /
	//	System.out.println("total frame is "+ s);
		
	WebElement frame=	driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		// click on web ellement 
		
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		while (true) {
	String month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();   ////*[@id="ui-datepicker-div"]/div/div
		System.out.println(month);
		
		if (!month.equalsIgnoreCase("march 2020")) {
			
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span]")).click();   ////*[@id="ui-datepicker-div"]/div/a[1]/span
		}
			
		else {
			break;
		}
			int date=23;
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table//a[text()='"+date+"']")).click();     ////*[@id="ui-datepicker-div"]/table
			
		}
		
		
	}

}
