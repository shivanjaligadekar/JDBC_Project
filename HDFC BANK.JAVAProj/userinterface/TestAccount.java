package userinterface;
import entity.Account;
import validation.AccountValidation;
import operation.AccountOperation;
import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		
	    Account account = new Account();
	    Account account2=new Account();
	    
	    AccountValidation accountValidation = new AccountValidation();
	    AccountOperation accountOperation= new AccountOperation();		
	    
	    Scanner sc=new Scanner(System.in);
		int ch;
		String choice;
		
		do {
			System.out.println("....HDFC.... Bank");
			System.out.println("1.Accept details");
			System.out.println("2.Display details");
			System.out.println("3.Withdraw ammoun");
			System.out.println("4.Deposite ammoun");
			System.out.println("5.Transfer ammount");
			System.out.println("6.Exit");
			
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		switch(ch) {
		
		case 1:
			System.out.println("Accepting details");
			System.out.println("Enter the acccNo, accHolderName, balance");
			int accNo=sc.nextInt();
			String accHolderName=sc.next();
			double balance=sc.nextDouble();
			boolean result= accountValidation.checkAll(accNo, accHolderName, balance);
			if(result==true) {
				System.out.println("Input is valid");
				account.setAccNo(accNo);
				account.setAccHolderName(accHolderName);
				account.setBalance(balance);
				System.out.println(" Successfully created the objects ");
			}else
				System.out.println("Invalid inputs...");
			
			break;
			
		case 2:
			System.out.println("Displaying details");
			System.out.println("AccNo is "+account.getAccNo());
			System.out.println("Name is "+account.getAccHolderName());
			System.out.println("Balance is "+account.getBalance());
			
			break; 
		case 3:
			System.out.println(" Starting the Withdraw process...");
			System.out.println(" the amount to withdraw.");
			double amount=sc.nextDouble();
			boolean res =accountOperation.withdraw(account, amount);
			if(res==true)
				System.out.println("Completed the withdraw successfully...");
			else
				System.out.println("There is an error...");
			break;
			
		case 4:
			System.out.println(" Starting the Deposit process...");
			System.out.println(" the amount to Diposit.");
			double amount1=sc.nextDouble();
			boolean res1 =accountOperation.deposit(account, amount1);
			if(res1==true)
				System.out.println("Completed the deposit successfully...");
			else
				System.out.println("There is an error...");
			break;
			 
		case 5:
			System.out.println("Calling Transfer methods...");
			System.out.println("Accepting details");
			System.out.println("Enter the acccNo, accHolderName, balance");
			 accNo=sc.nextInt();
			 accHolderName=sc.next();
			 balance=sc.nextDouble();
		     result= accountValidation.checkAll(accNo, accHolderName, balance);
			if(result==true) {
				System.out.println("Input is valid");
				account2.setAccNo(accNo);
				account2.setAccHolderName(accHolderName);
				account2.setBalance(balance);
				System.out.println(" Successfully created the objects ");
			}else
				System.out.println("Invalid inputs...");
			System.out.println("Enter the amount to transfer ");
			amount1=sc.nextDouble();
			res=accountOperation.transfer(account, account2, amount1);
			if(res==true) {
				System.out.println("Completed the transfer successfully...");
				System.out.println("Account new balance is "+account.getBalance());
				System.out.println("Account new balance is "+account2.getBalance());
			}
				
			else
				System.out.println("There is an error...");
			break;
			
		case 6:
			System.exit(0);
			break;
			
		}
		System.out.println("Do you want to continue(Y/N)?");
		choice=sc.next();
		}while(choice.equals("Y")|| choice.equals("y"));

	}

}
