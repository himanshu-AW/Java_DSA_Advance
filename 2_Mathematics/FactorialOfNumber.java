import java.util.Scanner;

// Given a positive integer N. The task is to find factorial of N.

// Example 1:

// Input:
// N = 4
// Output: 24
// Explanation: 4! = 4 * 3 * 2 * 1 = 24
// Example 2:

// Input:
// N = 13
// Output: 6227020800
// Explanation: 
// 13! = 13 * 12 * .. * 1 = 6227020800

public class FactorialOfNumber{
    long factorialOfNum(int num){ // TC:O(n), SC:O(1)
        long  fact =1;
        for(int i=num;i>1;i--){
            fact*=i;
        }
        return fact;
    }
    long factorialOfNumRecursive(int num){ // TC:O(n), SC:O(n)
        if(num==0){
            return 1;
        }
        return num * factorialOfNumRecursive(num-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("************* FactorialOfNumber *************");
            System.out.print("Enter a Number:");
            int n = input.nextInt();

            FactorialOfNumber obj = new FactorialOfNumber();
            System.out.println("Factorial of "+n+" using iterative method: "+obj.factorialOfNum(n));
            System.out.println("Factorial of "+n+" using recursive method: "+obj.factorialOfNumRecursive(n));
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            input.close();
        }
    }
}