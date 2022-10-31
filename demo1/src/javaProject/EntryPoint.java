package javaProject;

public class EntryPoint {

	public static void main(String[] args) {
		Mmfactory bankfactory=new Mmfactory();
		 mmBankSavingsAccount SavingAcc=new  mmBankSavingsAccount(0, null, 0, false);
		 mmBankCurrentAccount CurrentAcc=new  mmBankCurrentAccount(0, null, 0, 0);
		 SavingAcc.withdraw();
		 SavingAcc.toString();
		 CurrentAcc.withdraw();
		 CurrentAcc.toString();
	}

}
