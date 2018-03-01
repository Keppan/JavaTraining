package newpackage;

public class Switchstatments {
public static void main(String[] args) {
	
	
	int fieldgoal;
	fieldgoal = 3;
	
	switch (fieldgoal) {
	
	case 6:
		System.out.println("This is a touchdown");
		break;
		
	case 2:
		System.out.println("This is a safety");
		break;
		
	case 3:
		System.out.println("This is a field goal");
		break;
		
	case 3000:
		System.out.println("This is a n impossible score");
		break;
		
	default:
		System.out.println("Nothing matches at all. YOU LOOSE");
		break;
	}
	
	
}
}
