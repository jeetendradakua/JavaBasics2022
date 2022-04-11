package JavaSessions;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {

		// 1. post increment

		int a = 1;
		int b = a++;
		System.out.println(a);
		System.out.println(b);

		int c = -99;
		int d = c++;

		System.out.println(c);
		System.out.println(d);

		System.out.println("********");

		// 2. pre increment
		int h = 1;
		int g = ++h;
		System.out.println(h); // 2
		System.out.println(g); // 2

		int p = -198;
		int q = ++p;

		System.out.println(p);
		System.out.println(q);

		System.out.println("********");

		// 3. post decrement:

		int m = 2;
		int n = m--;
		System.out.println(m); // 1
		System.out.println(n); // 2

		// 4. pre decrement:

		int u = 2;
		int y = --u;
		System.out.println(u); // 1
		System.out.println(y); // 1

		System.out.println("********");
		int s = 1;
		System.out.println(s++);
		System.out.println(s);

		System.out.println(++s);
		System.out.println(s);
	}

}
