package InheritenceAssignment;

public class TestHospital {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hospital h=new Hospital();
		h.bill();
		h.bloodTest();
		h.xray();
		h.generalTreatment();
		System.out.println("-----------------");
		
		Apollo a=new Apollo();
		a.bill();//override
		a.bloodTest();//inheried
		a.cardiologyTreatment();//individual
		a.generalTreatment();//override
		a.xray();//inheried
		System.out.println("-----------------");
		
		Fortis f=new Fortis();
		f.bill();//override
		f.bloodTest();//inheried
		f.xray();//inheried
		f.generalTreatment();//override
		f.nurologyTreatment();//individual
		System.out.println("-----------------");
		
		Max m=new Max();
		m.bill();//override
		m.bloodTest();//inheried
		m.generalTreatment();//override
		m.xray();//inhrited
		m.ghynicTreatment();//individual
		System.out.println("-----------------");
		
		Hospital h1=new Max();
		h1.bill();//override
		h1.bloodTest();//individual
		h1.xray();//individual
		h1.generalTreatment();//override
		System.out.println("-----------------");
		
		//Fortis f1=new Hospital();//compile time error type mismatch cannot convert from hosp to fortis
	//	Fortis f1=(Fortis)new Hospital();//class cast exception
		B bObj=new B(10);
		B.C();
		
		
		
		

	}

}
