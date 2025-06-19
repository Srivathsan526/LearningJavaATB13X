package June18;

import java.util.Scanner;

public class Lab003Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the character to check vowels or no");
        char UserInput1 = scanner.next().toLowerCase().charAt(0);



        switch(UserInput1){
            case'a','e','i','o','u' -> System.out.println("Entered character " + UserInput1 + " is a vowel character");
            default -> System.out.println("Entered character " + UserInput1 + " is not a vowel character");
        }

    }
}
