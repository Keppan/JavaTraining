package Planets;

public class AdditionProgram {
	
	public static void main(String[] args) {
		
		Addition addobj = new Addition (); // using standard Addition values
		Addition addobj1 = new Addition (79,21); // using chosen values
		
		
		System.out.println("The addition equals " + addobj.getnumber()); // running getnumber with standard values
		System.out.println("The addition equals " + addobj1.getnumber()); // running with chosen values
	}

}
