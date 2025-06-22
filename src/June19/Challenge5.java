package June19;

public class Challenge5 {
    public static void main(String[] args) {
        int a= 10;
        double b= 3.5;
        int c = (int) (a+a+b);
        System.out.println("Expression result: " + c);
        double d = a+b;
        System.out.println("Implicit Casting : " + d);
        int e = (int)(a+b);
        System.out.println("Explicit Casting : " + e);


    }
}
