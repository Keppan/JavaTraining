package Planets;

public class Addition {

	int firstNumber;
	int secondNumber;
	
	public int getnumber() {
	
	return (firstNumber + secondNumber);
	
	}
	
	Addition () { // setting standard addition values
		
		firstNumber = 10;
		secondNumber = 20;
	}
	
	Addition (int L, int B){ // setting 2 chosen values
		firstNumber = L;
		secondNumber = B;
		
		
	}
}

