package abstractionObjectiveTest;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A a1 = new A();

		A a2 = new B();

		B b = new B();

	}

}

abstract class A {

	abstract void m1();

}

class B extends A {

	B() {

	}

	@Override
	void m1() {
		// TODO Auto-generated method stub
		
	}

}