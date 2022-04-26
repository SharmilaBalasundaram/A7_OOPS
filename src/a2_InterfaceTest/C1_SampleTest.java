package a2_InterfaceTest;

public class C1_SampleTest implements C1_Interface1, C1_Interface2 {

	public static void main(String[] args) {
		C1_SampleTest a= new C1_SampleTest();
		a.add();
		a.sub();
		C1_Interface1.div();
		C1_Interface2.div();
	}

	
	public void sub() {
    System.out.println("sub function");
	}

	
	public void add() {
	    System.out.println("add function");

	}

}
