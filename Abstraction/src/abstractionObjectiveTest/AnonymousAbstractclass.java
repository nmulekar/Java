package abstractionObjectiveTest;

public class AnonymousAbstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AA a = new AA() {
			
			@Override
			void m2() {
				
				System.out.println(2);
			}
		};
		
		a.m1();
		a.m2();

	}

}

abstract class AAA{
	
	void m1() {
		
		System.out.println(1);
	}
	
	abstract void m2();
}
 class AA {
	
	void m1() {
		
		System.out.println(1);
	}
	
	 void m2() {
		 System.out.println(22); 
	 }
}
