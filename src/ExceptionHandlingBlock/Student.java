package ExceptionHandlingBlock;

public class Student {

	
	
	public static int getMarks(String name) {
		
		System.out.println("student name : "+name);
		
		
		if(name.equals("Sandeep")) {
			try {
				int marks = 10/0;
				return 80;
			}
			catch(ArithmeticException e) {
				System.out.println("some ex is coming ..");
		return 70;
			}
			finally {
			//return 90;
				System.out.println("bye");
		}
			}
		else if (name.equals("Roopali")) {
			return 100;
		}
		else if (name.equals("Naveen")) {
			return 10;
		}
		else {
			System.out.println("Student is not present");
		return -1;
		}
	}
	
	
	
	
	public static void main(String[] args) {

		int m1 = getMarks("Sandeep");
		System.out.println(m1);
		
		
		
		
	}

}
