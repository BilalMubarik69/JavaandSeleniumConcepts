package Concepts;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementArray {

	public static void main(String[] args) {
		String names[]={"Java","Python","C","Javascript","C#","Java","C#"};
		//1.With For Loop(For String)
		int size=names.length;
		System.out.println(size);
		
		for(int i=0;i<size;i++) //Time Complexity=o(nxn)
		{
			for(int j=i+1;j<size;j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("Duplicate Element in the String Array is:"+names[i]);
				}
			}
		}
      //For integer
	  int[] num={10,11,12,13,14,19,11,19};
	  
	  int numsize=num.length;
	  
	  for(int i=0;i<numsize;i++)
	  {
		  for(int j=i+1;j<numsize;j++)
		  {
			  if(num[i]==num[j])
			  {
				  System.out.println("Duplicate Element in integer array is:"+num[i]);
			  }
		  }
	  }
	  System.out.println("************");
	
	////2.With HastSet,It stores unique values
	  Set<String> store=new HashSet<String>();   
	  for(String name:names) //O(n) Time Complexity
	  {
		  if(store.add(name)==false)
		  {
			  System.out.println("Duplicate Element is:"+name);
		  }
	  }
	
	}

}
