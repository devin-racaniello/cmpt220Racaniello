
public class ElevenPointThreeTest {

	public static void main(String[] args) {
		
		Account account = new Account(0, 1000);
		SavingsAccount savings = new SavingsAccount(1, 1000);
		CheckingAccount checking = new CheckingAccount(2, 1000, -20);

		account.setAnnualInterestRate(4.5);

		account.withdraw(200);
		savings.withdraw(1001);
		checking.withdraw(1001);


		account.deposit(300);
		savings.deposit(300);
		checking.deposit(300);


		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());

	}

}
