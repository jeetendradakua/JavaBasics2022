package ConstructorConcept;

public class Car {
     
	String name;
	int price;
	String color;
	String model;
	static final int wheels = 4;
	
   
	
	public Car(String name, int price, String color, String model) {
		
		this.name = name;
		this.price = price;
		this.color = color;
		this.model = model;
	}
	public Car(String name, int price, String color) {
		
		this.name = name;
		this.price = price;
		this.color = color;
	
	}
	public Car(String name, int price) {
		
		this.name = name;
		this.price = price;
	}
	public Car(String name,String model, int price) {
		
		this.name = name;
		this.price = price;
		this.model = model;
	}
	
}
	
	
	


	

