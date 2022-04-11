package ConstructorConcept;

public class Employee {
	
	
	String name;
	int age;
	String city;
	double sal;
	boolean isPerm;
	
	
	//constructor of the class
	// name will be same as the class name
	// const.. is not a function
	// const.. can not return anything .. no return type
	// const.. overloading is possible
	// const.. will be called when you create the object of the class
	// but function will be called when you create the object of the class and use
	// obj ref variable
	public Employee() { // 0 param
		System.out.println("deault const..");
	}
	
	public Employee(int a) { // 1 param
		System.out.println("1 param const.."+a);
	}
	
	public Employee(int a,int b) { // 2 params
		System.out.println("2 param const.."+(a+b));
	}
	public static void main(String[] args) {
          
		//Employee obj = new Employee(10); // 1 param const 10
		
		
		//Employee obj = new Employee(10,20); //3 param const 30
		
		
		Employee obj = new Employee();
		
		
		
	}

}
