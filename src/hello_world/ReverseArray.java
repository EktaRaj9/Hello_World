package hello_world;

public  class ReverseArray {

	public static void main(String[] args) {
		int a[]	= {1,2,3,4,5};
		int b[] = {};
 		for (int i = a.length -1 ; i>=0; i--)
		{
			for (int j= 0; j<a.length; j++)
			{
				b[j]=a[i];
				System.out.print(b +" ");

			}
		
			
		} 
	}

}
