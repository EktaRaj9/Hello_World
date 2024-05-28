package hello_world;

public class MultiDArray {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,2},{3,4,4},{5,6,6},{7,8,8}};
		
		System.out.println("Row count: " +a.length);
		System.out.println("Column count: " +a[0].length);
		
		/*for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[0].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.println();*/
		
		for(int i[]:a)
		{
 			for(int j:i)	
				
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
