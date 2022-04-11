package InheritanceOops;

public class BMW extends Car {
	
	
	@Override
	public void start ( ) {
		System.out.println("BMW--Start");
	
	}

	@Override
	public void engine ( ) {
		System.out.println("BMW--Engine");
	
	}
	public void autoParking ( ) {
		System.out.println("BMW--auto parking");
	
	}
	private void price() {
		System.out.println("BMW--Price");
	}
	
	//method hiding
	public static void speed() {
		System.out.println("BMW--Speed");
	}
	
	
	
	
}
