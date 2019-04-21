package Concepts;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="Selenium";
		int len=s.length();
		System.out.println("String Length is:"+len);
		String rev="";
		
		for(int i=len-1;i>=0;i=i-1){
			
			rev=rev+s.charAt(i);
		}

		System.out.println(rev);
	
	 String s1="Bilal";
	 StringBuffer sb=new StringBuffer(s1);
	 System.out.println(sb.reverse());
	
	
	}

}
