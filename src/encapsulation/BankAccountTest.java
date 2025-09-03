package encapsulation;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount();
		ba1.setAccountNumber("12345678900");
		ba1.setBalance(23.78);

		System.out.println("Account Number is " + ba1.getAccountNumber());
		System.out.println("Balance is " + ba1.getBalance());
	}
}