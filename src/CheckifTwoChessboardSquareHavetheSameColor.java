public class CheckifTwoChessboardSquareHavetheSameColor {

	public static void main(String[] args) {
		String coordinate1 = "c2", coordinate2 = "g4";
		System.out.println(checkTwoChessboards(coordinate1, coordinate2));
	}

	public static boolean checkTwoChessboards(String coordinate1, String coordinate2) {
		int n1 = Integer.parseInt(coordinate1.charAt(1) + "") + (int) (coordinate1.charAt(0) - 96);
		int n2 = Integer.parseInt(coordinate2.charAt(1) + "") + (int) (coordinate2.charAt(0) - 96);
		if (n1 % 2 == n2 % 2)
			return true;
		else
			return false;
	}
}