package July9;

public class T2_Multiple_Catch {
    public static void main(String[] args) {
        Integer c = 0;
        try {
            String a = args[0];
            int b = Integer.parseInt(a);
            int d = b / c;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error Message is " + e);
        }
    }
}