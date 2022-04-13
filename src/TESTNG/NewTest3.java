package TESTNG;

import org.testng.annotations.Test;

public class NewTest3 {
  @Test
  (groups="sanity")
  public void  homepage() {
	  
	  System.out.println("Homepage- testing3");
  } 
	@Test  (groups="retesting")
	public void generalTak(){
		
		System.out.println("genral tab- testing3");
		
	}
	
	
	{
		
  }
}
