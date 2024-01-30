package ct07;

public class BankAccount {
	
	private int accountNumber;
	private String accountHolder;
	private int balance;
	
	public BankAccount(int accountNumber,String accountHolder,int balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		
		}
	public int getAccountNumber() { 
		return accountNumber; 
		}
    public void setAccountNumber(int accountNumber) { 
    	this.accountNumber = accountNumber; 
    	}
    public String getAccountHolder() { 
    	return accountHolder;
    	}
    public void setAccountHolder(String accountHolder) { 
    	this.accountHolder = accountHolder; 
    	}
    public int getBalance() {
    	return balance; 
    	}
    public void setBalance(int balance) {
    	this.balance = balance;
    }
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("残高不足です。");
        }
    }

}
