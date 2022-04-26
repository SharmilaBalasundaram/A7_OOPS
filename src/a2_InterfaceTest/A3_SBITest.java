package a2_InterfaceTest;

public class A3_SBITest implements A1_RBITest {
	
	public static void main(String[] args) {
		
	A3_SBITest a= new A3_SBITest();
	a.credit();
	a.debit();
	a.loan();
	}

	public void credit() {
		System.out.println("Mobile Banking SBI credit");
	}

	public void debit() {
		System.out.println("Mobile Banking SBI credit");

	}

	public void loan() {
		System.out.println("Mobile Banking SBI credit");

	}

}
