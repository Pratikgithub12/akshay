package TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest2 {
  @Test
  public void testcase() {
	  System.out.println("@Test block-test case ");
  
  }
 
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("@beforeMethod-test case ");

  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("@afterMethod-test case ");

  }
  
 

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@beforeSuite-test case ");

  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("@afterSuite-test case ");

  }

}
