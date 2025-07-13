package July9;

import java.sql.SQLOutput;

public class T9_Try_Without_Exception {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        try {
            int c = a / b;
            System.out.println("Divided value is " + c);
        } catch (Exception e) {
            System.out.println("Exception. cannot proceed further");
        }
        System.out.println("Thanks");
    }
}