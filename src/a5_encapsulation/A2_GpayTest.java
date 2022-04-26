package a5_encapsulation;

public class A2_GpayTest {

	public static void main(String[] args) throws InterruptedException {

		A1_HdfcTest a = new A1_HdfcTest();
		a.setcustId(12345);
		System.out.println("Successfully verified your custID:" + a.getcustId());
		a.setAmout(2500);
		a.getAmount();
	}

}
