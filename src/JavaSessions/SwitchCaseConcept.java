package JavaSessions;

public class SwitchCaseConcept { // it can be used only in String or int only

	public static void main(String[] args) {

		String browser = "  Chrome";

		switch (browser.toLowerCase().trim()) {

		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch ff");
			break;
		case "ie":
			System.out.println("launch ie");
			break;
		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("please pass the right broswer");
			break;
		}
		System.out.println("*******");
		// RBAC -- USER PERMISSION

		String role = "admin"; // superadmin, cus, vendor, partner, seller
		switch (role.toLowerCase().trim()) {
		case "superadmin":
			System.out.println("select superadmin");

			break;
		case "customer":
			System.out.println("select customer");

			break;
		case "vendor":
			System.out.println("select vendor");

			break;
		case "admin":
			System.out.println("select admin");

			break;
		case "partner":
			System.out.println("select partner");

			break;
		case "seller":
			System.out.println("select seller");

			break;

		default:
			System.out.println("Selected Role is invalid");
			break;
		}
	}

}
