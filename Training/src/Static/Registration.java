package Static;

public class Registration {

	private String usernameA; 
	private static int usernameCount = 0;
	public static int  one = 0; // statics do not reset after the first object is runned. 
	
	
	public Registration (String A) {
		usernameA = A;
		usernameCount++;
	}
	
	
	public String putUsernameDatabase () {
		one++; // here the value always adds 5 to the current value.
		return usernameA;
		
	}
	
	
	public static int getusernameCount () {
		return usernameCount;
	}
	
	
}
