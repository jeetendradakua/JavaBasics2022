package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		String s = "Hello World";
		String s1 = "Naveen Auto Labs";
		String s2 = "100";

		String x = "Hello";
		String y = "Testing";

		int a = 100;
		int b = 200;
		System.out.println("********");

		System.out.println(x + y);
		System.out.println(a + b);

		System.out.println("********");

		System.out.println(a + b + x + y);// 300HelloTesting
		System.out.println(x + y + a + b);// HelloTesting100200
		System.out.println(x + y + (a + b));// HelloTesting300

		System.out.println("********");

		System.out.println("the value of a is " + a);
		System.out.println("the value of " + b);
		System.out.println("sum is:" + (a + b));

		System.out.println("********");

		double c = 12.33;
		double d = 23.33;
		System.out.println(c + d);

		System.out.println(x + y + c + d + a + b);
		System.out.println(a + b + x + y + c + d);

		System.out.println("********");

		char t1 = 'a';// 97
		char t2 = 'b';// 98
		char t3 = 'r';
		char t4 = '1';
		// ASCII table

		System.out.println(t1 + t2); // 195
		System.out.println(t1);// a
		System.out.println((int) t3);

		// a-z = 97 to 122
		// A-Z = 65 to 90
		// 0-9 = 48 to 57

		System.out.println("********");

		System.out.println(x + t1);
		System.out.println(t1 + t2 + t4 + x + y);

		System.out.println("********");

		System.out.println(10 + 20);
		System.out.println(20 / 10);
		// System.out.println(9/0); //Arithmetic Exception);

		System.out.println(0 / 9); // 0

		System.out.println(5 / 2); // 2

		System.out.println(5.0 / 2); // 2.5

		System.out.println(5 / 2.0);// 2.5

		System.out.println(5.0 / 2.0); // 2.5

		System.out.println(2.5 / 0); // Infinity

		System.out.println(2 / 0.0); // Infinity

		System.out.println(2.5 / 0.0); // Infinity

		// System.out.println(0/0); // Arithematic Exception

		System.out.println(0 / 0.0); // NaN NOT a Number

		System.out.println(0.0 / 0.0); // NaN

		System.out.println(0.0 / 0); // NaN
	}

}
