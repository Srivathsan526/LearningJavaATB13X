package June13;

import javax.swing.*;
import java.util.Scanner;

public class Lab003If {
    public static void main(String[] args) {
        System.out.println("Enter the Age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age < 18){
            System.out.println("You are not allowed to Vote");
        }else {
            System.out.println("You are allowed to Vote");
        }
    }
}
