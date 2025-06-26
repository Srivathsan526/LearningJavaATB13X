package June24;
//ThreadSafe
public class Lab001StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println(sb.append(" World"));
        System.out.println(sb.substring(2,6));
    }
}
