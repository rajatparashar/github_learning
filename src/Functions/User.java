package Functions;

public class User {

	public void printInfo() {
		System.out.println("user info");
		return;
	}

	// function: getUserMarks
	// param: String userName
	// return the user marks (0 to 100): int

	public int getUserMarks(String userName) {

		System.out.println("calculating user marks for: " + userName);
		int marks = -1;

		switch (userName) {
		case "nitin":
			marks = 90;
			break;
		case "anu":
			marks = 95;
			break;
		case "rajat":
			marks = 0;
			break;
		default:
			System.out.println("plz pass the right username...." + userName);
			break;
		}

		return marks;

	}

	public int getstudentMarks(String studentName) {

		System.out.println("calculating student marks for: " + studentName);

		switch (studentName) {
		case "nitin":
			return 90;
		case "anu":
			return 95;
		case "rajat":
			return 100;
		default:
			System.out.println("plz pass the right username...." + studentName);
			return -1;
		}

	}

	public static void main(String[] args) {
		User u1 = new User();
		u1.printInfo();
		int m = u1.getUserMarks("nitin");
		System.out.println(m);

		if (m >= 0) {
			System.out.println("print the marksheet");
		}
		//
		int n = u1.getstudentMarks("naveen");
		System.out.println(n);
		if (n >= 0) {
			System.out.println("print the marksheet");
		}

	}

}
