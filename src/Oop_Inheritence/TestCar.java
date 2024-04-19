package Oop_Inheritence;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b=new BMW();
		b.autoParkin();//Indivdual
		b.start();//overridden
		b.stop();//Inherited
		b.refuel();//Inherited
		b.engine();//Inherited
		b.billing();//overridden
		
		System.out.println("----------");
		
		Car c=new Car();
		c.start();//Indivdual
		c.stop();//Indivdual
		c.refuel();//Indivdual
		c.engine();//Inherited
		c.billing();//overridden
		
		System.out.println("----------");
		Audi au=new Audi();
		au.theftSafety();//Indivdual
		au.start();//Inherited
		au.stop();//Inherited
		au.refuel();//Inherited
		au.engine();//overridden
		
		System.out.println("----------");
		Vehicle v=new Vehicle();
		v.billing();//Indivdual
		v.engine();//Indivdual
		System.out.println("----------");
		Truck t=new Truck();
		t.engine();//Inherited
		t.heavyLoading();//Indivdual
		
		System.out.println("-------------");
		Honda h=new Honda();
		h.start();
		h.stop();
		h.fuelEff();
		h.refuel();
		//Top casting
		
		Car c1=new Honda();
		c1.billing();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		//down castting
		
		//Honda h1=new Car();//Type mismatch error
		Honda h1=(Honda)new Car();//run time cxception classcast except
		
		

	}

}
