package June12;

public class Lab001 {
    public static void main(String[] args) {
        byte b = 8;
        int a = b; // Widening
        System.out.println(a);

        int c = 26;
        byte d = (byte)c; //Narrowing -- While narrowing we have to to explicitly mention the data type in the bracket in RHS
        System.out.println(d);

    }
}
