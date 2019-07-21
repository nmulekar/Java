package assignment;

public class Vehical implements Moveable {

	@Override
	public void move() {

		System.out.println("Average speed is : " + AVG_SPEED);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehical v = new Vehical();

		v.move();

	}

}
