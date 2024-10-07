import java.util.Scanner;

public class Player {
    private int guessNum;

    int guessingNum(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess between " + min + " and " + max + ": ");
        guessNum = scanner.nextInt();
        return guessNum;
    }
}
