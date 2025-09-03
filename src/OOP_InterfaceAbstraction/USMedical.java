package OOP_InterfaceAbstraction;

public interface USMedical extends WHO{
	
	//interface vars are static and final in nature (by default):
	int min_fee = 100;
	
	//in interface we can not define the method body
	//no method body, no method implementation
	//only method declaration - only method prototype
	//Abstract method - no method body
	//can not create the object of Interface
	//can not create the const.. of Interface

	
	//100% abstraction: hiding the implementation
	public void physioServices();
	
	public void oncologyServices();

	public void dentalServices();

	public void emergencyServices();
	
	public int payment(int amount);

	
	//from jdk 1.8, there are two major changes in interface:
	
	//1. we can have a method with body: but it should be static method
	public static void medicalBilling() {
		System.out.println("USM -- medical billing");
	}
	
	
	//2. we can have a default method with method body:(non static): it can be overriden also with public method
	default void medicalNews() {
		System.out.println("USM -- medical news");
	}
	
	

}
