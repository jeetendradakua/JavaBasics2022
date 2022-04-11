package OOP_Abstract;

public class HomePage extends Page {
//DEFAULT CONST....
	
	public HomePage () {
		System.out.println("hp--const....");
	}
	
	public HomePage (int a) {
		System.out.println("hp--const...."+a);
	}
	
	
	@Override
	public void title() {
 System.out.println("hp--home page title");		
	}

	@Override
	public void url() {
System.out.println("hp--url");		
	}

}
