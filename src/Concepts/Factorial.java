package Concepts;

public class Factorial {

	public static void main(String[] args) {
		
       System.out.println(factNumber(1));
	}

   public static long factNumber(long num)
   {
	   long fact=1;
	   if(num==0)
		   return 1;
	   for(int i=1;i<=num;i++)
	   {
		   fact=fact*i;
	   }
	  return fact;
		   
   }

}
