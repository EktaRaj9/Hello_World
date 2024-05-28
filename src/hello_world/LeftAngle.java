package hello_world;

public class LeftAngle {

	void printleft(int n) {

		for (int i = 1; i <= n; i++) 
		    {
			for (int k = n - 1; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		LeftAngle pl = new LeftAngle();
		pl.printleft(5);

	}
}
