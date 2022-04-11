package SuperKeyword;

public class Employee extends Company {
	
	
	
	// Use of super keyword :
    // calling the parent class variable 
	// can be used  for constructor chaining
	
	
	
	int salary = 200;

	public Employee() {
		super(10);
		System.out.println("emp--const..");
	}

	public void cafe() {
		System.out.println("Emp--cafe");
		System.out.println(salary);
		System.out.println(super.salary);
		super.cafe();
		super.logo();
	}

	public static void main(String a[]) {
		Employee e = new Employee();
		e.cafe();
	}

}
