import java.util.Scanner;

// A prime number is a number which is only divisible by 1 and itself.
// Given number N check if it is prime or not.

// Example 1:

// Input:
// N = 5
// Output: Yes
// Explanation: 5 is only divisible by 1 
// and itself. So, 5 is a prime number.
 
// Example 2:

// Input:
// N = 4
// Output: No
// Explanation: 4 is divisible by 2. 
// So, 4 is not a prime number.

public class PrimeNumberOrNot {
    boolean isPrimeNum(int n ){
        if(n<=1) return false;
        for(int i=2;i<= Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("------------- Check a number is prime or not ---------------");
            System.out.println("Enter a number: ");
            int N = input.nextInt();

            PrimeNumberOrNot obj =  new PrimeNumberOrNot();

            if(obj.isPrimeNum(N)){
                System.out.println(N+" is a Prime number.");
            }else{
                System.out.println(N+" is not a Prime number.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            input.close();
        }
    }
}
