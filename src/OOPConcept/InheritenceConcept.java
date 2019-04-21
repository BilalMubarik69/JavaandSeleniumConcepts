package OOPConcept;

public class InheritenceConcept {

	public static void main(String[] args) {
		//Static Polymorphism-Compile time Polymorphism
		Civic c1=new Civic();
		c1.StartCar();
		c1.StopCar();
		c1.PauseCar();
		c1.refuel();
		
		System.out.println("**************");
		Car c2=new Car();
		c2.StartCar();
		c2.StopCar();
		c2.PauseCar();
		
		System.out.println("**************");
		
		//Top Casting
		Car c3=new Civic(); //When child class object is refer by parent class refernced variable is called dynamic polymorphism or Compile time polymorphism
		c3.StartCar();
		c3.StopCar();
		c3.PauseCar();
		
        //Down Casting
		//Civic c5=(Civic) new Car(); //ClassCastException
	}

}
