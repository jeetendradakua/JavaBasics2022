package ConstructorConcept;

import java.util.ArrayList;

public class User {

	String  name;
	int age;
	ArrayList<String> deviceList;
	String orders[];
	
	
	public User(String name, int age, ArrayList<String> deviceList, String[] orders) {
		super();
		this.name = name;
		this.age = age;
		this.deviceList = deviceList;
		this.orders = orders;
	}


	public User(String name, int age, ArrayList<String> deviceList) {
	
		this.name = name;
		this.age = age;
		this.deviceList = deviceList;
	}
	
}