package June17;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int NumberToGuess = random.nextInt(101);
        System.out.println(NumberToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please guess the number from 0 to 100");


        int guess;
        int attempts = 0;

        while(true) {
            if(!scanner.hasNextInt()){
                System.out.println("Please enter a  number between 0 to 100");
                attempts++;
                scanner.next();
                continue;
            }

            guess = scanner.nextInt();
            attempts++;
            if(guess < 0 || guess > 100){
                System.out.println("Please enter a number between 0 to 100");
            }else if(guess > NumberToGuess){
                System.out.println("Entered Number is higher than the Number to guess, Please try again");
            }else if(guess < NumberToGuess){
                System.out.println("Entered Number is lower than the Number to guess, Please try again");
            }else{
                System.out.println("Congratulations!, You have guessed it right");
                break;
            }



        }
        System.out.println("You have guessed the number in " + attempts + " attempts");

    }
}
