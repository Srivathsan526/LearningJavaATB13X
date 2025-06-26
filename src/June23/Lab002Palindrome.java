package June23;

import java.util.Scanner;

public class Lab002Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string to check the Palindrome function");
        String input = sc.next();
        String inputReverse = reversedInput(input);
        if(input.toLowerCase().equals(inputReverse.toLowerCase())){
            System.out.println(input + " word is a palindrome word");
        }else{
            System.out.println(input + " word is not a palindrome word");
        }

    }
    static String reversedInput(String input){
        String reversed = "";
        for(int i = input.length()-1; i>=0; i--){
            reversed = reversed + input.charAt(i);

        }
        return reversed;
    }
}
