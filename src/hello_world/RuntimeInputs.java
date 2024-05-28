package hello_world;

import java.util.*;

public class RuntimeInputs {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for (int i=a.length-1; i>=0; i-- )
		{
			System.out.println("enter no" +i);
			a[i] = sc.nextInt();
		}
				
System.out.println(Arrays.toString(a));
	}

}
