import java.util.Scanner;

public class GuessGameApp {
    
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter range:");
        int min = scan.nextInt();
        int max = scan.nextInt();

        Umpire obj = new Umpire(min, max);
        obj.guessNumByComp();
        obj.guessNumByPlayer();
        obj.compare();

        scan.close();
    }
}
