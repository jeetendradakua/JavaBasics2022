package AssignmentsJava;

public class MySecondCode {

	public static void main(String[] args) {

		 System.out.println("********");
		 
		 int a = 25;
		 int b = 78;
		 int c = 87;
		 
		 if (a>b && a>c) {
      System.out.println("The Greatest is:" +a);
	}
	else if (b>c) {
		System.out.println("The Greatest is:" +b);
	}
	else {
		System.out.println("The Greatest is:" +c);
	}
		System.out.println("********************");
		
		int m = -50;
		
		if (m>0) {
			System.out.println(m +": is positive");
	}
	else { 
		System.out.println(m +": is negative");
			
		}
		
		System.out.println("********************");
		
	    int count=0;
        while(++count <= 10){
            System.out.println("I am batman " + count);
        }
    //    System.out.println(count);
        
        
        System.out.println("********************");
        
        int count1=0;
        while(++count1 <= 5){
            System.out.println("I am batman " );
        }
        
        System.out.println("********************");
        
        // loop codes
        
        // wap to print 10 to 1 using for , while, do while
        // do while loop
        int p = 10;
		do {
			
			System.out.println(p);
			p--;
		} while (p>=1);
		
		System.out.println("********************");
        
		
		//while
		
		int i = 10;
		while (i >= 1) {
			System.out.println(i--);
			if (i==1) {break;
			}
			
		}
		System.out.println("********************");
		
		//for loop
		for (int j =10; j>=1; j--)
			// for(int j=1; j<=10; ++j)
			{
				System.out.println(j); // 12
			}
		System.out.println("********************");
		
		
		int r= 0;
		while (r < 10) {
			System.out.println("Hello World");
			 r++; 
		}
		System.out.println("********************");
		
		int t = 1;
		while (t<=10) {
			System.out.println(t++);
			
			
		}
		System.out.println("********************");
		
		int u = 24;
		int v = 105;
		int w = 57;
		int x = 750;
		
		if (u>v && u>w && u>x ) {
			System.out.println(u  + " Is the Greatest");
		}
		else if (v>u && v>w && v>x ) {
			System.out.println(v  + " Is the Greatest");
	
		}
		else if (w>u && w>v && w>x ) {
			System.out.println(w  + " Is the Greatest");
		}
	
		else {
			System.out.println(x  + " Is the greatest");
		}
		System.out.println("********************");
		
		
		int g [] = {1,2,3,4,5,6,7,8,9};
		int even = 0; int odd =0;
		
		
		for (int k=0;  k<g.length; k++) {
				
		
		if ( g[k]%2 == 0) {
			even++;
		}
			
		else {
			odd++;
		}
		System.out.println(even);
		System.out.println(odd);
		
		
		}
		
		
	}
	
		}

	


