package July9;

import java.util.Scanner;

public class T4_Nested_Try {
    public static void main(String[] args) {
        String a = args[0];
        int b = Integer.parseInt(a);
        int c = 50;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to divide");
        int d = s.nextInt();
        try {
            int e = b / d;
            System.out.println(e);
            try {
                String h = args[1];
                int f = Integer.parseInt(h);
                int g = f / d;
            } catch (ArrayIndexOutOfBoundsException ef) {
                System.out.println("Error Message is " + ef);
            }
        } catch (ArithmeticException ex) {
            System.out.println("Error Message is " + ex);
        }
    }
}