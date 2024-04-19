package javasessions;

public class Car {
	String name;
	String licensenumber;
	double price;
	String color;
	static final int wheels=4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.name="BMW";
		c1.licensenumber="346";
		c1.price=80.11;
		c1.color="Red";
		
		
		Car c2=new Car();
		c2.name="Audi";
		c2.licensenumber="2468";
		c2.price=25.56;
		c2.color="Black";
		
		Car c3=new Car();
		c3.name="Honda";
		c3.licensenumber="4677";
		c3.price=40.36;
		c3.color="White";
		
		System.out.println(c1.name+" "+c1.licensenumber+" "+c1.price+" "+c1.color+" "+Car.wheels);
		//BMW 346 80.11 Red 4
		System.out.println(c2.name+" "+c2.licensenumber+" "+c2.price+" "+c2.color+" "+Car.wheels);
		//Audi 2468 25.56 Black 4
		System.out.println(c3.name+" "+c3.licensenumber+" "+c3.price+" "+c3.color+" "+Car.wheels);
		//Honda 4677 40.36 White 4



	}

}
