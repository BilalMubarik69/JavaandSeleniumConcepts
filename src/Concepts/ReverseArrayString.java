package Concepts;

public class ReverseArrayString {

	public static void main(String[] args) {
		
		String x[]  = new String[] {"Test","West","lowsest","Highest"};
	    String y="";
	    int size=x.length;
	    System.out.println(size);
	    
	    for(int i = size-1; i >= 0; i--){
	        y=y + x[i];
	        
	    }
	    System.out.println(y);
	}

}
