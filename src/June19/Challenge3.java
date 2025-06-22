package June19;

public class Challenge3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        boolean result = a==b;
        System.out.println("a==b: " + result);
        boolean result1 = a>b;
        System.out.println("a>b: " + result1);
        boolean result2 = a<b;
        System.out.println("a<b: " + result2);
        boolean result3= (a>b) && (a>0);
        System.out.println("(a>b) && (a>0): " + result3);
        boolean result4 = (a < b) || (a > 0);
        System.out.println("(a < b) || (a > 0): " + result4);
        boolean result5 = !(a>b);
        System.out.println("!(a > b): " + result5);
    }
}
