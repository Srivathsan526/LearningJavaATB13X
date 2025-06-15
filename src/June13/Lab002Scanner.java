package June13;

import java.util.Scanner;

public class Lab002Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");

        int age = scanner.nextInt();
        String CanIVote = age >=18 ? "Yes" : "No";
        System.out.println(CanIVote);
    }
}
