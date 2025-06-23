package June23;

import java.util.Scanner;

public class TaskQA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word to check whether it's a palindrome");
        String word = scanner.next();

        if(isPalindrome(word)){
            System.out.println(("Yes"));
        }
    }
}
