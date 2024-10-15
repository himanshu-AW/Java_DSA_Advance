// package Recursion;

public class Factorial {
    static long factorialOfNumber(int num){
        if(num==0||num==1) return 1;
        return num*factorialOfNumber(num-1);
    }
    public static void main(String[] args) {
        System.out.println(factorialOfNumber(5));
        System.out.println(factorialOfNumber(8));
    }
}
