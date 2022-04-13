package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {
	
public static void main(String[] args) throws InterruptedException {
	
	//Step-1
	
	System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			//step-2
			driver.manage().window().maximize();
			
			
			//step-3
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			//step-4- Scrolling
		///	JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//    js.executeScript("window.scrollBy(0,600)");
		//    Thread.sleep(3000);
		    
		    //step5
		  String Parenttab=  driver.getWindowHandle();
		    System.out.println(Parenttab);       // it giving us uniqe  parent id of that windows for that uniqe id we should naviagte .
		 
	    //step-6
	  WebElement button=   driver.findElement(By.xpath("//*[@id=\"opentab\"]"));   //or .click();  ////*[@id="openwindow"]
		   button.click();
		  
		   
		   //  
//
		   
  		 //  step 7
		  Set<String> alltab = driver.getWindowHandles();  // it give us parent id as well as child id wrt 
	   for (String TAB :alltab) {
	    	System.out.println(TAB);
	    //	Thread.sleep(4000);

	   // step 8 getting a title	
	   if (!TAB .equals(Parenttab)) {	
	    	
	    	driver.switchTo().window(TAB);
	  	System.out.println(driver.getTitle());
	    }}
	
// moving back to parent window
	  driver.switchTo().window(Parenttab);
	  System.out.println(driver.getTitle());//	Thread.sleep(5000);
   
   
   
   
   
}
}
