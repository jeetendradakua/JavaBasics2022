package OOP_Abstract;

public class LogInPage extends Page {

	@Override
	public void title() {
System.out.println("LP-- title");		
	}

	@Override
	public void url() {
		System.out.println("LP-- url");
		
	}
   @Override
	public void timeOut () {
		System.out.println("page time out is 5 seconds");
	}
	
	
   public void doLogIn () {
		System.out.println("logged in");
	}
	
	
	
	
	
}
