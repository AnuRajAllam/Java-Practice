package javasessions;

public class MethodsAssign {
	
	//1. addition/subtraction/division/multiplication of two numbers entered by user by defining your own method
	
	public void addition(int i, int j) {
		int res=i+j;
		System.out.println("The addition of two numbers is: " + res);
		//return i+j;
	}
	
	public void subtraction(int i, int j) {
		int res=i-j;
		System.out.println("The subtraction of two numbrs "+i+" and "+j+" is: "+res);
		//return i-j;
	}
	
	public void multiplucation(int i, int j) {
		int res=i*j;
		System.out.println("The multiplication of two numbers is: "+ res);
		//return i*j;
	}

	public void division(int i,int j) {
		int res=i/j;
		System.out.println("The division of two numbers is:"+ res);
		//return i/j;
	}
	
	//2.method that returns the product of two double numbers entered by user.
	
	public double product(double i, double j) {
		double res=i*j;
		return res;
		
	}
	
	//3.print the circumference and area of a circle of radius entered by user by defining your own method. 
	public void areaOfCircle(double radius) {
		//
		//double pi=Math.PI;
		double area=Math.PI*Math.pow(radius, 2);
		System.out.println("Area of circle is : "+area);
		//System.out.println(Math.pow(8, 2));
		
	}
	
	public void circumferenceOfCircle(double radius) {
		double circumference=2*Math.PI*radius;
		System.out.println("Circumfernce of circle is: "+circumference);
	}
	
	//4.two methods to print the maximum and the minimum number respectively among three numbers entered by user.
	
	public void maxNumber(int p, int q, int r) {
		
		if(p>q && p>r) {
			System.out.println(p+ " is the maximum number");
		}
		else if(q>r) {
			System.out.println(q+ " is the maximum number");
		}
		else {
			System.out.println(r+" is the maximum number");
		}
			
		
	}
	
	//5.whether a given number is even or odd - return true/false.
	
	public boolean isEven(int i) {
		boolean flag=false;
		if(i%2==0) {
			flag=true;
			System.out.println(i + " is evenn num");
		}
		else {
			System.out.println(i + " is odd num");
		}
		
		return flag;
	}
	
	public void minNumber(int p, int q, int r) {
		if(p<q && p<r) {
			System.out.println(p+" is the minimum number");
		}
		else if(q<r) {
			System.out.println(q+ " is the minimum number");
		}
		else {
			System.out.println(r+ " is the minimum number");
		}
	}
	
	//6. method to find out if he/she is eligible to﻿ vote. - return true/false
	
	public boolean voteEligibility(int age) {
		boolean flag=false;
		if(age>18) {
			System.out.println("Eligible for voting");
			flag =true;
		}
		else {
			System.out.println("Not eligible for voting");
		}
		return flag;
	}
	
	//7.enter his/her marks (out of 100). display grades according to the marks entered 
	
	public void getGrades(int marks) {
		if(marks>90 && marks<=100) {
			System.out.println("Grade is AA");
		}
		else if(marks>80 && marks<=90) {
			System.out.println("Grade is AB");
		}
		else if(marks>70 && marks<=80) {
			System.out.println("Grade is BB");
		}
		else if(marks>60 && marks<=70) {
			System.out.println("Grade is BC");
			
		}
		else if(marks>50 && marks<=60) {
			System.out.println("Grade is CD");
		}
		else if(marks>40 && marks<=50) {
			System.out.println("Grade is DD");
		}
		else if(marks<=40) {
			System.out.println("Failed");
		}
		else {
			System.out.println("enter correct age");
		}
	}
	//8.factorial of a number 
	public void getFactorial(int num) {
		int fac=1;
		for(int i=1;i<=num;i++) {
			fac=fac*i;
			System.out.println(fac);
		}
		System.out.println("Factorial of "+num+" is: "+fac);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsAssign obj=new MethodsAssign();
		
		obj.addition(20,30);
		obj.division(20,4);
		obj.subtraction(10,5);
		obj.multiplucation(2,4);
		double productRes= obj.product(12.33, 14.22);
		System.out.println("The Product of two double numbers is: "+ productRes);
		obj.areaOfCircle(4);
		obj.circumferenceOfCircle(4);
		obj.maxNumber(40,20,80);
		obj.minNumber(40,20,80);
		obj.isEven(60);
		obj.voteEligibility(90);
		obj.getGrades(41);
		obj.getFactorial(4);

	}

}
