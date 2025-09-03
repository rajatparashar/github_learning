package OOP_InterfaceAbstraction;

public class HR implements Dept{
	
	@Override
	public void defineSalary() {
		System.out.println("salary : 100 USD");
	}

	@Override
	public void allocateBudget() {
		System.out.println("allocateBudget : 10000 USD");

	}

	@Override
	public void accountSummary() {
		System.out.println("accountSummary : HR summary");

	}

}
