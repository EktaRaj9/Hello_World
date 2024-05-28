package hello_world;

public class Palindrome {

	public static void main(String[] args) {
		String s= "ekta";
		String s1 = "madam";
		String rev ="";
		String rev1 ="";
		char ch[] = s.toCharArray();
		char ch1[] = s1.toCharArray();
		
		
		for(int i=ch.length-1;i>=0;i-- )
		{
			rev = rev+ch[i];
		}
			if (rev.equals(s))
			{
				System.out.println("ekta is palindrome");
			}
			
		

		for(int j=ch1.length-1;j>=0;j-- )
		{
			rev1 = rev1+ch1[j];
		}
		System.out.println(rev1);
			if (rev1.equals(s1))
			{
				System.out.println("madam is palindrome");
			}
			else
			{
				System.out.println("not");
			}
		}
	}


