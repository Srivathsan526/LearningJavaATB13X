package July9;

public class T6_Specifc_Generic {
    public static void main(String[] args) {
        String abc = null;
        try {
            abc.trim();
        } catch (NullPointerException e1) {
            System.out.println("Error Message is " + e1.getClass().getSimpleName());
        }
        try {
            abc.trim();
        } catch (Exception e) {
            System.out.println("Error Message is " + e.getClass().getSimpleName());
        }
    }
}