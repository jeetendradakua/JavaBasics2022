package WebDriver_Archietecture;

public class AmazonAppTest {
	static WebDriver driver;

	public static void main(String[] args) {

		// chrome

		/*
		 * ChromeDriver driver = new ChromeDriver(); driver.getTitle(); driver.getURL();
		 * driver.click(); driver.quite();
		 */
		// firefox/Chrome/safari : cross browser

		// ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();
		// SafariDriver driver = new SafariDriver ();

		String browser = "chrome";
		// cross browser logic : top casting
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("please pass the rght browser...");
		}

		driver.getTitle();
		driver.getURL();
		driver.click();
		driver.quite();
		driver.findElement("email id");
		driver.findElements("password");
	}

}
