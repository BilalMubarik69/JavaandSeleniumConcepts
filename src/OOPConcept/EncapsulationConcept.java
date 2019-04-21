package OOPConcept;

public class EncapsulationConcept {

	


	public static void main(String[] args) {
		
		EncapsulationClass data=new EncapsulationClass();
		data.setName("Bilal");
		data.setDept("Automation");
		data.setAge(27);
	    data.setDOB("23");
		
		
		System.out.println(data.getName());
		System.out.println(data.getDept());
		System.out.println(data.getAge());
        System.out.println(data.getDOB());
	}

}
