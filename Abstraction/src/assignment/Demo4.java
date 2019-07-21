package assignment;

public abstract class Demo4 {
	
	abstract void getVal(String name);

	abstract void display();
	
}

class MainClass extends Demo4{
	
	String name;
	
	void getVal(String name) {
		
		this.name = name;
	}
	
	void display() {
		
		System.out.println("Hello  " + name);
	}
	
}