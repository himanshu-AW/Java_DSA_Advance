// package Recursion;

public class Power {
    // brutefore approach -> TC: O(a^(b)) = exponential which is very bad.
    static long powerOfAToB(int a, int b){
        if(b==1) return a;
        return a*powerOfAToB(a, b-1);
    }
    // optimized approach -> TC: O(log(b)) = exponential which is very very good
    static long powerOfAToBOptimized(int a, int b){
        if(b==1) return a;

        long halfOfPower = powerOfAToBOptimized(a, b/2); 
        if(b%2==0){ //for even power
            return halfOfPower*halfOfPower;
        }
        // for odd power
        return halfOfPower*halfOfPower*a;

    }
    public static void main(String[] args) {
        // System.out.println(powerOfAToB(2, 8));
        // System.out.println(powerOfAToB(2, 9));

        System.out.println(powerOfAToBOptimized(2, 8));
        System.out.println(powerOfAToBOptimized(2, 9));
        System.out.println(powerOfAToBOptimized(2, 64));
    }
}
