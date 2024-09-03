import java.util.Scanner;

public class PalindromeNum {
    
    boolean isPalindrome(int num){
        int rev=0;
        int temp = num;
        while(temp!=0){
            rev = rev*10+temp%10;
            temp = temp/10;
        }
        return (num == rev);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter A Number: ");
            int num = input.nextInt();

            PalindromeNum obj = new PalindromeNum();
            if(obj.isPalindrome(num)){
                System.out.println(num+" is Palindrome Number");
            }
            else{
                System.out.println(num+" Not a Palindrome Number");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            input.close();
        }
    }
}
