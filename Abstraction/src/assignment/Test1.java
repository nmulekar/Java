package assignment;

public class Test1 extends Demo1 {

	public void Display2() {

		System.out.println("I am Overriding Abstract Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 d = new Test1();

		d.Display2();
		
		d.Display1();
	}

}

