package July9;

public class T10_Try_Multiple {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 2;
        int d = 5;
        try {
            int f = a / b;
            int g = a / c;
            int h = d / b;
            int i = c / d;
        } catch (Exception e) {
            System.out.println("Error is " + e.getClass().getSimpleName());
        }
    }
}