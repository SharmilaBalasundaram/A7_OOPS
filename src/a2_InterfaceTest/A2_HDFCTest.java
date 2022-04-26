package a2_InterfaceTest;

public class A2_HDFCTest implements A1_RBITest{
	
	public static void main(String[] args) {
		A2_HDFCTest a= new A2_HDFCTest();
		a.credit();
		a.debit();
		a.loan();
		
	}

	public void credit() {
		System.out.println("Net banking HDFC credit");
	}
	
	public void debit() {
		System.out.println("Net banking HDFC debit");
	}

	public void loan() {
		System.out.println("Net banking HDFC loan");
	}

	

}
