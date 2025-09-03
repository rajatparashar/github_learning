package Functions;

public class Employee {
	
	//class members:
	//1. variables: static and non-static(instance/Object))
	//2. methods/functions: static and non-static
	
	//methods:
	//1. can not create a function/method inside a function
	//2. function name can not be duplicate but it can be duplicate method overloading
	
	
	//types
	//1. no input and no return 
	//void: function has no return
	public void test() {
		System.out.println("test method");
	}
	
	//2. no input but some return:
	//return type: int
	public int add() {
		System.out.println("add method");
		int a = 10;
		int b = 20;
		int c = a+b;//30
		return c;//30
	}
	
	//return type: String
	public String getTrainer() {
		System.out.println("getting the trainer name");
		String name = "naveen";
		return name;
	}
	
	//return type: boolean
	public boolean isUserActive() {
		System.out.println("check user is active");
		return false;
	}
	
	
	//3. some input and return:
	public int sum(int a, int b) {//a,b: input parameters
		System.out.println("sum method");
		int z = a+b;
		return z;
	}	
	
	//return type: String
	//param: 1
	//only one return is allowed at a time
	public String getCourseTrainer(String courseName) { //1 param
		System.out.println("getting trainer name for : " +  courseName);
		
		if(courseName.equals("testing")) {
			return "Naveen";
		}
		else if(courseName.equals("development")) {
			return "Tom";
		}
		else {
			System.out.println("course is not found..." + courseName);
			return null;
		}
	}
	
	
	//execution will start from the main method
	public static void main(String[] args) {

		//create the object of the class:
		Employee e1 = new Employee();
		e1.test();
		
		//System.out.println(e1.add());
		
		int m = e1.add();
		System.out.println(m);//30
		
		String s = e1.getTrainer();
		System.out.println(s);
		
		boolean flag = e1.isUserActive();
		System.out.println(flag);//false
		
		if(flag) {
			System.out.println("give the permission");
		}
		else {
			System.out.println("no permission");
		}
		
		
		
		//
		int d = e1.sum(10, 20);//values/arguments: call by value
		System.out.println(d);//30
		
		//
		String name = e1.getCourseTrainer("cypress");
		System.out.println("trainer name is : "+ name);//null
		if(name == null) {
			System.out.println("no fee is added");
		}
		if(name.equals("Naveen"))
		{
			System.out.println("some fee is added");

		}
	}
	
	
	
	

}
