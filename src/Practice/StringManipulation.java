package Practice;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		String s = "this is my java code and i am happy";
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		
		// System.out.println(s.charAt(-1));  //STRING AIOB EXCEPTION 
		
		System.out.println(s.indexOf("t"));
		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("i"));
		System.out.println(s.indexOf("i", 3));
		System.out.println(s.indexOf('i',s.indexOf('i')+1));
		//System.out.println(s.indexOf('i',s.indexOf('i')+1));
		
		System.out.println(s.indexOf("python")); //-1
		
		String message = "welcome admin";
		if(message.indexOf("admin")>0) {
			System.out.println("correct message");
		}
		
		// trim :
		
		String s1 = "    hello selenium      ";
		System.out.println(s1.trim());
	
		// replace :
		String s2 = "hello testing"; //hellotesting
		System.out.println(s2.replace(" ", ""));
		
		String s3 = "    hello selenium      ";
		System.out.println(s3.trim().replace(" ", ""));
		System.out.println(s3.replace(" ",""));
		
		
		String str = "this is selenium code";
		System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());		
		
		//equals:
        String t1 = "hello google";
        String t2 = "hello Google ";
        String t3 = "hello google";
        System.out.println(t1.equals(t2));
        System.out.println(t1.equalsIgnoreCase(t2));
        System.out.println(t1==t3);
        
        //contains():
        
        String m = "welcome to testing";
        System.out.println(m.contains("welcome"));
        
        if(m.contains("welcome")){
        	System.out.println("this is correct");
        }else {
        	System.out.println("incorrect");
        }
        
        //substring:
        
        String p = "this is my testing code";
        System.out.println(p.substring(3));
        System.out.println(p.substring(3, 10));
        
        String m1 = "your order id is 12345";
        System.out.println(m1.substring(m1.indexOf("is")+3,m1.length()));
        
        // split :
        String test =  "Java_Python_Ruby_JavaScript";
        String t[]=test.split("_");
        System.out.println(t.length);
        
        System.out.println(t[0]);
    //    System.out.println(t[4]); //AIOB
        
        for(String e : t) {
        	System.out.println(e);
        }
        
        
        //
        System.out.println("*****************************");
       
        String pop = "xXJavaxXXPythonXxXTestingXXxXSelenium";
        String top[]=pop.split("xX");
        
        System.out.println(top[0]);
        System.out.println(top[1]);
        System.out.println(top[2]);
        System.out.println(top[3]);
        
        System.out.println(top[4]);
        
        // 
        String empData = "tom;peter;30;LA;USA;9099";
        String emp[] = empData.split(";");
        
        for(String e : emp) {
        	System.out.println(e);
        }
		
        String pl ="hello testing java";
     /*   System.out.println(pl.split(" ")[0]);
        System.out.println(pl.split(" ")[1]);
        System.out.println(pl.split(" ")[2]);
        */
        
        System.out.println(pl.split(" ")); //memory address 
        System.out.println(Arrays.toString(pl.split(" ")));
	}

}
