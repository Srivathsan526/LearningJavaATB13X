package June18;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the character to check vowels or no");
        char UserInput = scanner.next().toLowerCase().charAt(0);


        if(UserInput ==  'a' || UserInput == 'e' || UserInput == 'i' || UserInput == 'o' || UserInput == 'u' ){
            System.out.println("Entered character is a vowel letter");
        }else if(UserInput >= 'a' && UserInput <= 'z'){
            System.out.println("Entered character is a NOT vowel letter");
        }else{
            System.out.println("Please enter a valid character");
        }




    }
}
