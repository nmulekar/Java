package assignment;

public class Test5 implements InterfaceA, InterfaceB {

	@Override
	public void myMethod() {

		System.out.println("Multiple Inheritance Example using Interface ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test5 t5 = new Test5();

		t5.myMethod();
	}

}
