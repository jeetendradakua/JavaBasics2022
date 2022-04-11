package WebDriver_Archietecture;

public interface WebDriver extends SearchContext{

	public void click();
	
	public void sendKeys(String Value);
	
	public String getTitle ();
	
	public String getURL();
	
	public void quite ();
	
	
	@Override
    public void findElement(String element);
	
	
	@Override
	public void findElements(String element);
	
}











