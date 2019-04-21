package OOPConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistConcept {

	
	public static void main(String[] args) {
		
		System.out.println("*******************Non-Generics Concept Array List****************************");
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add(190);
		ar.add("Selenium");
		
		int s=(int)ar.get(1);
		System.out.println("Type Casting:"+s);
		ar.add("Appium");
		
		System.out.println(ar.size());

	    ar.add(12.66);
	    
	    System.out.println(ar.size());
	    
	    System.out.println(ar.get(4));
	    
	    for(int i=0;i<ar.size();i++)
	    {
	    	System.out.println(ar.get(i));
	    }
	    System.out.println("*********************Generics ArrayList Concept ***************************");
	    
	    ArrayList<Integer> ar1=new ArrayList<Integer>();
	    
	    ar1.add(11);
	    ar1.add(10);
	    ar1.remove(1);
	    ar1.add(12);
	    
	    
	    for(int i=0;i<ar1.size();i++)
	    {
	    	System.out.println(ar1.get(i));
	    }
       ArrayList<String> ar2=new ArrayList<String>();
	    
	    ar2.add("John Cena");
	    ar2.add("Randy Orton");
	    ar2.add("Kane");
	    
	    for(int i=0;i<ar2.size();i++)
	    {
	    	System.out.println(ar2.get(i));
	    }
	    //How to specific define user define class objects in arraylist 
	    
	    System.out.println("************Employee Class Objects iteration through traverse using arraylist Concept*******************");
	    //Employee Class objects:
	    Employee e1=new Employee("Bilal", "Automation", 27);
	    Employee e2=new Employee("Tom", "QA", 40);
	    Employee e3=new Employee("John", "Dev", 50);
	    
	    //Create ArrayList
	    ArrayList<Employee> a7=new ArrayList<Employee>();
	    
	    a7.add(e1);
	    a7.add(e2);
	    a7.add(e3);
	    
	    //Use Iterator to traverse the array list values for class objects
	   Iterator<Employee> it=a7.iterator();
	   
	   while (it.hasNext()) {
	       Employee emp=it.next();  
		   
		   System.out.println(emp.name);
		   System.out.println(emp.dept);
		   System.out.println(emp.age);
		   
	      }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    System.out.println("********Add All Concept*****************");
	
ArrayList<String> ar3=new ArrayList<String>();
	    
	    ar3.add("John Cena");
	    ar3.add("Randy Orton");
	    ar3.add("Kane");
	    
ArrayList<String> ar4=new ArrayList<String>();
	    
	    ar4.add("Tripe h");
	    ar4.add("Bilal");
	    ar4.add("Umer");
	    
	   ar3.addAll(ar4); 
	   
	   for(int i=0;i<ar3.size();i++)
	   {
		   System.out.println(ar3.get(i));
	   }
	
	System.out.println("************Remove All Concept*****************************");
	
	ar3.removeAll(ar4);
	
	for(int i=0;i<ar3.size();i++)
	   {
		   System.out.println(ar3.get(i));
	   }
	
	
	System.out.println("*********************Retainall Concept*****************************");
	
	
	ArrayList<String> ar9=new ArrayList<String>();
    
    ar9.add("Bilal");
    ar9.add("Tripe h");
    ar9.add("Kane");
    
ArrayList<String> ar10=new ArrayList<String>();
    
    ar10.add("Tripe h");
    ar10.add("Bilal");
    ar10.add("Umer");
    
    ar9.retainAll(ar10);
    
    for(int i=0;i<ar9.size();i++)
    {
    	System.out.println(ar9.get(i));
    }
	
	}

}
