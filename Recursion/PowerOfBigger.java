import java.math.BigInteger;
import java.util.Scanner;

public class PowerOfBigger {
    static BigInteger powerOfAToBOfBig(BigInteger a, int b){
        if(b==1) return a;

        BigInteger halfOfPower = powerOfAToBOfBig(a, b/2); 
        BigInteger finalResult = halfOfPower.multiply(halfOfPower);
        if(b%2==0){ //for even power
            return finalResult;
        }
        // for odd power
        return finalResult.multiply(a);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        BigInteger a = scanner.nextBigInteger();
        int b = scanner.nextInt();
        System.out.println(powerOfAToBOfBig(a, b));
        scanner.close();
    }
}
