package June12;

public class Lab005Age {
    public static void main(String[] args) {
        String Name = "Pramod";
        int age = 65;
        String val = age < 18 ? "Minor" : (age > 65 ? "Senior" : "Adult");
        System.out.println("Pramod is " + val);

    }
}
