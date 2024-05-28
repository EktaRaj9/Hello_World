package hello_world;

public class Search {

	public static void main(String[] args) {
	
		int a[]= {100, 100, 100, 200, 300, 400, 500, 600};
		int i = 100;
		int count = 0;
		
		for (int x:a)
		{
		
		if (i==x)
		{
			System.out.println("matched");
			count++;
		}
			
		}

	}

}
