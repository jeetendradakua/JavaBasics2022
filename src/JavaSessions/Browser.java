package JavaSessions;

public class Browser {

	//waf : will launch the browser
	//input : browserName(String)
	//return: void
	
	public boolean launchBrowser(String browserName) {
		System.out.println("browser name: "+ browserName);
		//boolean flag=false;  //default value of boolean is false
		switch (browserName.toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			//flag = true;
			return true;
			//break;
		case "firefox":
			System.out.println("launch firefox");
			//flag = true;
			return true;
			//break;
		case "opera":
			System.out.println("launch opera");
			//flag = true;
			return true;
			//break;
		case "IE":
			System.out.println("launch IE");
			//flag = true;
			return true;
			//break;
		case "safari":
			System.out.println("launch safari");
			//flag = true;
			return true;
			//break;
		default:
			System.out.println("browser is not found...." + browserName);
			return false;
			//break;	
			
			
		}
		//return flag;
	}
	
	
	
	public static void main(String[] args) {
        
		Browser br = new Browser() ;
		if (br.launchBrowser("chrome")) {
			System.out.println("enter url");
		}
		
		if(br.launchBrowser("mico")) {
			System.out.println("enter url");
		}
		else {
			System.out.println("mico is not available.....");
		}
		
	}

}
