package Static;

public class NewMain {
	
	public static void main(String[] args) {
		
		NewReg newuser1 = new NewReg();
		
		
		NewReg.usernameCount++;
		System.out.println(NewReg.usernameCount);
		
		NewReg newuser2 = new NewReg();
		
		
		newuser2.usernameCount++;
		System.out.println(newuser2.usernameCount);
		
		NewReg newuser3 = new NewReg();
		
		
		newuser3.usernameCount=0;
		System.out.println(newuser3.usernameCount);
		
	}

}
