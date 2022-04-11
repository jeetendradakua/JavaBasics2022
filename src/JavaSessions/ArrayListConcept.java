package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		//ArrayList -- default class i Java
		//dynamic array
		
		// order based /index based 
		
		ArrayList ar = new ArrayList();
		
		System.out.println(ar.size());
		
		
		 ar.add(100); //0th position
		 ar.add(200); //1st pos.
		 
		 System.out.println(ar.size());
		 
		 ar.add(300);
		 ar.add(400);
		 
		 System.out.println(ar.size());
		 
		 ar.add(12.33);
		 ar.add('h');
		 ar.add(true);
		 ar.add("testing");
		 
		 System.out.println(ar.size());
		 System.out.println(ar.get(1));
		 
		 //lowest index = 0
		 //length =  r.size()--> physical capacity = 8
		 //highest index = length -1 ==> 7
		 
		// System.out.println(ar.get(8)); // iob
		 
		 // to get all the values in array list
		 
		 // for loop
		 for(int i = 0; i<ar.size(); i++) {
			 System.out.println(ar.get(i));
		 }
		 
		 System.out.println("*************");
        
		 // for each
		 for (Object e : ar) {
			 System.out.println(e);}

		 
		 ArrayList ar1 = new ArrayList(5);
		 
		 System.out.println(ar1.size());
		 
		 //Generics :
		 
		 ArrayList <Integer> marksList = new ArrayList<Integer> ();
		 
		 marksList.add(100);
		 marksList.add(500);
		 marksList.add(400);
		// marksList.add("Hello"); // wrong data type
		 
		 ArrayList<Object> empData = new ArrayList <Object> ();
		 
		 empData.add("Tom");
		 empData.add(25);
		 empData.add(24-03-1992);
		 empData.add('m');
		 empData.add(12.33);
		 empData.add(true);
		 
		 //Array List is a default class already available in java
		 // non primitive in nature
		 // also part of collection
		 // dynamic in nature
		 
		 ArrayList<String> nameList = new ArrayList <String>();
		 nameList.add("Tom");
		 nameList.add("jeetu");
		 nameList.add("naveen");
		 
		 System.out.println(nameList.size());
		 
		 //
		 
		 ArrayList <Integer> numbers = new ArrayList <Integer>();
		
		 numbers.add(100); //0
		 numbers.add(200); //1
		 numbers.add(300); //2
		 numbers.add(400); //3
		 
		/* System.out.println(numbers.get(2));
		 System.out.println(numbers.size());
		 
		 numbers.remove(2);
		 System.out.println(numbers.get(2));
		 System.out.println(numbers.size());
		 */
		 System.out.println(numbers.get(3));
		 numbers.add(3,500); 
		 System.out.println(numbers.get(3));
		 
		 int i[] = new int [4];
		 i[2]=10;
		 System.out.println(i[2]);
		 System.out.println(i[0]);
		 
		 int j [] = {1,2,3,4,5,6}; //static array literals
		 System.out.println(j.length);
		 j[0] = 200;
		 System.out.println(j[0]);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
