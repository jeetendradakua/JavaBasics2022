package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		if (b > a) {
			System.out.println("b is gr than a");
		} else {
			System.out.println("a is gr than b");
		}

		if (a == b) {
			System.out.println("a is equal to b");
		} else {
			System.out.println("a is not equal to b");
		}

		if (true) {
			System.out.println("Hi..");
		} else {
			System.out.println("Bye.."); // deadcode

		}
		boolean flag = false;
		if (flag) {
			System.out.println("testing..");
		} else {

			System.out.println("dev..");
		}

		int marks = 100;
		if (marks >= 90) {
			if (marks >= 95) {
				System.out.println("grade a ++");
			} else {
				System.out.println(" grade a");
			}
		} else {
			System.out.println("grade b");
		}
		System.out.println("*********");
		// WAP : Three different numbers
		// Find out the max number :

		int x = 500;
		int y = 400;
		int z = 600;

		if (x > y && x > z) { // && = short circuit operator
			System.out.println("x is the greatest");
		} else if (y > z) {
			System.out.println("y is the greatest");

		} else {
			System.out.println("z is the greatest");
		}
		System.out.println("********************");
		// WAP : Four different number :
		// Find out the greatest number :

		int m = 600;
		int n = 400;
		int o = 300;
		int p = 800;

		if (m > n && m > o && m > p) {
			System.out.println("m is the greatest");
		} else if (n > o && n > p) {
			System.out.println("n is the greatest");
		} else if (o > p) {
			System.out.println(" o is the greatest");
		} else {
			System.out.println("p is the greatest");

		}

	}
}
