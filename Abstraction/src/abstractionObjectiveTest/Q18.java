package abstractionObjectiveTest;

public class Q18 {

	public static void main(String[] args) {

		Card c;

		Birthday b = new Birthday("ABC", 33);

		c = b;

		System.out.println("Card : " + c.s);

		System.out.println("Card : " + c.i);

		System.out.println("Birth : " + b.s);

		System.out.println("Birth : " + b.i);

	}

}

class Card {

	String s;
	int i;

}

class Birthday extends Card {

	String s;
	int i;

	public Birthday(String s, int i) {

		this.s = s;
		this.i = i;

		System.out.println("Birth P : " + s);

		System.out.println("Birth P : " + i);

	}
}
