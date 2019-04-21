package Concepts;

public class MissingValue_Array {

	public static void main(String[] args) {
		
		int num[]={1,2,3,4,5,6,7,8};
		System.out.println(num.length);
		int sum=0;
		
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
	   System.out.println("The array sum value is:"+sum);
	
	int sum2=0;
	for(int j=1;j<=9;j++){
		sum2=sum2+j;
	}
	System.out.println("Addition of value with missing value is:"+sum2);
	
	//Missing value 
	System.out.println("Missing value is:"+(sum2-sum));
	}

	
}
