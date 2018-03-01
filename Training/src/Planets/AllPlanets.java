package Planets;

public class AllPlanets{
	public static void main(String[] args) {
		
/////////////////////  OLD WAY  ///////////////////////				
//		Planet Planet1 = new Planet();
//		
//		Planet1.size = 6371;
//		Planet1.name = "Earth";
//		
//		Planet1.displaySize();
//		
//		Planet Planet2 = new Planet();
//		
//		Planet2.size = 69911;
//		Planet2.name = "Jupiter";
//		
//		Planet2.displaySize();
		
////////////////  WITH CONSTRUCTOR  ////////////////////
		
		Planet Planet1 = new Planet (6371, "Earth"); // using standard Addition values
		Planet Planet2 = new Planet (69911, "Jupiter"); // using standard Addition values
		Planet1.displaySize();
		Planet2.displaySize();
		
	}
	
}