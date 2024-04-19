package MultilevelInheritence_assign;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Physics phyObj=new Physics();
		phyObj.frictionOfTyres();
		System.out.println("---------------");
		
		Science sciObj=new Science();
		sciObj.acceleration();//indi
		sciObj.frictionOfTyres();//inhher

		System.out.println("---------------");
		Mechanical mecObj=new Mechanical();
		mecObj.acceleration();//iner from gP
		mecObj.frictionOfTyres();//inher from parent
		mecObj.mechancWorks();//inher
		
		System.out.println("---------------");
		Automobile auObj=new Automobile();
		auObj.acceleration();
		auObj.frictionOfTyres();
		auObj.mechancWorks();
		auObj.motion();
		
		System.out.println("---------------");
		Vehicle vehObj=new Vehicle();
		System.out.println(vehObj.speed);
		vehObj.billing();
		vehObj.engine();
		vehObj.mechancWorks();
		vehObj.motion();
		
		System.out.println("---------------");
		Car cObj=new Car();
		System.out.println(cObj.speed);
		System.out.println(cObj.wheels);
		cObj.refuel();
		cObj.billing();
		cObj.start();
		cObj.stop();
		Car.carDisplay();
//	cObj.show();
		
		System.out.println("---------------");
		BMW bObj=new BMW();
		System.out.println(bObj.wheels);
		System.out.println(bObj.speed);
		bObj.refuel();
		
		System.out.println("---------------");
		Audi audiObj=new Audi();
		System.out.println(Audi.Fuel+100);
		
		audiObj.engine();
		audiObj.theftSafety();
		
		System.out.println("---------------");
		
		Science scObj1=new Car();
		scObj1.acceleration();
		
		
		System.out.println("---------------");
		Vehicle vehObj1=new Honda();
		vehObj1.engine();
		vehObj1.billing();
		vehObj1.mechancWorks();
		System.out.println(vehObj1.speed);
		
		System.out.println("---------------");
		//Audi aObj=new BMW();
		
		Car cOb1=new BMW();
		
		cOb1.refuel();
		
	}

}
