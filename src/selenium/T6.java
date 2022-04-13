package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
        driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread .sleep(3000);
        driver.navigate().forward();
        driver.navigate().refresh();
       Thread.sleep(8000);
        driver.close();
	}

}
