package InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh=new FortisHospital();
		fh.cardioServices();
		fh.pathologySevices();
		fh.dentalServices();
		fh.physioServices();
		fh.OPTSevices();
		fh.emergencySevices();
		USMedical.billing();
		System.out.println("-------------");
		
		USMedical us=new FortisHospital() ;
		us.physioServices();
		us.onocologyServices();
		us.pediaServices();
		us.emergencySevices();
		System.out.println("-------------");
		
		UKMedical uk=new FortisHospital() ;
		uk.cardioServices();
		uk.dentalServices();
		us.emergencySevices();
		System.out.println("-------------");
		System.out.println(USMedical.min_fee);	
			
	}

}
