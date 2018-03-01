package Super;

public class ChildClass extends BaseClass {

	
	public void printSomething () {
		super.printSomething();
		//System.out.println("This was printed from ChildClass");
		
	}
	
	public static void main(String[] args) {
		
		ChildClass testSuper = new ChildClass();
		
		testSuper.printSomething();
		
		
	}
}
