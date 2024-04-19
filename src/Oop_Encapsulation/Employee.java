package Oop_Encapsulation;

public class Employee {
	private String nam;
	private int age;
	private double salary;
	
	
	
	public Employee(String nam, int age, double salary) {
	
		this.nam = nam;
		this.age = age;
		this.salary = salary;
	}
	public String getNam() {
		return nam;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	public void setNam(String nam) {
		this.nam = nam;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
