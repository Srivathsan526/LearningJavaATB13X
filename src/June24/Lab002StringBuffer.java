package June24;

public class Lab002StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hi");
        System.out.println(sb);
        System.out.println(sb.append(" There!"));
        System.out.println(sb.substring(2, 5));
    }
}
