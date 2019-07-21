package assignment;

public abstract class Demo2 {

	abstract void get(int a, int b);

	abstract void add();

	abstract void display();

}

class SubClass extends Demo2 {

	int x, y, z;

	@Override
	void get(int a, int b) {

		x = a;

		y = b;

	}

	@Override
	void add() {

		z = x + y;
	}

	@Override
	void display() {
		
		System.out.println("Addition is : " + z);

	}

}