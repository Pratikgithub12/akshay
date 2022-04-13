package first;

public class netbanking {
       String bank ;
       String service;
       public void feature () {
    	   System.out.println(bank+ " having good customer service"+" it provide" + service);
    	   
       }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         netbanking n=new netbanking();
         n.bank="idfc first";
         n.service="worldclass";
         n.feature();
	}

}
