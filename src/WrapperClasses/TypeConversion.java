package WrapperClasses;

public class TypeConversion {

	public static void main(String[] args) {

		// int -- primitive data type
		// Integer -- class (wrapper class)
		// generics -- Integer

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);

		// 1. String to int:
		String x = "100";
		System.out.println(x + 20);// 10020

		int i = Integer.parseInt(x);// 100
		System.out.println(i + 20);

		String y = "$100";
//		int j = Integer.parseInt(y);//NumberFormatException
		int j = Integer.parseInt(y.replace("$", ""));// NumberFormatException
		System.out.println(j + 50);

		System.out.println("-----------");

		// 2. String to double:
		String price = "12.33";
		System.out.println(price + 10);

		double actPrice = Double.parseDouble(price);// 12.33
		System.out.println(actPrice + 10);// 22.33

		System.out.println("-----------");

		// 3. int to String:
		int p = 100;
		String value = String.valueOf(p); // "100"
		System.out.println(value + 20);// 10020

		double q = 12.33;
		String qVal = String.valueOf(q);// "12.33"
		System.out.println(qVal.length());

		boolean flag = true;
		String fg = String.valueOf(flag);// "true"
		System.out.println(fg + "automation");

		// 4. String to boolean:
		String remote = "true";
		boolean rm = Boolean.parseBoolean(remote);// false
		System.out.println(rm);// false
		if (rm) {
			System.out.println("run tcs on aws cloud");
		} else {
			System.out.println("run tcs in local");
		}

	}

}
