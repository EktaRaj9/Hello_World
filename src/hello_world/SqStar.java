package hello_world;

public class SqStar {

	public static void main(String[] args) {
		int row = 4;
		for (int i = 1; i <= row; i++) 
		{
			for (int j = 1; j <= row; j++) 
			{
				if (i == 1 || j == 1 || i == row || j == row) 
				{
					System.out.print("*");
				} 
				else 
				{
					System.out.print(" ");
				}
			}System.out.println();
		}
	

	}

}
