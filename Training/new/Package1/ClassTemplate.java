package Package1;

public class ClassTemplate {

	int day = 1; 				// visible to the package. the default. no modifiers needed.
	public int week = 7;    	// visible to the whole WORLD (public)
	protected int month = 31;	// visible to the package and all subclasses
	private int year = 365; 	// visible to the class only (private) MOST RESTRICTIVE
	
	
	
	public int printWeek () {
		return week + day + month + year;
	}
	
	
	
	
}
