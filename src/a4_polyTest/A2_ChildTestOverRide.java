package a4_polyTest;

public class A2_ChildTestOverRide extends A2_ParentTest{

	public static void main(String[] args) {
		A2_ChildTestOverRide a= new A2_ChildTestOverRide();
		a.exec();
		}
	
	public static void add(){
		System.out.println("Child add");
	}
	
	public void exec(){
		super.add();
		add();
		// this.add(); // used to call current class
	}
}



