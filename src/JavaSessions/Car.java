package JavaSessions;

import java.util.ArrayList;

public class Car {
	/**
	 * this is method is used to book the car on the basis of car type 
	 * 
	 * 
	 * @param car(String)
	 * @return this will return arraylist
	 */
	public ArrayList<String> booking (String car) {
		System.out.println("car type:"+car);
		ArrayList<String> carList = new ArrayList<String>();
		
		if(car.equals("sedan")) {
			carList.add("city");
			carList.add("civic");
			carList.add("tata indigo");
		}else if (car.equals("SUV")) {
			carList.add("Rangerover");
			carList.add("XUV700");
			
		}else if (car.equals("mini")) {
			carList.add("cooper");
			carList.add("swift");
		}else {
			System.out.println("car type is not avail.....");
		}
		
		return carList;
	}
	
	
	// method overloading : poly +morphism --> compile time (static)
	// with in the same class, when have;
	//1. different methods with the same name
	//2. diff. parameters
	//3. diff. sequence of the parameter
	
	
	
	public void test() {  //0 param
		System.out.println("test method ");
	}
	
	public void test(int a) { //1 param
		System.out.println("test method " + a);
	}
		
		
	public void test(int a, int b) {//2 param
		System.out.println("test method " + a+b);
	}	
	
	public void test(String a, int b) { // diff. param
		System.out.println("test method " + a+b);
	}	
	
		
	public void test(int a, String b) { // diff. param diff sequence
		System.out.println("test method " + a+b);
	}	
	
	
	

	public static void main(String[] args) {
        
		
		Car c = new Car();
		ArrayList<String> sedanList = c.booking("sedan");
		System.out.println(sedanList);
		
		c.test();
		c.test(10);
		
	}

}
