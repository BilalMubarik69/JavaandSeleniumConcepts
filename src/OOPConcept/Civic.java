package OOPConcept;

public class Civic extends Car{

    //Method Overriding:
	//When method with same name is present in parent class as well as in child class with same number of arguments is called method overriding.
	
	public void StartCar(){   //Overridden method
	System.out.println("Civic----Start Car");
}

public  void refuel(){
	System.out.println("Civic----Refuel Car");
}
}
