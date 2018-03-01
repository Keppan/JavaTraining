package ssds;
public class Methods2 {

	void callIt() {
		
		Methods2 newObj = new Methods2();
		newObj.DoIt(13, 14);
	}
	
	void DoIt (int a, int b) {
		
		int multiply = a * b;
		System.out.println("number we get is : "+ multiply);
		
	}
	void CallItAgain () {
		
		Methods2 newObj = new Methods2();
		int xx = 13;
		int bb = 14;
		
		newObj.DoItAgain(xx,bb);
		
	}
	
	void DoItAgain (int a, int b) {
		
		int multiply = a*b;
		System.out.println("number we get is : "+ multiply);
	}
	
}
