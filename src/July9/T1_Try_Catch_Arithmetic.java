package July9;

public class T1_Try_Catch_Arithmetic {
    public static void main(String[] args) {
        int a = 0;
        try {
            int b = 10 / a;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. Please update the value of (a)");
        }
    }
}