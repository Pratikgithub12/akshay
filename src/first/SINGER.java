package first;

public class SINGER {
       // state OR Variable
	String name;
	String type;
	int song;
	// methood or behavior
	public void company () {
		System.out.println( name +" is most verstile singer in "+ type +"he sung more than"+song
				);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //object creation 
		SINGER S =new SINGER();
		S.name="sonu nigam";
		S.type="bollywood";
		S.song=5000;
		S.company();
				
				
	}

}
