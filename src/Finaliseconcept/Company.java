package Finaliseconcept;

public class Company {

	String name;

	public static void main(String[] args) {
		Company c = new Company();
		c = null;
		Employee e = new Employee();
		e = null;
		// c.name ="ibm";
		System.gc();
	}

	@Override
	public void finalize() {
		System.out.println("comp--finalize");
	}

}
