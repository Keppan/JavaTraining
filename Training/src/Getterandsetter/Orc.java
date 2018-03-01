package Getterandsetter;

public class Orc {
		
	
	private int Height; // height = null
	
	void setHeight (int Height) {
		if (Height < 10 ){
			this.Height = Height;
			System.out.println("Your Orc height is passed trough");
		} else {
			System.out.println("Your Orc height is not passed trough");
			
		}

		
	}
	
	int getHight () {
		
		return Height;
	}
	
}
