package OOP_Encapsulation;

public class TestEmp {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.name = "Peter";
		e1.age = 20;
		
		e1.setSalary(12.32);
		
		double sal = e1.getSalary();
		System.out.println(sal+100);
		
		LoginPage lp1=new LoginPage();
		
		//POST
		lp1.setUsername("jeeten.@hmail.com");
		lp1.setPassword("pwd1");
		
		//GET
		lp1.doLogin(lp1.getUsername(),lp1.getPassword());
	
	    //PUT
		
		lp1.setPassword("pwd2");
		lp1.doLogin(lp1.getUsername(),lp1.getPassword());
		
	LoginPage lp2 = new LoginPage();
	lp2.setUsername("admin");
	lp2.setPassword("admin");
	
	lp2.doLogin(lp2.getUsername(), lp2.getPassword());
	}

}
