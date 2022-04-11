package BuilderPattern;

public class ECommApp {

	public ECommApp login() {
		System.out.println("login to the app");
		return this;
	}

	public ECommApp login(String un, String pwd) {
		System.out.println("login with :" + un + ":" + pwd);
		return this;
	}

	public ECommApp search(String productName) {
		System.out.println("searching the product :" + productName);
		return this;
	}

	public ECommApp search(String productName, int price) {
		System.out.println("searching the product :" + productName + ":"+ price);
		return this;
	}

	public ECommApp addToCart(String productName) {
		System.out.println("adding to cart:" + productName);
		return this;
	}

	public ECommApp doPayment(String CC, int otp) {
		System.out.println("make payment using:" + CC + ":" + otp);
		return this;
	}
	
	public ECommApp doPayment(String upi) {
		System.out.println("make payment using:" + upi);
		return this;
	}
	
	public ECommApp genarateId() {
		System.out.println("your order id is:" + 45544444);
		return this;
	}
	
	public ECommApp logOut() {
		System.out.println("logout");
		return this;
	}
}
