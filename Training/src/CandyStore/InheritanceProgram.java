package CandyStore;

public class InheritanceProgram {
	
	//THIS IS THE ACTUAL PROGRAM
	
	
	public static void main(String[] args) {
		
		GumDrops Red = new GumDrops();
		GumDrops Green = new GumDrops();
		
		Red.givemeCinnamon();
		Red.SugarAmount = 10;
		Red.displaySugarAmount();
		
		Green.givemeSpearmint();
		Green.SugarAmount = 5;
		Green.displaySugarAmount();
		
		
	}
	
}
