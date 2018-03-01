
public class HamburgerJoint {

	public static void main(String[] args) {
		
		Food servingA = new Food ("Hambruger");
		
		System.out.println("Returned " +servingA.getFood()); // passing through foodA
		
		
		servingA.systemPrint(); // does not return anything. only processes it in the method
		
	}
	
	
}
