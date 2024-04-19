package javasessions;

public class Users {
	
	
	String name;
	int age;
	double salary;
	String city;

	public static void main(String[] args) {
		
		Users u1=new Users();
		u1.name="Tanya";
		u1.age=25;
		u1.salary=12.3;
		u1.city="Bangalore";
		System.out.println(u1.name + " " + u1.age + " " + u1.salary + " " + u1.city);//Output: Tanya 25 12.3 Bangalore
		
		Users u2=new Users();
		u2.name="Vijay";
		u2.age=28;
		u2.salary=18.9;
		u2.city="Delhi";
		System.out.println(u2.name + " " + u2.age + " " + u2.salary + " " + u2.city);//Output: Vijay 28 18.9 Delhi
		 
		Users u3=new Users();
		u3.name="Naveen";
		u3.age=33;
		u3.salary=25.6;
		u3.city="Kolkatta";
		System.out.println(u3.name + " " + u3.age + " " + u3.salary + " " + u3.city);//Output: Naveen 33 25.6 Kolkatta
		
		Users u4=new Users();
		u4.name="Anusha";
		u4.age=30;
		u4.salary=22.3;
		u4.city="Hyderabad";
		System.out.println(u4.name + " " + u4.age + " " + u4.salary + " " + u4.city);//Output: Anusha 30 22.3 Hyderabad
		
		Users u5=new Users();
		u5.name="Ramya";
		u5.age=35;
		u5.salary=18.4;
		u5.city="Pune";
		System.out.println(u5.name + " " + u5.age + " " + u5.salary + " " + u5.city);//Output: Ramya 35 18.4 Pune
	
		System.out.println("-----------------");
		
		u1=u2;
		System.out.println(u1.name + " " + u1.age + " " + u1.salary + " " + u1.city);
		//Output: Vijay 28 18.9 Delhi	
		u2=u3;
		System.out.println(u2.name + " " + u2.age + " " + u2.salary + " " + u2.city);
		//Output: Naveen 33 25.6 Kolkatta
		u3=u4;
		System.out.println(u3.name + " " + u3.age + " " + u3.salary + " " + u3.city);
		//Output: Anusha 30 22.3 Hyderabad
        u4=u5;
		System.out.println(u4.name + " " + u4.age + " " + u4.salary + " " + u4.city);
		//Output: Ramya 35 18.4 Pune
		u5=u1;
		System.out.println(u5.name + " " + u5.age + " " + u5.salary + " " + u5.city);
		//Output: Vijay 28 18.9 Delhi

	}

}
