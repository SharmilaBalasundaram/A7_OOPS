package a3_abstractTest;

public class A2_HDFCbank extends A1_RBITest {

	public static void main(String[] args) {
		A2_HDFCbank a= new A2_HDFCbank();
		a.credit();
		a.debit();
        loan();
        
        System.out.println("RBI interest rate:"+rate);
        rate=rate+5;
        System.out.println("HDFC interest rate:"+rate);
	}

	@Override
	public void credit() {
		System.out.println("Net banking - hdfc credit logic");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("Net banking - hdfc debit logic");

	}
	
}
