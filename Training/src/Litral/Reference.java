package Litral;

public class Reference {

	void play (int teststs) {
		
		System.out.println("test my " + teststs);
		
	}
	
	public static void main(String[] args) {
		int toynumber = 5;
		Reference temp = new Reference();
		
		temp.play(toynumber);
		
		
	}
}
