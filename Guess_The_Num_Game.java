import java.util.Random;
import java.util.Scanner;
class Game1 {
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;
    public int getNoOfGuesses(){                   
        return noOfGuesses;                        
    }                                             
public void getNoOfGuesses(int noOfGuesses){         
    this.noOfGuesses = noOfGuesses;               
}                                                     

    // Constructor to generate the Random Number.
    Game1() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }                                                           

    // To take a Number from the user                                     
       void takeUserInput() {              
           System.out.println("Guess The Number...");     
        Scanner sc = new Scanner(System.in);               
        inputNumber = sc.nextInt();                        
        sc.close();
    }

    // Detect the Number which entered by the user is true or flase
    public boolean isCorrectNumber() {
        noOfGuesses++; 
        if (inputNumber == number) {
            System.out.format("Yes you guessed it right, it was %d\nyou guessed it in %d attempts",number,noOfGuesses);
       return true;
        } else if (inputNumber < number) {
            System.out.println("Too low!");
        } else if (inputNumber > number) {
            System.out.println("Too high!");
        } 
        return false;
        }

    }


public class Guess_The_Num_Game {
    public static void main(String[] args) {
        // Create a class Game, which allows a user to play "Guess the Number" game
        // once.

        // Game should have the following methods:
        // Constructor to generate the random number
        // takeUserInput() to take a user input of number
        // isCorrectNumber() to detect whether the number entered by the user is true
        // getter and setter for noOfGuesses
        // Use properties such as noOfGuesses(int), etc to get this task done!

        Game1 game = new Game1(); // Constructor Automatically invoked
        boolean b= false;
        while(!b){
            // automatic generating random number between 1-100
            game.takeUserInput();
            b = game.isCorrectNumber();
                  
        }
    }
}
