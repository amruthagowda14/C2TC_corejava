package javaProject;

abstract class BankAccount {
private int accNo;
private String accName;
private float accBal;

public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getAccName() {
	return accName;
}
public void setAccName(String accName) {
	this.accName = accName;
}
public float getAccBal() {
	return accBal;
}
public void setAccBal(float accBal) {
	this.accBal = accBal;
}

//constructor
public  BankAccount(int accNo,String accName,float accBal) {

}
//public BankAccount(int accNo2, String accName2, float accBal2, boolean isSalaried) {
	// TODO Auto-generated constructor stub
//}
//method1
public void deposite(float deposite) {
	this.setAccBal(this.getAccBal() + deposite);
	System.out.println("deposit is successful,new balance is"+this.getAccBal());
}

public void withdraw(float withdraw) {
	if(this.getAccBal()-withdraw<0) {
		System.out.println("withdraw successful,balance is"+ this.getAccBal());
	}else {
		this.setAccBal(this.getAccBal() - withdraw);
		System.out.println("withdraw successful,current balance is"+this.getAccBal());
	}
}

@Override
public String toString(){//overriding the toString() method  
	  return accBal+" "+accName+" "+accBal;  
	 }  


//first subclass
abstract class SavingAcc extends BankAccount{
private boolean isSalaried;
private  float MinBal;
public SavingAcc(int accNo, String accName, float accBal,boolean isSalaried) {
	super(accNo, accName, accBal);}
@Override
	public void withdraw(float withdraw) {
	if(this.getAccBal()-withdraw<0) {
		System.out.println("withdraw successful,balance is"+ this.getAccBal());
	}else {
		this.setAccBal(this.getAccBal() - withdraw);
		System.out.println("withdraw successful,current balance is"+this.getAccBal());
	}

	}
@Override
public String toString(){//overriding the toString() method  
	  return accBal+" "+accName+" "+accBal;  
	 } 
//Second subclass
abstract class CurrentAcc extends BankAccount{
	private float creditlimit=0;
	public CurrentAcc(int accNo,String accName,float accBal,float creditlimit) {
		super(accNo,accName,accBal);}
	@Override
	public void withdraw(float withdraw) {
		if(this.getAccBal()-withdraw<0) {
			System.out.println("withdraw successful,balance is"+ this.getAccBal());
		}else {
			this.setAccBal(this.getAccBal() - withdraw);
			System.out.println("withdraw successful,current balance is"+this.getAccBal());
		}

		}
	@Override
	public String toString(){//overriding the toString() method  
		  return accBal+" "+accName+" "+accBal;  
		 }
	public float getCreditlimit() {
		return creditlimit;
	}
	public void setCreditlimit(float creditlimit) {
		this.creditlimit = creditlimit;
	}
	public float withdraw() {
		// TODO Auto-generated method stub
		return 0;
	} 
	}
public float withdraw() {
	// TODO Auto-generated method stub
	return 0;
}

}
}


