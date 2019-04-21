package Concepts;

public class PalindromeNumber {

	public static void main(String[] args) {
		Palindrome(141141);

	}


public static void Palindrome(int num){
	
	int r=0;
	int sum=0;
	int t;
	
	t=num;
	while(num>0){
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
	}
    if(t==sum)
    {
    	System.out.println("Number is Palindrome number");
    }
    else{
    	System.out.println("Number is not a palindrome");
    }
}


}
