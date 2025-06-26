package June25;

import java.util.Scanner;

public class Lab004UserInputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want to store in the array");
        int size = scanner.nextInt();

        int[] marks = new int[size];
        System.out.println("Please enter " + size + " numbers to be added as marks");
        for(int i = 0; i<size; i++){
            System.out.println("Please enter marks " + (i+1) + ":");
            marks[i] = scanner.nextInt();
        }

        System.out.println("Below are the marks you entered. Thanks !");
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

    }
}