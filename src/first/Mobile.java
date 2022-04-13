

package first;

public class Mobile {
	// state or variable 
	String company ;
	String type ;
	String size ;
	int rate ;
	// behaviour 
	public void Vision() {
		System.out.println(company + "mobile is need of every person");
	    System.out.println("type+have+size");
	}
	
	

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
	//object creation 
		Mobile m= new Mobile();
		m.company= "antroid";
		m.type="smart phone";
	    m.size="6 inch";
	    m.rate=10000;
	    m.Vision();
	    
		
		
	
	}
	
	

}
