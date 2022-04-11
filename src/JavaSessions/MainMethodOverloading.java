package JavaSessions;

public class MainMethodOverloading {
	public static void main(int a) {
		
	System.out.println(a);	
	}
	public static void main(int a, int b) {
	System.out.println(a+b);	
		
	}
	public static void main(String[] args) {
        System.out.println("main method");
        main(10);
        main(10,20);
	}

}
// yes we can overload the main method but jvm will check the signature with static void main with a string array .

// static method can be overload