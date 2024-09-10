import java.util.Scanner;


// Given the first 2 terms A and B of a Geometric Series. The task is to find the Nth term of the series.
// Example 1:
// Input:
// A = 2 
// B = 3
// N = 1
// Output: 2
// Explanation: The first term is already
// given in the input as 2

// Example 2:
// Input:
// A = 1
// B = 2
// N = 2
// Output: 2
// Explanation: Common ratio = 2,
// Hence second term is 2.

public class GP_nthTerm{
    int findGPnthTerm(int a, int b, int n){ //TC: 
        int commonRatio  = b/a;
        int nthTerm = a * (int)Math.pow(commonRatio,n-1);
        return nthTerm;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("************ Find nth term of GP series **************");
            System.out.print("Enter the first term: ");
            int first = input.nextInt();
            System.out.print("Enter the second term: ");
            int second = input.nextInt();

            System.out.print("Enter the term number: ");
            int term = input.nextInt();

            GP_nthTerm obj = new GP_nthTerm();
            int result = obj.findGPnthTerm(first, second, term);
            System.out.println("The "+term+"th term of the GP series is: "+result);


        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            input.close();
        }
        
    }
}