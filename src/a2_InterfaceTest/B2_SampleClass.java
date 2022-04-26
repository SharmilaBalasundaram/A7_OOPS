package a2_InterfaceTest;

public class B2_SampleClass implements B1_InterfaceStaticFunction {

	public static void main(String[] args) {
		B2_SampleClass a = new B2_SampleClass();
		a.credit();
		a.debit();
		a.loan();
		// a.add() - error
		// add() - error

		B1_InterfaceStaticFunction.add(); // constance

		System.out.println(intrest);

		// intrest=intrest+10; - interface not accept to change variable

	}

	public void credit() {
		System.out.println("Sample static Interface prog");
	}

	public void debit() {
		System.out.println("Sample static Interface prog");

	}

	public void loan() {
		System.out.println("Sample static Interface prog");

	}

}
