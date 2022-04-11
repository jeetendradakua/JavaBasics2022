package JavaSessions;

public class CarType {

	String name;
	int price;
	String color;
	static final int wheels = 4;
	
	
	
	
	
	
	//static variable are also called instance variable
	// wheels is a common property for every car its value is 4so we write static int
	// it will be stored in common memory allocation (cma) also called meta space, also called perment generation ,
//	all the static property will be stored here 
	
	// final static variable cannot be changed 
	
	public static void start() {
		System.out.println("car--start");
	}
	
	public void stop() {
		System.out.println("car--stop");
	}
	
	
	
	
	public static void main(String[] args) {
		
		CarType c1 = new CarType();
		c1.name = "Honda";
		c1.price = 10;
		c1.color = "white";
    //    CarType.wheels=5;
		c1.stop();
		
		// to call static method
		
		 start();
		 CarType.start();
		 
		CarType c2 = new CarType();
		c2.name = "Audi";
		c2.price = 50;
		c2.color = "red";
		
		
		CarType c3 = new CarType();
		c3.name = "BMW";
		c3.price = 60;
		c3.color = "Black";
		
		// how to all static property:
		//1. directly
		System.out.println(wheels);
		//2.class name:
		System.out.println(CarType.wheels);
	}

}
// why main method is static in nature ;

// so that it can be stored in cma
// jvm will call the method without creating the object.