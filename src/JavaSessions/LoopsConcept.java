package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// 1 to 10:
		// 1. while loop

		int i = 1;
		while (i <= 100) {
			System.out.println(i);
			i++;
			// ++i;
			// i=i+1;
			// i=i+2; // odd numbers

		}

		System.out.println("***********");
		int k = 1;
		while (k <= 100) {
			System.out.println(k);
			if (k % 5 == 0) {
				System.out.println("hiii");
				break;
			}
			k++;
		}
		System.out.println("***********");

		// use cases of while loop:
		// 1. you have to use while loop when number of iterations are not fixed
		// 2. waiting for the element on the page
		// 3. waiting for the page to be loaded
		// 4. pagination : 1 2 3 4 5 6....11...20

		// 2. for loop:
		// 1 to 10:
		for (int j = 1; j <= 10; j++)
		// for(int j=1; j<=10; ++j)
		{
			System.out.println(j); // 12
		}
		System.out.println("****10 to 1****");
		for (int l = 10; l >= 1; l--) {
			System.out.println(l);
		}

		System.out.println("**************");

// use cases of for loop:
//1. use for loop when number of iterations are fixed
//2. drop down traversing
//3. menu items of the page
//4. calendar handling

//3. do while loop :

		int p = 1;
		do {
			
			System.out.println(p);
			p++;
		} while (p<=10);
		
		
		
	System.out.println("*********");	
		
		//00 01 02 03 04
		//10 11 12 13 14
		//20 21 22 23 24
		
		for(int l=0;l<=4;l++) {
			for(int m=0;m<=4;m++) {
				System.out.print(l+""+m+" ");
			}
			System.out.println();
		}
		
		for(int z=0;z<=9;z++) {
			for(int s=0;s<=9;s++) {
				System.out.print(z+""+s+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
}

