package a2_InterfaceTest;

public interface A1_RBITest {

	// abstract method , without body of the content
	public void credit ();
		
	public  void debit ();

	public  void loan ();
	
	
	
	
	
	// interface only allows abstract functions
		// normal class not allowed abstract function unless use abstract keyword
		// after 1.8 interface allows normal functions like below, still we use old procedure
		
		/*
		public static void debit (){
			System.out.println("debit logic of WorldBank");
		}

		public static void loan (){
			System.out.println("Loan logic of WorldBank");
		}
	    */

}
