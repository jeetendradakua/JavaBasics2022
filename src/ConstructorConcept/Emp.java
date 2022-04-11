package ConstructorConcept;

public class Emp {
   
	String name;
	int age;
	String city;
	double sal;
	boolean isPerm;
	
	//const .. will help us to design the object
	// it will avoid to create unnecessary object  inside the memory
	// OBJECT CREATE POLICY IN JAVA USING CONSTRUCTOR
	
	public Emp (String name, int age) {
		System.out.println("emp const..");
		this.name=name;
		this.age=age;
	}
	
	public Emp (String name, int age, String city) {
		System.out.println("emp const..");
		this.name=name;
		this.age=age;
		this.city=city;
	}
	

	
	public Emp(String name, int age, String city, double sal, boolean isPerm) {
		
		this.name = name;
		this.age = age;
		this.city = city;
		this.sal = sal;
		this.isPerm = isPerm;
	}

	public Emp(String name, int age, boolean isPerm) {
		
		this.name = name;
		this.age = age;
		this.isPerm = isPerm;
	}


	public Emp(String name) {
		
		this.name = name;
	}

	public static void main(String[] args) {
                 
		
		Emp e1 = new Emp ("Tom", 25);
		
		System.out.println(e1.name);
		System.out.println(e1.age);
		
		Emp e2 = new Emp ("Peter",30,"LA");
		System.out.println(e2.name+""+e2.age+""+e2.city);
	      
		Emp e3 = new Emp("Lisha",24,"Pune",2145.54, true);
		
		Emp e4 = new Emp("Ravi");
		
		
	
		
		
				
		
	}
	}


