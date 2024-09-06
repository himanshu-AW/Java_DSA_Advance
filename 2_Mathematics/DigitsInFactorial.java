import java.util.Scanner;

// Given an integer N. Find the number of digits that appear in its factorial. 
// Factorial is defined as, factorial(n) = 1*2*3*4……..*N and factorial(0) = 1.
 
// Example 1:

// Input: N = 5
// Output: 3
// Explanation: Factorial of 5 is 120.
// Number of digits in 120 is 3 (1, 2, and 0)
 

// Example 2:

// Input: N = 120
// Output: 199
// Explanation: The number of digits in
// 120! is 199

public class DigitsInFactorial {

    int digitsInFact(int n){ // TC:O(n), SC:O(1)
        long  fact =1;
        for(int i=n;i>1;i--){
            fact*=i;
        }
       int count = 0;
       while(fact>0){
         fact /=10;
         count++;
       }
       return count;
    }

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        try {
            System.out.println("*************** Digits In Factorial**************");
            System.out.println("Enter a number:");
            int num = input.nextInt();

            DigitsInFactorial obj = new DigitsInFactorial();
            System.out.println("Number of digits in factorial of "+num+" is: "+obj.digitsInFact(num));

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            input.close();
        }
    }
}
