package first;

public class laptop {
	//State 
	String company;
	String type;
	int price;
	//methood
	public void vision() {
		System.out.println(company+" is world class product " +"with type"+type);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        laptop l=new laptop();
        l.company="lenovo";
        l.type="g50";
        l.vision();
        
        
	}

}
