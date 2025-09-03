package AccMod1;

public class TestComp {

	public static void main(String[] args) {
		Company obj = new Company();//comp -- default const...
		// Company obj1 = new Company(10);
		Company obj2 = new Company("naveen");//comp -- one param const...naveen
		Company obj3 = new Company(12.33);//comp -- one param const...12.33

		ExcelUtil.readExcel();//read excel

		System.out.println("hello world");//hello world

		// log4j api:
		// log.info("hello world");
	}
}