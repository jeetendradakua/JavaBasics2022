package WebDriver_Archietecture;

public class SafariDriver implements WebDriver{

	public SafariDriver() {
		System.out.println("Launch sAFARI");
	}
	


	@Override
	public void click() {
		System.out.println("click on the element");
		
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("enter value :"+value);
		
	}

	@Override
	public String getTitle() {
		
		return "title";
	}

	@Override
	public String getURL() {
		
		return "http://www.xyz.com";
	}

	@Override
	public void quite() {
		
	System.out.println("quite the browser");
	}



	@Override
	public void findElement(String element) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void findElements(String element) {
		// TODO Auto-generated method stub
		
	}


	
	
	
	
	
	
	
	
	
	
}
