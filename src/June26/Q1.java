package June26;

public class Q1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1 = s1.concat(" World");
        System.out.println("Updated word is " + s1);
        System.out.println("Length:  " + s1.length());
        System.out.println("First char: " + s1.charAt(0));
        System.out.println("Substring: " + s1.substring(6, 11));
    }
}
