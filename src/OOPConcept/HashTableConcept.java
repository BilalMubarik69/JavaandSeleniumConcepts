package OOPConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		Hashtable h=new Hashtable();
		h.put(1, "Tom");
		h.put("A", 2);
		h.put(2, "John");
		h.put("B", 3);
		
		System.out.println(h.size());
		
		System.out.println(h.get(1));
		System.out.println(h.get("A"));
		System.out.println("**********");
		
		Hashtable<Integer, String> h1=new Hashtable<Integer,String>();
		
		h1.put(1, "Jan");
		h1.put(2,"Feb");
		h1.put(3, "March");
		h1.put(4, "Jan");
		
		System.out.println(h1.get(1));
		
		System.out.println("*********");
		 // create enumeration 
        Enumeration e = h1.elements();
        while (e.hasMoreElements()) { 
            System.out.println(e.nextElement()); 
        } 

	   System.out.println("*******");
	   Set s = h1.entrySet();
	   System.out.println("set entries: " + s);
	
	}

}
