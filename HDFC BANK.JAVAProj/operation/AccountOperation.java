package operation;

import entity.Account;

public class AccountOperation {
public boolean withdraw(Account account,double amount) {
		double bal=account.getBalance();
		if(amount<=0) {
			System.out.println("Amount can not be -ve");
			return false;
		}else if(bal<amount) {
			System.out.println("Not having enough balance");
			return false;
		}else {
			bal=bal-amount;
			account.setBalance(bal);
			return true;
		}
	}
	public boolean deposit(Account account,double amount) {
			double bal=account.getBalance();
			if(amount<=0) {
				System.out.println("Amount can not be -ve");
				return false;
			
			}else {
				bal=bal+amount;
				account.setBalance(bal);
				return true;
			}
	}
	public boolean transfer(Account account1,Account account2,double amount) {
		if(amount<=0) {
			System.out.println("Amount can not be -ve");
			return false;
		}else if(account1.getBalance()<amount) {
				System.out.println("Insufficient amount");
				return false;
		}
		else
		{
				//transfer from account 1 to account 2
				 double balance1=account1.getBalance();//10000
				account1.setBalance(balance1-amount);//10000-4000
				
				double balance2=account2.getBalance();//20000
				account2.setBalance(balance2+amount);//20000+4000
				System.out.println("Transfer operation is completed...");
				return true;
		}
	}

}
