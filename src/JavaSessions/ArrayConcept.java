package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
  // 1. int array
		int i[] = new int [4];  // 4 is called th lentgh of the array.
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
	//	i[4] = 50; // Array index out of bound exception
		System.out.println(i[0]);
		System.out.println(i.length);
		System.out.println("*************");
		int li = 0;
		int len = i.length;
		int hi = len-1;
		
		System.out.println(li);
		System.out.println(len);
		System.out.println(hi);

		System.out.println(i[3]+i[0]);
		
		// how to fetch the values from array : for loop:
		for (int k=0;k<i.length;k++) {
			System.out.println(i[k]);
		}
		System.out.println("************");
		// for each loop :
		for(int e : i) {
			System.out.println(e);
			if(e==30) {
				System.out.println("hiiii");
				break;
			}
		}
		System.out.println("************");
		//System.out.println(i[4]); // exception array index out of bound
		
		//System.out.println(i[-1]); // exception array index out of bound
		
		// lowest index will always start with zero 
		// there is no negative index in array. [-1][-2]......
		
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 23.33;
		System.out.println(d[0]+d[1]);
		
		// char :
		char c[] = new char [3];
		 c[0] = 'a';
		 c[1] = '1';
		 c[2] = '$';
		 
		 // int :
		 
		 int a[] = new int [10];
		 a[5] = 10;
		 System.out.println(a[0]);  //  0 (and zero is a default value of integer
		
		 
		 //String :
		  String s[] = new String [3];
		  s[0] = "Java";
		  s[1] = "Selenium";
		  s[2] = "Jeetu" ;
		  System.out.println(s[0]);
		   for (String n:s) {
			   System.out.println(n);
		   }
		   
		   System.out.println("*******");
		   for(int p=s.length-1;p>=0;p--) {
			   System.out.println(s[p]);
			   
		   }
		  for(char b='a'; b<='z';b++) {
			 // System.out.println(b);
			  System.out.println((int)b); //ascii value
		  }
	//limitations of array
		  
		//size is fixed : to overcome this we need to use dynamic array(Array List)
		  // may waste memory
		  // stores only similar type of data : to overcome this we can use object array
		  // Object  Array : static array
		  
		  Object emp[] = new Object[5];
		  emp[0] = "Tom";
		  emp[1] =  30;
		  emp[2] =  22.33;
		  emp[3] =  true;
		  emp[4] =  'm';
	//	  emp[5] = "24-03-1992";  // array index out of bound exception
		  for(Object e :emp) {
			  System.out.println(e);
		  }
		  for(int n=0; n<emp.length;n++) {
			  System.out.println(emp[n]);
			  // object is a non primitive data type, its a class , which can hold any type of data.
		  }
		  
	// use of array
		  // calender , menu items , country dropdown
	}

}
