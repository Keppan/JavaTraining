
public class Casting {
public static void main(String[] args) {
	
	double source = 150.9999999999; // variable to variable cast
	int destination = (int) source;
	
	
	System.out.println(source);
	System.out.println("V to V :"+ destination);
	
	int I = 125;					// goes from -2 billion to 2 billion
	byte B = (byte) I;				// goes from -127 to 127 == this is explicit cast "visual"
	
	System.out.println("explicit :" + B);
	
	Integer wholeNumber = new Integer	(400);						// this is an object
	int dest = wholeNumber.intValue();								// variable
	
	System.out.println("V to O :" + dest);
	
	String val = "47";							// this is a variable String
	int intobject = Integer.parseInt(val);		// this is an object Int

	
	System.out.println("O to V :"+ intobject);
	
	int x = 47;
	double y = 3.5;
	double xy = x+y;			// this is implicit cast "not visual". transelates int x to a double.
	
	System.out.println( "implicit :"+xy);
	
	
	
}
}
