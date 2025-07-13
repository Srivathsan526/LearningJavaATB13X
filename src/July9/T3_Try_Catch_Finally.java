package July9;

import java.util.Scanner;

public class T3_Try_Catch_Finally {
    public static void main(String[] args) {
        int a = 986;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to divide");
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println("Number 986 divided by entered value is " + c);
        } catch (ArithmeticException e) {
            System.out.println("Any number cannot be divided by zero");
        } finally {
            System.out.println("Calculation completed successfully. Please Re-run");
        }
    }
}