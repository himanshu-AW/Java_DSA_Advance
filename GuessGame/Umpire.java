public class Umpire {
    private int guessNumByComp;
    private int guessNumByPlayer1;
    private int guessNumByPlayer2;
    private int min,max;

    public Umpire(int min,int max) {
        this.min = min;
        this.max = max;
    }

    public void guessNumByComp(){
        ComputerGuess comp = new ComputerGuess();
        guessNumByComp = comp.guessingNum(min,max);
    }
    public void guessNumByPlayer(){
        Player p1 = new Player();
        guessNumByPlayer1 = p1.guessingNum(min, max);

        Player p2 = new Player();
        guessNumByPlayer2 = p2.guessingNum(min, max);
    }

    public void compare(){ 
         
        // while(guessNumByComp != guessNumByPlayer1 || guessNumByComp != guessNumByPlayer2){
            if(guessNumByComp == guessNumByPlayer1 ){
                if(guessNumByComp == guessNumByPlayer2){
                    System.out.println("Congratulation! Player1 & Player2 guessed correct number : " + guessNumByComp);
                }else{
                    System.out.println("Congratulation! Player1 guessed correct number : " + guessNumByPlayer1);
                }
            }else if(guessNumByComp == guessNumByPlayer2){
                System.out.println("Congratulation! Player2 guessed correct number : " + guessNumByPlayer2);
            }else{
                System.out.println("Wrong! Number guessed.");
            }
            // guessNumByPlayer();
        // }
    }

}
