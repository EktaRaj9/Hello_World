package hello_world;

public class LargestInArray {

	public static void main(String[] args) {
		int a[] = {2,2,2,2,4,2,3};
		int b=a[0];
		for (int i =0; i<a.length;i++)
		{
			if(b<a[i])
			{
				b = a[i];
			}
		}
		System.out.println(b);

	}

}
