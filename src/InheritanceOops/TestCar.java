package InheritanceOops;

public class TestCar {

	
	// method overriding : poly morphism : dynamic polymorhism : run time polymorphism
	// method overriding : when u have method in parent class as well as as in child class
	// with same name and same number of parameters
	// and same number of parameters
	// and same return type
	
	
	
	
	//multiple inheritance is not possible in java
	//multilevel inheritance is allowed in java
	//multiple parents is not allowed
	//inheritance within siblings is not possible
	
	// can we overload the static method : yes 
	// whenever we override any static method that is called method hiding 
	// we cannot override static and private method
	
	
	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();  // method overridden
		b.autoParking(); // individual property
		b.stop(); // parent class property inherited
		b.refule();//inherited
		b.engine();//grand paret class inherited
		b.engine();//overridden
		
		
		Vehicle v1= new BMW ();
		v1.engine();
		
		
		
		//static 
		
		BMW.speed();
		Car.speed();
		//
		Car c = new Car();
		c.start();
		c.stop();
		c.refule();
		c.engine();
		
		
		//child class object can be referred by parent class ref variable
		//top casting
		
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refule();
		
		
		// in top casting we can access overridden or inherted method but not individual property
		// ref type check feature : in individual  not possible inn top casting  
		
		
		//down casting: not possible
		
	//	BMW b1 =new Car(); //not possible 
	
		 BMW b1 = (BMW)new Car();
		 b1.start();  //ClassCastException
		
		BMW b2=(BMW)new Vehicle (); //ClassCastException
		
		Audi a = new Audi ();
		a.stop();
		a.engine();
		a.refule();
		a.start();
		a.theftSafety();
		
		
		
		
	}

}
