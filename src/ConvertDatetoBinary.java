public class ConvertDatetoBinary {
	public static void main(String[] args) {
		String date = "2080-02-29";
		System.out.println(convertDateToBinary(date));
	}

	public static String convertDateToBinary(String date) {
		String[] d = date.split("-");
		return Integer.toBinaryString(Integer.parseInt(d[0])) + "-" + Integer.toBinaryString(Integer.parseInt(d[1])) + "-" + Integer.toBinaryString(Integer.parseInt(d[2]));
	}
}