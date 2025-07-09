package July8;

public class T1_Boxing_Unboxing {
    public static void main(String[] args) {
        int a = 50;
        System.out.println("Primitive: " + a);
        Integer b = a;
        System.out.println("Wrapper: " + b);
        int c = b;
        System.out.println("Unboxed again: " + c);

    }
}
