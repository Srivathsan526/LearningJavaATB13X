package June13;

public class Lab001ParametersFromConfig {
    public static void main(String[] args) {
        String age1 = args[0];
        int age = Integer.parseInt(age1);
        String CanIVote = age > 18 ? "Yes" : "No";
        System.out.println(CanIVote);
    }
}
