package AccMod1;

public class Employee extends Department {

	@Override
	public void billing() {
		System.out.println("Employee --billing");
	}

	@Override
	public void releaseFeature() {
		System.out.println("Employee --releaseFeature");
	}

	@Override
	protected void newsLetter() {
		System.out.println("Employee --newsLetter");
	}

	public static void main(String[] args) {

	}

}