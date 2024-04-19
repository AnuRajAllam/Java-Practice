package Oop_Encapsulation;

public class Person {
	private String name;
	private int age;
	private String gender;
	

	public void  getName() {
		System.out.println(this.name);
		return ;
	}


	public void setName(String name) {
		this.name = name;
		System.out.println("Updated name is: "+this.name);
	}


	public void getAge() {
		System.out.println(this.age);
		return ;
	}


	public void setAge(int age) {
		this.age = age;
		System.out.println("Updated age is: "+this.age);
	}


	public void getGender() {
		System.out.println(this.gender);
		return ;
	}


	public void setGender(String gender) {
		this.gender = gender;
		System.out.println("Updted gender is: "+this.gender);
	}

	public void getInfo() {
		//this.name=getName();
		//this.age=getAge();
		//this.gender=getGender();
		System.out.println("name is "+this.name+" age is "+this.age+" gender is "+this.gender);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method
		Person p=new Person();
	//	p.getInfo();
		
		p.setName("Raju");
		p.setAge(35);
		p.setGender("Male");
		System.out.println(p.name+" "+p.age+" "+p.gender);
		p.getInfo();
		p.getGender();
	}

}
