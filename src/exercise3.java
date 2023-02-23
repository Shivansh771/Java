import java.util.Random;
import java.util.Scanner;

class game{
    public int random;
    public game(){
        Random rand=new Random();
        random=rand.nextInt(100);


    }
    int noOfGuesses=1;
    public int takeuserinput(){
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }
    public boolean isCorrectNumber(int x,int y){
        return y == x;
    }

    public void setNoOfGuesses(int x,int y) {
        if (!isCorrectNumber(x, y)) {
            noOfGuesses += 1;
        }

        }
        public int getNoOfGuesses(){
        return noOfGuesses;
        }

    }


public class exercise3
{
    public static void main(String[] args) {
        System.out.println("Welcome to Guess The number game");
        game game = new game();
        int ran = game.random;
        System.out.println("Enter Your choice");
        System.out.println(ran);
        boolean b = false;
        while (!b) {
            int user = game.takeuserinput();

            if (game.isCorrectNumber(ran, user)) {
                System.out.printf("You Got the correct number in %d tries", game.noOfGuesses);
                b = true;

            } else if (ran > user) {
                System.out.println("You chose a smaller number than the selected");
                game.setNoOfGuesses(ran, user);

            } else if (ran < user) {
                System.out.println("Your choice is greater than the selected number");
                game.setNoOfGuesses(ran, user);
            }

        }
    }}

