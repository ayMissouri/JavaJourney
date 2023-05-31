import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        boolean gameContinue = true;
        int randomNumber = rand.nextInt(100) + 1;
        while (gameContinue) {
            System.out.println("Enter a guess:");
            int guess = scan.nextInt();
            if (guess < randomNumber) {
                System.out.println("Guess too low!");
            } else if (guess > randomNumber) {
                System.out.println("Guess to high!");
            } else {
                System.out.println("That is the correct number!");
                gameContinue = false;
            }
        }
    }
}