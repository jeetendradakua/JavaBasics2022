package JavaSessions;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		String s = "hello this is my java code";
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(0));
		
		System.out.println(s.charAt(19));
		
	//	System.out.println(s.charAt(-1)); // String IOB
	//	System.out.println(s.charAt(20)); // String IOB
		
		System.out.println(s.indexOf("t"));
		
		System.out.println(s.indexOf("java"));
		
		System.out.println(s.indexOf('i'));
		
		System.out.println(s.indexOf('i',s.indexOf('i')+1));
		
		System.out.println(s.indexOf("python"));  //-1
		
		String mesg = "welcome admin";
		if(mesg.indexOf("admin")>0) {
			System.out.println("correct msg");
		}
		
		// trim:
		String s1= "         hello selenium       ";
		System.out.println(s1.trim());
		
		//replace:
		
		String s2 = "hello testing";
		System.out.println(s2.replace(" ", ""));
		
		String s3 = "    hello selenium   ";
		//System.out.println(s3.trim().replace(" ", ""));
		System.out.println(s3.replace(" ", ""));
		
		String str = "this is selenium code";
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//equals:
		
		String t1 = "hello google";
	//	String t2 = "hello google"; 
		String t2 = "hello Google "; 
		String t3 = "hello google"; 
		
		System.out.println(t1.equals(t2));
		System.out.println(t1.equalsIgnoreCase(t2));
		System.out.println(t1=t3);
		
		// contains();
		String m = "welcome to testing";
		System.out.println(m.contains("welcome"));
		
		if(m.contains("welcome")) {
			System.out.println("this is correct");
		}
		
		// substring:
		
		String p = "this is my testing code";
		System.out.println(p.substring(3));
		
		System.out.println(p.substring(3, 12));
		
		
		String m1 = "your order id is 12345";
		System.out.println(m1.substring(m1.indexOf("is")+3,m1.length()));
		
		
		// String is a class
		
		String st = new String("hello"); //new keywords , object created inside heap
		String st1 = "hello"; //literals
		System.out.println(st==st1); //false
		System.out.println(st.equals(st1));
		
		//split :  always return a split array
		
		String test = "Java_Python_Ruby_JavaScript";
		String t [] = test.split("_"); 
		System.out.println(t.length);
		
		System.out.println(t[0]);
		
		System.out.println(t[1]);
		
	//	System.out.println(t[4]);  //aiob
		
	//	System.out.println(t[-1]); //aiob
		
		for(String e:t) {
		System.out.println(e);
		
		}
		
		String pop = "xXJavaxXXPythonXxXTestingXXxXSelenium" ;
		String top[] = pop.split("xX");
		
		System.out.println(top[0]);
		
		System.out.println(top[1]);
		
		System.out.println(top[2]);
		
		System.out.println(top[3]);
		
		System.out.println(top[4]);
		
		//
		String empData = "tom;peter;30;LA;USA;909090";
		String emp[] = empData.split(";");
		
	
		
		for(String e:emp) {
			System.out.println(e);
		}
	
		//System.out.println(Arrays.toString (emp.split(" ")));
		
		
		
		
		String pl = "hello testing java";
		
		System.out.println(pl.split(" ")[0]);
		
		System.out.println(pl.split(" ")[1]);
		
		System.out.println(pl.split(" ")[2]);
		
		System.out.println(pl.split(" "));
		
		System.out.println(Arrays.toString(pl.split(" ")));
	
	
                String mh = "this is my phone";
				System.out.println(mh.indexOf('i'));
				System.out.println(mh.indexOf('i', mh.indexOf('i') + 1));
				int pos = mh.indexOf('i', (mh.indexOf('i', mh.indexOf('i') + 1))) + 1;

				System.out.println(pos);
	
	
	
	
	
	
	}
	
	
	

}
