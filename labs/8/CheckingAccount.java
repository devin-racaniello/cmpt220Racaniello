
public class CheckingAccount extends Account{

	private double overdraftLimitAmount;
	
	public CheckingAccount() {
		super();
		overdraftLimitAmount = -20;
	}
	
	public CheckingAccount(int id, double balance, double overdraftLimitAmount) {
		super(id, balance);
		this.overdraftLimitAmount = overdraftLimitAmount;
	}
	
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimitAmount = overdraftLimitAmount;
	}
	
	public double getOverdraftLimit() {
		return overdraftLimitAmount;
	}
	
	public void withdraw(double amount) {
		if (overdraftLimitAmount < this.getBalance() - amount) {
			setBalance(getBalance() - amount);
		}
	}
	
	public String toString() {
		return super.toString() + "\nOverdraft limit: " + overdraftLimitAmount;
	}
	
	
	
}
