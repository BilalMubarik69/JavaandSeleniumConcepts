package Concepts;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println(Primenumber(17));

	}


	public static boolean Primenumber(int num)
	{
		if(num==1){
			return false;
		}
	   for(int i=2;i<num;i++){
		   if(num%i==0){
			   return false;
		   }
		     
	   }
	    
	   return true;
	
	}


}
