package June17;

import java.util.Random;
import java.util.Scanner;

public class Lab003 {
    public static void main(String[] args) {
        Random random = new Random();
        int NumToGuess = random.nextInt(101);
        System.out.println("Please enter a number between 0 to 100");

        int guess1;
        int attempts1 = 0;

        Scanner scanner = new Scanner(System.in);


        while (true) {
            guess1 = scanner.nextInt();
            attempts1++;
            if(guess1 < 0 || guess1 > 100){
                System.out.println("Please enter a number");
            }else if(guess1 > NumToGuess){
                System.out.println("Entered Number is higher than the Number to guess, Please try again");
            }else if(guess1 < NumToGuess){
                System.out.println("Entered Number is lower than the Number to guess, Please try again");
            }else {
                System.out.println("Congratulations!, You have guessed it right");
                break;
            }

        } System.out.println("You have guessed the number in " + attempts1 + " attempts");
    }
}
