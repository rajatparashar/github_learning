package OOP_InterfaceAbstraction;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {

	final static int min_fee = 200;

	// US:
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");
	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");
	}

	@Override
	public int payment(int amount) {
		return 100;
	}

	// UK
	@Override
	public void orthoServices() {
		System.out.println("FH -- orthoServices");

	}

	@Override
	public void neuroServices() {
		System.out.println("FH -- neuroServices");

	}

	// India
	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");
	}

	@Override
	public void gyncServices() {
		System.out.println("FH -- gyncServices");
	}

	// common
	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");
	}

	// Individual:
	public void medicalTraining() {
		System.out.println("FH -- medical training");
	}

	public void OPTServices() {
		System.out.println("FH -- OPTServices");
	}

	// method hiding
	public static void medicalBilling() {
		System.out.println("FH -- medical billing");
	}

	@Override
	public void medicalNews() {
		System.out.println("FH -- medical news");
	}

	// WHO
	@Override
	public void covidVaccination() {
		System.out.println("FH -- covidVaccination");

	}

}
