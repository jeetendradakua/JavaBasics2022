package OOP_Encapsulation;

public class Browser {
         
	public void launchBrowser() {
		System.out.println("lunching browser....");
		 checkRAM();
		 checkOSCompatible();
		 checkBrowserVersion();
		 checkBrowserUpdated();
		 System.out.println("browser launched.....");
	}
	
	
	 private void checkRAM() {
		 System.out.println("Checking RAM");
		 
	 }
	 
	 private void checkOSCompatible() {
		 System.out.println("checkOSCompatible");
	 }
	 
	 private void checkBrowserVersion() {
		 System.out.println("checkBrowserVersion");
	 }
	 
	 private void checkBrowserUpdated() {
		 System.out.println("checkBrowserUpdated");
	 }
}
