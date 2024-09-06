import java.util.Scanner;

public class TraillingZerosInFactorial {
    int traillingZerosInFact(int n){ // TC:O(n), SC:O(1)
        long fact = 1;
        for(int i=n;i>=1;i--){
            fact *= i;
        }
        int count = 0;
        while(fact%10 == 0){
            count++;
            fact /=10;
        }
        return count;
    }

    int traillingZerosInFact_II(int n){ // TC:O(logn), SC:O(1)
        int count =0 ;
        for (int i=5;i<=n;i*=5){
            count = count + (n/i);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("****************** Trailling Zeros In Factorial ******************");
            System.out.print("Enter a Number: ");
            int n = input.nextInt();

            TraillingZerosInFactorial obj =  new TraillingZerosInFactorial();
            System.out.println("Using Loop Method: " + obj.traillingZerosInFact(n));
            System.out.println("Using Efficient Method: " + obj.traillingZerosInFact_II(n));
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            input.close();
        }
    }
}
