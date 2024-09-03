import java.util.Scanner;

// You are given an interger I, find the absolute value of the interger I.

// Example 1:

// Input:
// I = -32
// Output: 32
// Explanation: 
// The absolute value of -32 is 32.
 

// Example 2:

// Input:
// I = 45
// Output: 45
// Explanation: 
// The absolute value of 45 is 45 itself.

public class AbsoluteValue {
    int absValue(int I){
        if(I < 0){
            return I * (-1);
        }else {
            return I;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            AbsoluteValue obj = new AbsoluteValue();
            System.out.println("Output:"+obj.absValue(num));

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            input.close();
        }
    }
}
