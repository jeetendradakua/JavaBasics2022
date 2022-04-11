package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();		
		
		fh.entServices();
		fh.cardioServices();
		fh.neuroServices();
		fh.emergencyServices();
		fh.oncologyServices();
		fh.dentalServices();
		System.out.println(USMedical.min_fee);
		fh.billing();
	
		FortisHospital.billing();
		USMedical.billing();
		fh.covid19Vaccination();
		fh.medicalTraining();
		System.out.println("***********");
		int num = fh.getPatientNumber("Jeetu");
		System.out.println(num);
		fh.medicalEquipment();
        fh.medicalStudy();		
		//top casting :
		
		// child class object can be referred by parent interface ref variable
		
		USMedical us = new FortisHospital();
		
		us.physioServices();
		us.cardioServices();
		us.emergencyServices();
		us.entServices();
		
		//down casting : NA
		//FortisHospital fh1 = new USMedical();		
		
	}

}
