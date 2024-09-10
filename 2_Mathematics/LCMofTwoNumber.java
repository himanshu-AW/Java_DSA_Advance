import java.util.Scanner;

// Function to find GCD of two numbers using Euclidean algorithm

public class LCMofTwoNumber {
    int gcdOptimized(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdOptimized(n2, n1 % n2);
    }

    int lcmOf2Num(int a, int b){
        int res=Math.max(a, b);
        while(true){
            if(res%a == 0 && res%b==0){
                break;
            }
            res++;
        }
        return res;
    }

    int lcmOptimized(int a, int b){
        int gcd = gcdOptimized(a, b);
        return (a*b)/gcd;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("-------------- LCM of Two Number -------------");
            System.out.println("Enter first number:");
            int n1 = input.nextInt();
            System.out.println("Enter second number:");
            int n2 = input.nextInt();

            LCMofTwoNumber obj = new LCMofTwoNumber();
            int lcm = obj.lcmOf2Num(n1, n2);
            System.out.println("LCM of "+n1+" and "+n2+" is: "+lcm);
            lcm = obj.lcmOptimized(n1, n2);
            System.out.println("Optimized LCM of "+n1+" and "+n2+" is: "+lcm);

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            input.close();
        }
    }
}
