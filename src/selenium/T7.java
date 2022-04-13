package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		String title =driver.getTitle();
		System.out.println(title);
		if (title.equals("whatsapp com"))
		{
			System.out.println("test passed");
		}
		else
			{
				System.out.println("test failed");
			}
		      String url= driver.getCurrentUrl();
		      System.out.println(url);
	}
	

}
