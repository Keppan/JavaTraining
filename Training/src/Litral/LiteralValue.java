package Litral;

public class LiteralValue {

	
	private int x;
	
	public LiteralValue () {
		
		x=50;
		
	}
	
		public int methodchildclass () {
			x=15;
			return x;
			
			
		}
		
			public int methidchildclass1 (int placeholder) {
				this.x = this.x + placeholder;
				return x;
			}
	
			public static void main(String[] args) {
				
				LiteralValue testobj = new LiteralValue();
				System.out.println(testobj.methodchildclass());
				System.out.println(testobj.methidchildclass1(45)); 
				
				
			}
			
}
