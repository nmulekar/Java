package assignment;

public class Tyre implements Rollable, Runnable {

	int width;

	@Override
	public boolean isRunnable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isRollable() {
		// TODO Auto-generated method stub
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tyre t = new Tyre();

		System.out.println(t.isRollable());

		System.out.println(t.isRunnable());
	}

}
