package MethodCalling;

public class CallByRefConcept {

	public void m1() {
		System.out.println("m1 method");
	}

	public void m2() {
		System.out.println("m2 method");
	}

	public void m3() {
		System.out.println("m3 method");
	}

	public static void t1(CallByRefConcept ob) {
		System.out.println("t1 method");
		//t1(S)-->m1(NS)
		ob.m1();
		
		CallByRefConcept.t2(ob);
	}

	public static void t2(CallByRefConcept naveen) {
		System.out.println("t2 method");
		//t2(s)-->m3(NS)
		naveen.m3();		
	}

	public static void t3() {
		System.out.println("t3 method");
	}
	

	public static void main(String[] args) {
		
		CallByRefConcept obj = new CallByRefConcept();
		obj.m1();
		
		//main-->t1
		CallByRefConcept.t1(obj);//call by reference
		

	}

}
