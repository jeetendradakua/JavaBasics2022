package OOP_Interface;

public interface USMedical extends WHO{

	int min_fee = 10;
	// Static and final variable by default
	
	
	
	
	//no method body
	//only method declaration / method prototype
	//abstract methods
	
	
	// cannot create the object of interface
	
	
	
	
	public void physioServices();
	public void cardioServices();
	public void entServices();
	
	public void emergencyServices();
	
	public int getPatientNumber(String name);
	
	public void covid19Research();
	//after jdk 1.8:
	
	//1. you can have static method with method body:
	
	public static void billing () {
		
		System.out.println("US-billing");
	}
	
	//2.default method with method body:
	
	default void medicalTraining() {
		System.out.println("US--medical training");
	}
	
	
	
	
	
	
	
	
}
