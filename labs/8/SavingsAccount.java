
public class SavingsAccount extends Account{

	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	
	public void withdraw(double amount) {
		if (getBalance() > amount) {
			setBalance(getBalance() - amount);
		}
	}
	
	
}
