package OOPConcept;

public class ConstructorConcept {

	String name;
	int age;
	
	   public ConstructorConcept(String name,int age) {
		   System.out.println("This is a base constructor"); 
	       this.name=name;
		   
		   
		   
		   System.out.println("Name:"+name);
		   
		   System.out.println("Age:"+age);
		   
	   }
	
	
	
	public static void main(String[] args) {
		
		ConstructorConcept c=new ConstructorConcept("Bilal",27);
	
	
	}

}
