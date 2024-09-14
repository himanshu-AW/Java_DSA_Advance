import java.util.Scanner;

public class GCD {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.println("Enter two numbers: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            
            GCD obj = new GCD();
            System.out.println("1st Method Result:" + obj.calculateGCD(num1, num2));
            System.out.println("2st Method Result:" + obj.gcd(num1, num2));
            System.out.println("3st Method Result:" + obj.gcdOptimized(num1, num2));
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            input.close();
        }
    }

int calculateGCD(int n1, int n2) { // TC: O(min(n1,n2))
    int res = Math.min(n1, n2);

    while (res > 0) {
        if (n1 % res == 0 && n2 % res == 0) {
            break;
        }
        res--;
    }
    return res;
}

// Euclidean Algorithm
int gcd(int n1, int n2) {
    while (n1 != n2) {
        if (n1 > n2) {
            n1 -= n2;
        } else {
            n2 -= n1;
        }
    }
    return n1;
}

int gcdOptimized(int n1, int n2) {
    if (n2 == 0) {
        return n1;
    }
    return gcdOptimized(n2, n1 % n2);
}
}