package WebDriver_Archietecture;

public class ChromeDriver implements WebDriver{

	public ChromeDriver() {
		System.out.println("LAUNCH  chrome BRowser");
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
System.out.println("find the element:"+element);		
	}

	@Override
	public void findElements(String element) {
		System.out.println("find the elements:"+element);	
		
	}


	
	
	
	
	
	
}
