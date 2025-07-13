package July9;

import java.util.Scanner;

public class T8_Manual_Throw_Arithmetic_Exception {
    public static void main(String[] args) {
        int a = 10;
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the number to check the divisible operation");
        int b = c.nextInt();
        if (b == 0) {
            throw new ArithmeticException("Error! Entered value is zero. Not applicable for Divide function.");
        } else {
            int d = b / a;
            System.out.println("Divided value is " + d);
        }
        c.close();
    }
}