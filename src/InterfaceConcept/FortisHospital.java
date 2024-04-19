package InterfaceConcept;

public class FortisHospital extends Hospital implements USMedical,UKMedical,IndianMedical {

	@Override
	public void physioServices() {

		System.out.println("FH-------physioServices");		
	}

	@Override
	public void onocologyServices() {
		System.out.println("FH-------onocologyServices");		
	}

	@Override
	public void pediaServices() {
		System.out.println("FH-------pediaServices");		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH-------cardioServices");		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH-------dentalServices");		
	}

	@Override
	public void ghyncServices() {
		System.out.println("FH-------ghyncServices");		
	}

	@Override
	public void radioServices() {
		System.out.println("FH-------radioServices");		
	}
	
	public void OPTSevices() {
		System.out.println("FH-------OPTSevices");
	}
	
	public void pathologySevices() {
		System.out.println("FH-------pathologySevices");
	}

	@Override
	public void emergencySevices() {
		System.out.println("FH-------emergencySevices");		
	}
    @Override
	public void medicalInsurance() {
		System.out.println("FH--------medicalInsurance");
	}

	@Override
	public void covidVaccine() {
		System.out.println("FH--------covidVaccine");		
	}

}
