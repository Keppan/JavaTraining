package Litral;

public class Methods {

	
	void numbert2 (int trees) {
		trees = trees + 1;
		
	}
	
	void numbert (int trees) {
		trees = trees + 1;
		int trees2 = 4;
		System.out.println(trees + trees2);
		
	}
	int returnn (int x) {
		
		
		x = x+1;
		return x;
	}
	
	public static void main(String[] args) {
		
		Methods testtree = new Methods();
		
		testtree.returnn(7);
		
		System.out.println(testtree.returnn(55));

		
		
		
		
	}
}
