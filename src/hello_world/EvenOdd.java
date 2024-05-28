package hello_world;

public class EvenOdd {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int even = 0;
		int odd = 0;

		for (int x : a)
		{
			if (x % 2 == 0) {
				// System.out.print("Even: "+x+", ");
				even++;
				

			} else {
				// System.out.print("Odd: "+x+", ");
				odd++;
				
			}
		}
		System.out.println("even" +even);
		System.out.println("odd" +odd);
	}

}
