package JavaSessions;

public class Employee {
	
	// class vars :
	String name;
	int age;
	String city;
	double salary;
	char gender;
	boolean isActive;

	public static void main(String[] args) {
		
		
		//class -- blueprint/template/category
		
		//Object -- a physical entity
		
		Employee e1 = new Employee();
     // e1 is a object name it can be obj , R.H.S is the Object.

         e1.name="Tom";
         e1.age=20;
         e1.city="Bangalore";
         e1.salary=12.33;
         e1.gender='m';
         e1.isActive = true;
	
	
	System.out.println(e1.name+" "+e1.age +" " +e1.isActive);
	
	   Employee e2 = new Employee ();
	   
	   System.out.println(e2.name +""+ e2.age+ "" +e2.salary + e2.gender + e2.isActive);
	// default values of string is null , integer is 0, double is 0.0, char is blank space, boolean is false
	
	
	// memory management :
	    //  heap memory & stack memory 
	   // heap --> Garbage Collector
	   // garbage collector  --> it will destroy the object which do not have any references  , GC is totally depended on JVM its an internal mechanism 
	   // to call GC manually we have a class called System.gc(); theirs no guarantee that it will go straightly to heap memory without consult of JVM
	   
	   
	     Employee e3 = new Employee ();
	     e3.name = "Petere" ;
	     e3.age = 40;
	     
	     System.out.println(e3.name);
	     
	     e3 = null;
	     
	//     System.out.println(e3.name);  // Null pointer exceptions.
	    		 
	   // GC will also destroy he null references.
	
	
	
	
	}

}
