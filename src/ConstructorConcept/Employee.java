package ConstructorConcept;

public class Employee {
	int id;
	String name;
	double salary;
	//boolean isActive;
	//char gender;

	public Employee(int id, String name, double salary) {
		//System.out.println(name);
		this.id=id;
		this.name = name;
		this.salary = salary;
		//System.out.println();
	
	}
	
	
	public void getId() {
		System.out.println("Id is: "+this.id);
		return ;
	}

	public void getName() {
		System.out.println("Name is: "+this.name);
		return ;
	}


		public void getSalary() {
			System.out.println("Salary is: "+this.salary);
		return ;
	}


	public void setSalary(double salary) {
		this.salary = salary;
		System.out.println("Updated salary is:"+ this.salary);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(15, "Mok", 13.55);
		//System.out.println(e1.id+ " " +e1.name+ " "+e1.salary);
		e1.getId();
		e1.getName();
		e1.getSalary();
		e1.setSalary(e1.salary+(e1.salary*10/100));
		
	}

}
