package June12;

public class Lab002MaxMin {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = a > b ? a : b; //Ternary Operator  -> "DataType Identifier = Condition ? Yes : No"
        System.out.println("Maximum Number is " + max);
        int min = a < b ? a : b ;
        System.out.println("Minimum number is " + min);
        String val = a > b ? "yes" : "no" ;
        System.out.println("Statement is " + val);
        boolean val1 = b > a ? true : false ;
        System.out.println("Statement is " + val1);


    }
}