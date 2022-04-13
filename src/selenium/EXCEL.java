package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EXCEL {

	public static String readData(int i, int j) throws IOException {
		String path ="C:\\Users\\Lenovo\\eclipse-workspace\\Java texting\\basic\\src\\selenium\\DATA.xlsx";
		
		
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		
		
		
				XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=	wb.getSheetAt(0);
		String value=	sheet.getRow(0).getCell(0).getStringCellValue();
		
		wb.close();
			return value;	
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	         	//step-2
				driver.manage().window().maximize();
				
				//step-3
				driver.get("https://opensource-demo.orangehrmlive.com/");
				WebElement username=driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
			username.sendKeys(readData(0,0));
				WebElement pass=driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
               pass. sendKeys(readData(0,1));
        		WebElement login=driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
        		 Thread.sleep(5000);
        		
             login.click();

             driver.findElement(By.xpath("//*[@id='welcome']")).click();
   		  Thread.sleep(3000); 
   		  driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a[text()='Logout']")).click();
   		
   		 
   		  Thread.sleep(8000);
   		  driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
