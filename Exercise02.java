
import java.util.Random;
import java.util.Scanner;

// Create a Game Rock, Paper & seccors. 
public class Exercise02 {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for paper
        // 2 for Scessors

        Scanner sc = new Scanner(System.in);
        System.out.println("***Enter your Choice***");
        System.out.println("\t\t 0 for Rock ");
        System.out.println("\t\t 1 for Paper ");
        System.out.println("\t\t 2 for Sessosrs ");
        int userInput = sc.nextByte();

        // genarate Random number by computer
        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("\t Draw Match !");
        } else if ((userInput == 0) && (computerInput == 2) || (userInput == 1) && (computerInput == 0)
                || (userInput == 2) && (computerInput == 1)) {
            System.out.println("\t You Won the game !");
        } else {
            System.out.println("\t Computer won the game");
        }

        // System.out.println("computer choice is "+computerInput);

        if (computerInput == 0) {
            System.out.println("Computer choice: Rock");
        } else if (computerInput == 1) {
            System.out.println("Computer choice: Paper");
        } else if (computerInput == 2) {
            System.out.println("Computer choice: Scissors");
        }

        sc.close();
    }
}
