package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SCREENSHORT {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	         	//step-2
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/login/");
				
			// step 4 to take screen short we used a predefine interface .. casting procces implment
				TakesScreenshot tss=(TakesScreenshot)driver;
			
				  File source=tss.getScreenshotAs(OutputType.FILE);  // GET SCREENSHORT METHOOD (we need two thing for scrrenshorts ie. source and destination)
				
         //    File destination=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Java texting\\basic\\src\\Screenshort\\Scereen1.Png");
             
             File destination=new File(System.getProperty("user.dir")+"\\Screenshort\\Screen2.Png");
             // system.getproperty to give path of folder 

			FileHandler.copy(source, destination);	//file handler class                          
				
			System.out.println("screenshort capture");	
				
				
				
	}

}
