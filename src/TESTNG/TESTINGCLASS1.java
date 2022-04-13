package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TESTINGCLASS1 {
  @Test (enabled=false)
  public void testcase1() throws InterruptedException {
	  
	  System.out.println(" test case1");
	  Assert.assertTrue(true);
	  
  }
  
  @Test  (groups="sanity")
  public void testcase2() {
	
	  System.out.println("test case2");
  }
 
  @Test  (groups="retesting")
  public void testcase3() {
	
	  System.out.println("test case3");
  
  
  }}
