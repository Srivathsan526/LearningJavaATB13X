package July8;

public class T5_Comparing_Two_Wrappers {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 10;
        Integer c = 128;
        Integer d = 128;
        Boolean eq1 = (a==b);
        System.out.println("a==b: " + eq1);
        Boolean eq2 = (c==d);
        System.out.println("c==d: " + eq2);
        Boolean eq3 = (a.equals(b));
        System.out.println("a.equals(b): " + eq3);
        Boolean eq4 = (c.equals(d));
        System.out.println("c.equals(d): " + eq4);
    }
}
