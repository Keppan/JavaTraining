
public class Scope {

	
	static int number = 7; //static must be used for all methods to see it.
	
	public static void main(String[] args) {
		
		
		//int number = 7; // this is a local variable - declaring it and initializing it
		
		System.out.println(number);
		
		
		
	}
	static void getnumber() {
		System.out.println(number);
	}
	
	
}
