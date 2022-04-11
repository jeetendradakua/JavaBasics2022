package Finaliseconcept;

public class Employee {

	String id;
	
	
	@Override
	public void finalize() {
		System.out.println("comp--finalize");
	}
	
	
	
	
	
	
	
	
	
	
}
