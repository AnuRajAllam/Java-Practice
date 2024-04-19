package ConstructorConcept;

//import org.w3c.dom.css.Rect;

public class Rectangle {
	double length;
	double width;
	
	public Rectangle() {
		System.out.println("Default constructor");
	}
	
	public Rectangle(double length, double width) {
		System.out.println("Param Constructor");
		this.length=length;
		this.width=width;
	}
	
	public double calculateArea(double length, double width) {
		double res=0.0;
		res=length*width;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle obj=new Rectangle();
		System.out.println("Length is: "+obj.length+" "+"width is: "+obj.width);
		double area1=obj.calculateArea(obj.length, obj.width);
		System.out.println("Area of rectangle is: "+area1);
		
		Rectangle obj1=new Rectangle(2.2,3.3);
		System.out.println("length is: "+obj1.length+ " "+"width is: "+ obj1.width);
		double area2=obj.calculateArea(obj1.length, obj1.width);
		System.out.println("Area of rectangle is: "+area2);
		

	}

}
