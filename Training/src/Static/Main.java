package Static;

public class Main {

	public static void main(String[] args) {
		
		Registration newuser1 = new Registration("Mary");
		System.out.println(newuser1.putUsernameDatabase()+ " Username created and entered into database");
		
		System.out.print("one value = " + Registration.one); // This*
		System.out.println(" usernameCount value = "+Registration.getusernameCount()); //*and this is the same thing
		
// This do not work because usernameCount is private. that is why we need the method getusernameCount.
			//System.out.println("usercount value = " + Registration.usernameCount);// 

		
		Registration newuser2 = new Registration("Larry");
		System.out.println(newuser2.putUsernameDatabase()+ " Username created and entered into database");
		
		System.out.print("one value = " + Registration.one);
		System.out.println(" usernameCount value = "+Registration.getusernameCount());
		
	}
	
}
