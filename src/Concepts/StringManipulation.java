package Concepts;

public class StringManipulation {

	public static void main(String[] args) {
		String str="The rain hasw just started in sialkot";
		//1.String Length
		System.out.println(str.length());
		
		//2.Character at different index
		System.out.println(str.charAt(7));
		
		System.out.println(str.indexOf("s")); //1st Occurence
		
		System.out.println(str.indexOf("s",str.indexOf("s")+1));//2nd Occurence
		
		System.out.println(str.indexOf("s",str.indexOf("s")+1+(str.indexOf("s")+1)));//4th Occurence

	    System.out.println(str.substring(0, 12));
		
		//trim 
	   String t="     Hello World    ";
	   
	   String trim=t.trim();
	   
	   System.out.println(trim);
	   
	   String space=trim.replace(" ", "");
	   
	   System.out.println(space);
	   
	  //replace 
	   String date="01-02-2017";
	   String rep=date.replace("-", "/");
	   System.out.println(rep);
	   
	   //String Comparison
	  String s1="This is a book";
	  String s2="This is A book";
	  
	  System.out.println(s1.equals(s2));
	  
	  System.out.println(s1.equalsIgnoreCase(s2));
	  
	  //Concat
	  String s3="Book";
	  
	  System.out.println(s3.concat("s"));
	  
	  //Split
	  String s4="Selenium_is_a_good_tool";
	  String []sp=s4.split("_");
	 
	  for(int i=0;i<sp.length;i++)
	  {
		  System.out.println(sp[i]);
	  }
	}

}
