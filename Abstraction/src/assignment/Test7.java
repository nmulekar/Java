package assignment;

public class Test7 {

	public static void main(String[] args) {

		HDFC hd = new HDFC();
		
		Bank b = new Bank() {
			
			@Override
			public double CalculateIntrest() {
				
				System.out.println("Rate is 9.9");
				
				return 9.9;
			}
		};

		hd.withdrow();
		hd.deposite();
		hd.CalculateIntrest();
		b.CalculateIntrest();

	}

}

abstract class Bank {
	int a=19;
	public Bank() {
		
	}

	public void deposite() {

		System.out.println("its deposite method");
	}

	public void withdrow() {

		System.out.println("its withdrow method");
	}

	public abstract double CalculateIntrest();
}

class HDFC extends Bank {

	@Override
	public double CalculateIntrest() {

		System.out.println("Rate is 7.8");

		return 7.8d;

	}

	public void deposite() {

		System.out.println("its HDFC deposite method");
	}

	public void withdrow() {

		System.out.println("its HDFC withdrow method");
	}

}