package Recursion;

public class Fibonacci {
    static int fibonacciSeries(int n){
        if(n==0 || n==1) {
            return n;
        }
        return fibonacciSeries(n-1) + fibonacciSeries(n-2);
    }
    static void printFibonacciSeries(int n){
        for(int i=0;i<=n;i++){
            System.out.print(fibonacciSeries(i)+" ");
        }
    }
    public static void main(String[] args) {
        printFibonacciSeries(10);
    }
}
