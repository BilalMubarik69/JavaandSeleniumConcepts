package Concepts;

public class ArmstrongNumber {

	public static void main(String[] args) {
		ArmstrongNumber a1=new ArmstrongNumber();
		a1.ArmstrongNumbers(153);

	}

   public void ArmstrongNumbers(int num){
	   
	   int r=0;
	   int cube=0;
	   int t;
	   
	   t=num;
	   
	   while(num>0)
	   {
		   r=num%10;
		   num=num/10;
		   cube=cube+(r*r*r);
	   }
      if(t==cube)
      {
    	  System.out.println("Number is a Armstrong Number");
      }
      else{
    	  System.out.println("Number is not ArmStrong Number");
      }
   }


}
