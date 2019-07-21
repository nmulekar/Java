package assignment;

public class XYZ implements MyInterface {

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

		MyInterface obj = new XYZ();
		
		obj.method1();
		obj.method2();
	}

}
