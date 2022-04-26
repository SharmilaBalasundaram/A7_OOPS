package a1_InheritanceTest;

public class A2_RBIbank extends A1_WorldBankTest{
	
	public static void main(String[] args) {
		
		
		credit();
		debit();
		eduloan();
		System.out.println("RBI Interest Rate :"+interestRate);
		//loan(); - implementation is optional in inheritance
		
	}
	
	public static void eduloan(){
		System.out.println("eduloan Logic for RBIbank");
	}
	
}
