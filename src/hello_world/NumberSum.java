package hello_world;

public class NumberSum {

	public static void main(String[] args) {
		int n[]= {28, 743, 1990, 1000};
		int sum1, sum2;
		
		for (int i = 0; i<n.length; i++)
		{
			sum1 = n[i]/10 + n[i]%10;
		
		
		for (int j = n[i]+1 ; j<=50000; j++)
		{
			sum2 = j/10 + j%10;
			
			if (sum1 == sum2) 
				
			{
			
				System.out.println("The next number with same sum for " +n[i]+" is: " +j);
				break;
			}
			
		}
		
	}
	}
	
}


