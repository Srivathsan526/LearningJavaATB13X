package July9;

public class T5_Exception {
    public static void main(String[] args) {
        String abc = null;
        try {
            abc.trim();
        } catch (Exception e) {
            System.out.println("Error Message is " + e.getClass().getSimpleName());
        }
    }
}