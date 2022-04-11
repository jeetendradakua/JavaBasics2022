package SuperKeyword;

public class Company {

int salary = 100;
	



public Company () {
	System.out.println("comp--const..");
}
public Company (int a) {
	System.out.println("comp--const.."+a);
}
	public void cafe () {
		System.out.println("comp--cafe");
		System.out.println(salary);
}
	public final static void logo() {
		System.out.println("comp--logo");
	}
}