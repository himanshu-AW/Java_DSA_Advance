import java.util.Scanner;

public class CountDigit{
    int countDigits(int n){
        int count =0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
    int countDigitsRecursion(int n){
        if(n==0){
            return 0;
        }
        return 1+countDigitsRecursion(n/10);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            CountDigit obj = new CountDigit();
            System.out.println(num+" have "+obj.countDigits(num)+" digits");
            System.out.println(num+" have "+obj.countDigitsRecursion(num)+" digits");
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            input.close();
        }

    }
}