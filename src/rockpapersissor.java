import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Random;
public class rockpapersissor {
    public static void main(String[] args) {

        int cwin = 0, hwin = 0, tie = 0;
        Random random = new Random();
        int x = random.nextInt(3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Sissor game");
        System.out.println("Enter the number of tries you want");
        System.out.println("RULES");
        System.out.println("Enter 0 for Rock, 1 for paper, 2 for Sissors");

        int n = sc.nextInt();
        for (int m = n; m > 0; m--) {
            int p = random.nextInt(3);
            System.out.println("Enter your choice");
            int c = sc.nextInt();
            if (p == 0 && c == 1) {
                System.out.println("You chose Rock The computer chose paper");
                System.out.println("Computer won! Try again");
                cwin++;

            } else if (p == 0 && c == 2) {
                System.out.println("You chose Rock The computer chose scissor");
                System.out.println("You won");
                hwin++;
            } else if (p == 0 && c == 0) {
                System.out.println("You chose Rock The computer chose rock");
                System.out.println("It's a tie");
                hwin++;
            } else if (p == 1 && c == 0) {
                System.out.println("You chose paper The computer chose rock");
                System.out.println("You won");
                hwin++;
            } else if (p == 1 && c == 2) {
                System.out.println("You chose paper The computer chose sissor");
                System.out.println("Computer won! Try again");
                cwin++;
            } else if (p == 1 && c == 1) {
                System.out.println("You chose paper The computer chose paper");
                System.out.println("It's a tie");
                tie++;
            } else if (p == 2 && c == 0) {
                System.out.println("You chose scissor The computer chose rock");
                System.out.println("Computer won! Try again");
                cwin++;
            } else if (p == 2 && c == 1) {
                System.out.println("You chose scissor The computer chose paper");
                System.out.println("You won");
                hwin++;
            } else if (p == 2 && c == 2) {
                System.out.println("You chose scissor The computer chose sissor");
                System.out.println("Its a tie");
                tie++;
            }
        }
            System.out.printf("You won %d times\n", hwin);
            System.out.printf("Computer won %d times\n", cwin);
            System.out.printf("It was a tie %d times", tie);

    }
}
