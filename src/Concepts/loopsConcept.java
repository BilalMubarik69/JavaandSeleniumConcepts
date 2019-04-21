package Concepts;

public class loopsConcept {

	public static void main(String[] args) {
		
		//1.for loop
		//Print numbers from 1 to 10 through for loop
		Object data[]=new Object[]{"Automation",'z',20,12.66,"Java"};
		
		
		int size=data.length;
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			System.out.println(data[i]);
		}
	
	//2.While loop
	  int j=0;
	  while(j<size){
		  
		  System.out.println(data[j]);
		  j++;
	  }
	
	
	  int a=0;
	  while(a<50)
	  {
	  a++;
	  System.out.println(a);
	  }
	  
	  
	}

}
