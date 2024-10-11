// package Recursion;

public class ClimbingStars {

    // same as fibonacciSeries, but with different is it start with index 2
    // for n=1;
    // you can move forward only 1 way

    // for n=2
    // you can move forward (1,1) or (2) : 2 ways

    // for n=3
    // you can move forward (1,1,1) or (1,2) or (2,1)  : 3 ways

    // for n=4
    // you can move forward (1,1,1,1) or (1,1,2) or (1,2,1) or (2,1,1) or (2,2) : 5 ways

    // for n=5
    // you can move forward (1,1,1,1,1) or (1,1,1,2) or (1,1,2,1) or (1,2,1,1) or (1,2,2) or (2,1,1,1) or (2,1,2) or (2,2,1) : 8 ways
    static int countWays(int n){
        if(n==1) return 1;

        int dp[] = new int[n+1];
        dp[1]=1;
        dp[2]=2;

        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];  // return the nth number in the Fibonacci series.
    }

     // static int countWays(int n){
    //     if(n==1 || n==2) return n;
    //     return countWays((n)-1) + countWays((n)-2);  // + countWays(n-3) for n=3 and so on...
    // }
   
    public static void main(String[] args) {
        // Problem statement : we have given a number of stars and number of steps that is you can move forward either 1 step or/and 2 steps.
        // You have to find number of ways to reach the last star from the beginning.
        int n = 6;
        System.out.println("Number of ways to reach the last star from the beginning: " + countWays(n));
    }
}
