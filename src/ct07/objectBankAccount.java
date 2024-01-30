package ct07;

public class objectBankAccount {
	 public static void main(String[] args) {
	        BankAccount BankAccount = new BankAccount(12345678, "山田太郎", 10000);
	        BankAccount.deposit(5000);
	        BankAccount.withdraw(4000);
	        System.out.println("口座残高: " + BankAccount.getBalance() + "円");
	    }

}
