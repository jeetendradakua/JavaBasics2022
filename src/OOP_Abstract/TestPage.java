package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {

		
	HomePage hp	= new HomePage(10);
		
		hp.title();
		hp.url();
		hp.timeOut();
		hp.logo();
		
		LogInPage lp = new LogInPage ();
		lp.title();
		lp.url();
		lp.doLogIn();
		lp.timeOut();
		
		//top casting :
		
		Page p = new LogInPage ();
		p.title();
		p.logo();
		p.timeOut();
		p.url();
		
		
		
	
	}

}
