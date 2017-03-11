//Devin Racaniello
import java.util.Date;
// JA: Always add comments to your code
public class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	
	Account() {
		setId(0);
		setBalance(0);
		setAnnualInterestRate(0);
		setDateCreated(new Date());
		
	}
	
	Account(int newId, double newBalance) {
		setId(newId);
		setBalance(newBalance);
		setDateCreated(new Date());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12);
	}
	
	public double getMonthlyInterest() {
		return (balance * getMonthlyInterestRate());
	}
	
	public void withdraw(double money) {
		balance -= money;
	}
	
	public void deposit(double money) {
		balance -= money; // JA balance += money
	}
	
	
}
