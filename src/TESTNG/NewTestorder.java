package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;             //as per pr/iority test case should run  but priority will be given to all test case 
public class NewTestorder {                      /// (enabled=false) and also true
  @Test  (description= "this is method")
  
  public void afterPage1() throws InterruptedException {                      /// to run test scripts multipal time (innovationcount=3)
	                                                                     /// (timeOut=4000)
	                                                                   /// descripation = 
	  System.out.println("test1");                                    /// groups 
	  
	  
  } 
	@Test  
	public void  sliderbar(){
		
		System.out.println("testing2");// order of execution
	}
	  
		@Test  
		public void homepage (){
			
			System.out.println(" testing3");
			 
	  
  }
}
