
// Guesser class to generate a random number between a given range
public class ComputerGuess{
    private int guessNum;

    public int guessingNum(int min,int max) {
        guessNum = (int) (Math.random()*(max-min+1))+min;
        return guessNum;
    }
   
}
