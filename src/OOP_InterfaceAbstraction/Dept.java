package OOP_InterfaceAbstraction;

public interface Dept {
	

	default void defineSalary() {

	}

	default void allocateBudget() {

	}

	default void accountSummary() {

	}
	
	default void defineCompanyBudget() {
		System.out.println("Comp budget");
	}

}
