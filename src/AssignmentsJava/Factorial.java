package AssignmentsJava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int no, fact = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number :");
		no = s.nextInt();
		for (int i = 1; i <= no; i++) {
			fact = fact * i;

		}

		System.out.println("Factorial is :" + fact);

	}

}
