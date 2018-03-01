
public class Food {

	private String foodA;
	
	public Food (String A) {
		
		foodA = A;
		
	}
	
	
	public String getFood () {
		
		return foodA; // use return when a value is returned
		
	}
	
	void systemPrint () { // void only if nothing is returned. Instead the calculation is done inside the method
		
		System.out.println("Void "+foodA);
	}
	
}
