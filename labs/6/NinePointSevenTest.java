//Devin Racaniello
public class NinePointSevenTest {

	public static void main(String[] args) {
		Account acc = new Account(1122,20000);
		acc.setAnnualInterestRate(4.5);
		
		acc.withdraw(2500);
		
		acc.deposit(3000);
		
		System.out.println("The balance is "+ acc.getBalance());
		System.out.println("The monthly interest is "+ acc.getMonthlyInterest());
		System.out.println("The date is "+ acc.getDateCreated());

	}

}
