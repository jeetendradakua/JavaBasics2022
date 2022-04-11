package JavaSessions;

public class SCP {  //String constant pool

	public static void main(String[] args) {
	 
		//String literals
		
		String s1 = "java";           
		String s2 = "java";
		String s3 = "java";
		
		System.out.println(s1==s2);
		s1="python";
		System.out.println(s1==s2);
		
		String s4 = new String ("Hello");
		String s5 = "Hello";
		
		System.out.println(s4==s5);
		
		String s6 = new String ("Hello");
		
		System.out.println(s4==s6); //false
		
		
		String str = "Hello world";
		
		str = str +"Java";
		
		System.out.println(str);
		
		int i = 10;
		i=i+20;
		System.out.println(i);
		
		
		//immutability : strings are the commonly used data types so only for string is immmutable.
		
		// scp is a part of heap
		
		
		
		
		
		
		
	}

}
