package Super;

public class ChildClass2 extends ChildClass {
	
	
	public void printSomething () {
		super.printSomething();
		//System.out.println("This was printed from ChildClass");
		
	}
	
	public static void main(String[] args) {
		
		ChildClass testSuper = new ChildClass();
		
		testSuper.printSomething();
		
		
	}
}
