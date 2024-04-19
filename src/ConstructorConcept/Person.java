package ConstructorConcept;

public class Person {
	
	String name;
	int age;
	char gender;
	double height;
	
	
	public Person(String name, int age, char gender, double height) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.height=height;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1=new Person("Anu", 30, 'f', 5.2);
		System.out.println(p1.name+" "+p1.age+" "+p1.gender+" "+p1.height);
		
		Person p2=new Person("Raju", 35, 'm', 5.8);
		System.out.println(p2.name+" "+p2.age+" "+p2.gender+" "+p2.height);
		
	}

}
