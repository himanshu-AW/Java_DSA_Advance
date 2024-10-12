public class SumOfDigits {
    static int sumOfDigits(int n){
        if(n>0){
            return (n%10)+sumOfDigits(n/10);
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
    }
}
