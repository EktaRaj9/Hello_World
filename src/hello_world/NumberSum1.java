package hello_world;

public class NumberSum1 {
	
	 public static int digitSum(int num) {
	        int sum = 0;
	        while (num != 0) {
	            sum = sum + num % 10;
	            num = num/10;
	        }
	        return sum;
	    }
	

    public static void main(String[] args) {
        int n[] = {28, 743, 1990, 1000};

        for (int i = 0; i < n.length; i++) {
            int sum1 = digitSum(n[i]);
            
            for (int j = n[i] + 1; ; j++) {
                int sum2 = digitSum(j);

                if (sum1 == sum2) {
                    System.out.println("The next number with same sum for " + n[i] + " is: " + j);
                    break;
                }
            }
        }
    }

   
}


