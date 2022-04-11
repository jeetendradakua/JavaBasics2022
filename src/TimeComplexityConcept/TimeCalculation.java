package TimeComplexityConcept;

public class TimeCalculation {

	public static void main(String[] args) {

		//TC--> Big O(n)

		
		int i = 1;
		System.out.println(i);
		
		//O(1)
		
		
		
		
		
		
		//1 for loop:
		for(int p =1; p<=10;p++) {
			System.out.println(p);//10 secs-->0.001 
		}
		//1+ n + n + n ==> 1+3n ==> 3n+1 ==> 3n ==> O(n)--linear
		
		//2 for loops :
		
		for(int m=1;m<=10;m++) {
		for(int n = 1; n<=10;n++) {
			System.out.println(m+":"+n);
		}
		}
		
		//(1+n+n)(1+n+n+n) ==> (1+2n)(1+3n) ==> 1+3n+2n+6n^2 ==> 1+5n+6n^2 ==>Quadratic equation
		//6n^2+5n==>n(6n+5)==> n(6n) ==> 6n^2
		//O (n^2)
		
		//3 for loops:
		for(int m=1;m<=10;m++) {
			for(int n = 1; n<=10;n++) {
				for(int q = 1; q<=10;q++) {
				System.out.println(m+":"+n+":"+q);
			} 
				
				//(1+n)(1+n)(1+n) ==> O(n^3) -cubic
			}
   
			//Binary Search 
			//{10,20,22,23,4,5,66,78,111}
			//sort
			//L--10,20,22,33 --> 10,20--> 10|20
			//R-- 4,5,66,78,111
			//n/2 -->  n/4-->n/8-->n/16
			//n/m
			//x=n/m
			//log()=log(n/m)==>log(n)====>O(log N)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		}

}
