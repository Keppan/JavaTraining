
public class This {
	
	private int one;		// Object or Instance variable
	
	public This (int one) {
		
		this.one = one; // local variable
		// this. makes the program use the (world)variable instead of the local variable with the same name
		System.out.println(one);
	}
	
	
	public static void main(String[] args) {
		
		
		This testThis = new This (79);
		
		System.out.println(testThis.one);
	}

}
