package ConstructorConcept;

public class Car {
	String make;
	String model;
	int year;

	public Car() {
		this.make = "Unknown";
		this.model = "Unknown";

	}

	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		System.out.println(c.make + " " + c.model + " " + c.year);
		
		Car c1 = new Car();
		System.out.println(c1.make + " " + c1.model + " " + c1.year);
		
				
		Car c2 = new Car("abc", "def", 2000);
		System.out.println(c2.make + " " + c2.model + " " + c2.year);
		
		Car c3 = new Car("klp", "ghi", 1997);
		System.out.println(c3.make + " " + c3.model + " " + c3.year);
	}

}
