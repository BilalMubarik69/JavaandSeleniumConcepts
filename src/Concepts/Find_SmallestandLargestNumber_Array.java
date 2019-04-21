package Concepts;

public class Find_SmallestandLargestNumber_Array {

	public static void main(String[] args) {
		
		int numbers[]={10,20,30,-2,-8,90,100,220,-300};
		
		int largestNumber=numbers[0];
		
		int smallestNumber=numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>largestNumber){
				largestNumber=numbers[i];
				
			}
			else if(numbers[i]<smallestNumber){
				smallestNumber=numbers[i];
				
			}
		}

	 System.out.println("Largest number is:"+largestNumber);
	 
	 System.out.println("Smallest Number is:"+smallestNumber);
	
	}

}
