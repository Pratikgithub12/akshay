package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop1 {

	

	



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		// step 4
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
		// step4
		
		
		
		//step5
		WebElement drop= driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));  //*[@id="dropdown-class-example"]
		// step6 //*[@id="dropdown-class-example"]
		
		Select sel =new Select(drop); 
		//sel.selectByVisibleText("Option2");   // TO SELECT  OR HANDLE PARTICULAR DROP DOWN VALUES 2  
		
//	sel.selectByIndex(1);   // TO SELECT  value  OR HANDLE  with help of index 3

		
		sel.selectByValue("option1");                /// TO SELCT ALL INDEX VALUES 1 
		
	      	// to get complte list 4
		
		
		
		
		
	//	List<WebElement>values = sel.getOptions();
//		for (WebElement ref:values)
//		System.out.println(ref.getText());
//		{	
	//		+	
	
//	WebElement ref = null;
//	if	(ref.getText().equals("Option2")) {
	//	sel.selectByVisibleText("Option2"); 
//	ref.click();
		
		
//}       
			
		
	//	}
		//sel.selectByIndex(2);
		
	}

}
