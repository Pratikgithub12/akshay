package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X14MULTIPAL {

//	private static List<WebElement> ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	//	List <WebElement> ele=driver.findElements(By.tagName("input"));
		
List <WebElement> ele=driver.findElements(By.tagName("input"));
		
		for (WebElement el1:ele)
		{
			System.out.println(el1.getTagName());
		}
	}

		
	}


