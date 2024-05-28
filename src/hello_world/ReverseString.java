package hello_world;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Ekta ksjdfk";
		String rev="";
		
		
		/*for(int i=s.length()-1; i>=0; i--) //Approach 1
		{
			System.out.print(s.charAt(i));
		}*/
		
		char c[]=s.toCharArray();  //Approach 2
		for(int i=c.length-1; i>=0; i--)
		{
			rev = rev+c[i];
		}
		System.out.println(rev);
		
		StringBuffer sb = new StringBuffer("Rahul");
		System.out.println(sb.reverse());

		StringBuilder sbu = new StringBuilder("Rahul");
		System.out.println(sbu.reverse());
	}
	
	

}
