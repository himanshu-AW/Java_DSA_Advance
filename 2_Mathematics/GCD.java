import java.util.Scanner;

public class GCD {
    int calculateGCD(int n1, int n2){ // TC: O(min(n1,n2))
        int res = Math.min(n1, n2);

        while(res>0){
            if(n1%res == 0 && n2%res ==0){
                break;
            }
            res--;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.println("Enter two numbers: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            
            GCD obj = new GCD();
            System.out.println("Result:" +obj.calculateGCD(num1, num2));
            
        } catch (Exception e) {
           e.printStackTrace();
        }
        finally{
            input.close();
        }
    }
}
