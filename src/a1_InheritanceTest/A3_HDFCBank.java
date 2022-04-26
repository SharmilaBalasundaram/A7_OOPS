package a1_InheritanceTest;

public class A3_HDFCBank extends A2_RBIbank{
	
	public static void main(String[] args) {
		credit(); // worldbank
		debit(); // worldbank
		loan(); //worldbank
		eduloan(); // RBI bank
		personalloan();	// HDFC bank
		System.out.println("World bank interest: "+interestRate);
		interestRate=interestRate+2;
		System.out.println("HDFC Bank interest rate:"+interestRate );
	}
	
	public static void personalloan(){
		System.out.println("personalloan Logic for HDFCBank");
	}
	
}
