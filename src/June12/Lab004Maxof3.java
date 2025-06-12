package June12;

public class Lab004Maxof3 {
    public static void main(String[] args) {
        int n1 = 5643;
        int n2 = 97654;
        int n3 = 2567;

        int output = ((n1 > n2) && (n1 > n3)) ? n1 : (n2>n3)?n2:n3;
        System.out.println("Maximum Number among the three is " + output);

    }
}
