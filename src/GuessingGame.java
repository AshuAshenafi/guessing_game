import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int rand1 = rand.nextInt(10) + 1;
        int numberOfTries = 0;
        int guess = 0;

        System.out.println("I am thinking about a number between 1 and 10 ... ");
        System.out.print("Can you guess it? ");


        while(guess != -1){

            numberOfTries++;
            guess = input.nextInt();

            if(guess == -1){}
            
            else if(guess == rand1){
                System.out.println("That's right! You are a good guesser!");
                System.out.println("It took you " + numberOfTries + " tries.");
                guess = -1;
            }
            else if(guess < rand1){
                System.out.println("It is too low. Guess again.");
            }
            else{
                System.out.println("It is too high. Guess again");
            }
        }

    }
}
