package OOPConcept;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		//LinkedList is class which implements List and Deque Interface.LinkedList is a type of dynamic array which stores data on the basis of 2 things one is actual data and other is reference of next node. 
		 
		
		LinkedList<String> li=new LinkedList<String>();
		
		li.add("Selenium");
		li.add("Katalon Studio");
		li.add("Appium");
		li.add("Jenkins");
		
		System.out.println("Contents of linkedlist:"+li);
		
		//Now add new value at first and last position
		li.addFirst("Protractor");
		
		System.out.println("Contents of linkedlist:"+li);
		
		li.addLast("Sikuli");
		
		System.out.println("Contents of linkedlist:"+li);
		
		//Get Value
		System.out.println(li.get(3));
		
		//Set Value
		li.set(3, "Winium");
		
		System.out.println(li.get(3));
		
		System.out.println("Contents of linkedlist:"+li);
		
		//for loop
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		
	
	   
	}

}
