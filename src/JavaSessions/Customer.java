package JavaSessions;

public class Customer {
     
	// non static methods, class variables : data members of the class
	// function can not created inside a function (method)
	// functions are parallel to each other
	// functions are always independent to each other
	
	//return type: void: can not return any value
    //default fun : 0 param
	//1. no input an no return
	
	public void test () {
		System.out.println("test method");
		int a=10;
		System.out.println(a+20);
	}
	//2. no input and some return
	// return type : int 
	public int getMarks() {
		System.out.println("get marks method");
		int a =10;
		int b =20;
		int c =90;
		
		int total = a+b+c;
		 return total;
				
	}
	// return type: String
	
	
	public String  getTrainerName() {
		System.out.println("Get Trainer Name");
	    String name = "Jeetu";
	    return name;

	}

	//3. some input and some return:
	
	public int  add(int a, int b) {   // add is a method  & a,b are parameters
		System.out.println("add method");
		int sum = a+b;
		return sum;	
		
	}
	
	//WAF :
	//getStudentMarks
	//input param : name(String)
	//return marks (int)
	
	public int  getStudentMarks(String name) {
		System.out.println("getting student marks for : "+ name);
		
	/*	if(name.equalsIgnoreCase("Munneb")){
			return 90;
		}
		else if (name.equalsIgnoreCase ("Ravish")) {
			return 95;
		}
		else if (name.equalsIgnoreCase("Anuradha")) {
			return 10;
		}
		else if(name.equalsIgnoreCase("Naveen")) {
			return 80;
		}
		else {
			System.out.println("PLEASE PASS THE RIGHT STUDENT NAME:" + name);
			return -1;
		}*/
		
		int marks = -1;
		if(name.equalsIgnoreCase("Munneb")){
			marks= 90;
		}
		else if (name.equalsIgnoreCase ("Ravish")) {
			marks = 95;
		}
		else if (name.equalsIgnoreCase("Anuradha")) {
			marks = 10;
		}
		else if(name.equalsIgnoreCase("Naveen")) {
			marks = 80;
		}
		else {
			System.out.println("PLEASE PASS THE RIGHT STUDENT NAME:" + name);
			
		}
			return marks;
		}
	
	
	
	
	
	
	
	public static void main(String[] args) {
       
		// call a function : have to create the object of the class
		 Customer obj = new Customer();
		 obj.test();
		int t = obj.getMarks();  //  t is called a holding variable here 
		System.out.println(t+50);
		
		String n = obj.getTrainerName();  // n is the holding variable
		System.out.println("The trainer name is:"+ n);
		
		
		int sum = obj.add(20,30);  // 20,30 are method arguments
		System.out.println(sum);
		
		int m1 = obj.getStudentMarks("Anuradha");
		System.out.println(m1+10);
		
		int m2 = obj.getStudentMarks("Tom");
		if(m2==-1) 
		System.out.println("wrong student...");
		
	}

}
