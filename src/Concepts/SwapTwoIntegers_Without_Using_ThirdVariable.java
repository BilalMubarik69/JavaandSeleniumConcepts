package Concepts;

public class SwapTwoIntegers_Without_Using_ThirdVariable {

	public static void main(String[] args) {
		
		int x=10;
		int y=5;
		
		x=x+y;//15
		
		
		y=x-y;//10
		System.out.println("Value of Y After Swap:"+y);
		
		x=x-y;
		
		System.out.println("Value of x after swap:"+x);
		
		x=x^y;
		y=x^y;
		x=x^y;
		
		System.out.println(x);
		System.out.println(y);

	}

}
