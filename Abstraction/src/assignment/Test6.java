package assignment;

public class Test6 implements Interface2 {

	@Override
	public void method1() {

		System.out.println("Implemented Method 1");

	}

	@Override
	public void method2() {

		System.out.println("Implemented Method 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test6 t = new Test6();
		
		t.method1();
		t.method2();

	}

}
