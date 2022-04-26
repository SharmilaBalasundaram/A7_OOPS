package a5_encapsulation;

public class A3_PaytmTest {

	public static void main(String[] args) throws InterruptedException {
		
		A1_HdfcTest a= new A1_HdfcTest();
		a.setcustId(12121);
		System.out.println("Successfully verified your custID:"+a.getcustId());		
		
	}
}
