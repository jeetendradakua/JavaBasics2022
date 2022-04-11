package ConstructorConcept;

public class TestCar {

	public static void main(String[] args) {

		
		
		Car c = new Car("MBW",100000);
		System.out.println(c.name+" " + c.color+" " + c.price);
		
		
		Car c1 = new Car("Audi",250000,"White");
		System.out.println(c1.name+" "+ c1.price +  c1.color+" " );
		
		
		
		
		
	}

}
