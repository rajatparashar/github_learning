package OOP_InterfaceAbstraction;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.physioServices(); // FH -- physioServices
		fh.dentalServices();//FH -- dentalServices
		fh.cardioServices();//FH -- cardioServices
		fh.oncologyServices();//FH -- oncologyServices
		fh.neuroServices();//FH -- neuroServices
		fh.gyncServices();//FH -- gyncServices
		fh.emergencyServices();//FH -- emergencyServices
		USMedical.medicalBilling();//USM -- medical billing
		FortisHospital.medicalBilling();//FH -- medical billing
		fh.medicalNews();//FH -- medical news
		fh.medicalRND();//Medical -- R&D
		fh.covidVaccination();//FH -- covidVaccination
		
		System.out.println(USMedical.min_fee);//100
		System.out.println(FortisHospital.min_fee);//200	
		
		
		System.out.println("----------");

		// top casting: child class object can be referred by parent interface ref
		// variable
		USMedical us = new FortisHospital();
		us.physioServices(); //FH -- physioServices
		us.dentalServices(); //"FH -- dentalServices
		us.oncologyServices();//FH -- oncologyServices
		us.emergencyServices();//FH -- emergencyServices


		UKMedical uk = new FortisHospital();
		uk.orthoServices();//FH -- orthoServices
		uk.neuroServices();//FH -- neuroServices
		uk.emergencyServices();//FH -- emergencyServices

		IndianMedical in = new FortisHospital();
		in.cardioServices();//FH -- cardioServices
		in.gyncServices();//FH -- gyncServices
		in.emergencyServices();//FH -- emergencyServices

		// down casting: NA
		
		

	}

}
