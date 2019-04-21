package Concepts;

public class ReverseInteger {

	public static void main(String[] args) {
		
		long num=1234555453;
		long rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
        System.out.println(rev);
	
	
        String str="12.66";
        double a=Double.parseDouble(str);
        System.out.println(a+20);
        
        int g=12;
        String s=String.valueOf(g);
        System.out.println(new StringBuffer(s).reverse());
        
        
        
        //long num1=12345;
        //System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	
	}

}
