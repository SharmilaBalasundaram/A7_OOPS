package a3_abstractTest;

public class A3_SBIBank extends A1_RBITest{
	
	public static void main(String[] args) {
		
		loan();
		A3_SBIBank a= new A3_SBIBank();
		a.credit();
		a.debit();
		
	}

	@Override
	public void credit() {
    System.out.println("Mobile Banking - SBI credit logic ");		
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Banking - SBI debit logic ");		

	}

}
