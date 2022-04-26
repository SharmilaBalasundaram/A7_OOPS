package a5_encapsulation;

public class A1_HdfcTest {

		private int custId;
		private int amount=10000;
		
		public void setcustId (int custId) throws InterruptedException{
			System.out.println("We got your request please wait.....");
			Thread.sleep(2000);
			this.custId=custId;

		}
		
		public  int getcustId() throws InterruptedException{
					
			System.out.println("Processing custId...");
			Thread.sleep(2000);

			System.out.println("Validating the Id you are entered...");
			Thread.sleep(2000);

			return custId;

		}
	
		public void setAmout(int amount) throws InterruptedException{
			
			System.out.println("We got your request for debit:"+amount);
			Thread.sleep(2000);

			this.amount=this.amount-amount;
		}
		
		public int getAmount() throws InterruptedException{
			
			System.out.println("Your debit request is processed....");
			Thread.sleep(2000);
			System.out.println("Current balance on your account is:"+this.amount);
			return amount;
			
			
		}
}


