package javasessions;

public class Customers {
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customers c1=new Customers();
		c1.name="Anusha";
		c1.age=30;
		c1.city="Hyd";
		System.out.println();
		
		Customers c2=new Customers();
		c2.name="Moksa";
		c2.age=10;
		c2.city="Gun";
		
		Customers c3=new Customers();
		c3.name="Arnika";
		c3.age=5;
		c3.city="Vij";
		
		System.out.println(c1.name+" "+c1.age+" "+c1.city);//Anusha 30 Hyd
		System.out.println(c2.name+" "+c2.age+" "+c2.city);//Moksa 10 Gun
		System.out.println(c3.name+" "+c3.age+" "+c3.city);//Arnika 5 Vij
		
		c1=c2;
		System.out.println(c1.name+" "+c1.age+" "+c1.city);////Moksa 10 Gun
		
		c2=c3;
		System.out.println(c2.name+" "+c2.age+" "+c2.city);//Arnika 5 Vij
		
		c3=c1;
		System.out.println(c3.name+" "+c3.age+" "+c3.city);//Moksa 10 Gun
		
		//no reference objects
		new Customers().age=30;
		new Customers().city="Hyf";
		
		//null refrene objects;
		Customers c4=new Customers();
		c4=null;
	//	c4.name="anu";//Null pointer exception
		c4=new Customers();
		c4.name="Tom";
		System.out.println(c4.name);
				
	}

}
