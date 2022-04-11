package InheritanceOops;

public class Car extends Vehicle {
	
	
	
	public static void speed() {
		System.out.println("Car--Speed");
	}
	
	
	@Override
	public void engine ( ) {
		System.out.println("Car--Engine");
	
	}
	
	

	private void price() {
		System.out.println("Car--Price");
	}
	
	
	
	
	public void start ( ) {
		System.out.println("Car--Start");
	
		
		
	}
	public void stop ( ) {
		System.out.println("Car--Stop");
	
	}
	
	public void refule ( ) {
		System.out.println("Car--Refuel");
	
	}
	
	
	
	// final keyword declaration will prevent inheritance , overriding as well , 
	
	// final keyword is used for constant variables
	
	
	
	
	
	
}
