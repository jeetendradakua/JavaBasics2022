package OOP_Interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndiaMedical {

	@Override
	public void physioServices() {

		System.out.println("physio");

	}

	@Override
	public void cardioServices() {
		System.out.println("cardio");
	}

	@Override
	public void entServices() {
		System.out.println("Ent");
	}

	@Override
	public void dentalServices() {

		System.out.println("dental");
	}

	@Override
	public void neuroServices() {
		System.out.println("neuro");
	}

	@Override
	public void oncologyServices() {

		System.out.println("oncology");
	}

	@Override
	public void pediaServices() {

		System.out.println("pedia");
	}

	@Override
	public void emergencyServices() {

		System.out.println("emergency");
	}

	//fh:

	public void medicalInsurance() {

		System.out.println("fh--insurance");
	}

	public void optServices() {

		System.out.println("fh--opt");
	}

	// METHOD HIDING
	public static void billing() {

		System.out.println("FH--billing");
	}

	@Override   //default method can be override in interface concept only
	public void medicalTraining() {
		System.out.println("FH--medical training");
	}

	@Override
	public int getPatientNumber(String name) {

		if (name.equals("Jeetu")) {
			return 100;
		} else if (name.equals("Tom")) {
			return 200;
		} else {
			return -1;
		}
	}
		
		
		
		
		
	

	@Override
	public void covid19Vaccination() {
		System.out.println("vacc..");
	}

	@Override
	public void covid19Research() {
		System.out.println("FH--Research");
	}

}
