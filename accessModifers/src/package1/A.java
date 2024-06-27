package package1;
import package2.*;

public class A {

	protected String protectMessage = "This is protected";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		B b = new B();
		//System.out.println(b.privateMessage); this wont work because it is only available
		
	}

}
