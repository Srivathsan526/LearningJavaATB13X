package June18;

import java.util.Scanner;

public class Task2GradeCalculator {
    public static void main(String[] args) {
        /*
        Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the mark to know the grade");


        if(!scanner.hasNextInt()){
            System.out.println("Please enter a valid number to check");
           return;
        }
        float grade = scanner.nextFloat();

        if(grade >= 90 && grade <= 100){
            System.out.println(grade + " is A Grade");
        }else if(grade >= 80 && grade <= 89){
            System.out.println(grade + " is B Grade");
        }else if(grade >= 70 && grade <= 79) {
            System.out.println(grade + " is C Grade");
        }else if(grade >= 60 && grade <= 69) {
            System.out.println(grade + " is D Grade");
        }else if(grade >= 0 && grade <= 59){
            System.out.println("Grade is F");
        }else{
            System.out.println("Please enter a number range within 0 to 100");

        }


    }
}
