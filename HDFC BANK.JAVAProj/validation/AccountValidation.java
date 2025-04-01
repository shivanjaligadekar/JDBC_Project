package validation;

public class AccountValidation {
  public boolean checkAccNo(int accNo) {
	if(accNo < 0) {
		System.out.println("Account number is invalid");
		return false;
	
	}else 
	    return true;

  }
  public boolean checkAccHolderName(String accHolderName) {
	char ch=' ';
	boolean valid=false;
	for(int i=0;i<accHolderName.length();i++) {
		ch=accHolderName.charAt(i);
		if((ch>=65 && ch <= 90) || (ch>=97 && ch <= 122)) {
		  valid=true;
		}else {
		   valid=false;
			break;
		}
	}
   if(valid == true)
	   return true;
   else 
	   return false;
  }
  public boolean checkBalance(double balance) {
	if(balance<=0) {
		System.out.println("Balance can not be zero or -ve");
		return false;
		
	}else
		return true;
	
	
  }
  public boolean checkAll( int accNo,String accHolderName,double balance) {
	if(!checkAccNo( accNo))
		return false;
	else if(!checkAccHolderName(accHolderName))
		return false;
	else if(!checkBalance(balance))
		return false;
	else
		return true;
  }


}